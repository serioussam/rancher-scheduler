package org.paggarwal.rancherscheduler.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.jooq.*;
import org.jooq.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;
import org.springframework.jdbc.support.SQLExceptionTranslator;
import org.springframework.jdbc.support.SQLStateSQLExceptionTranslator;
import org.springframework.transaction.PlatformTransactionManager;

import javax.inject.Inject;
import java.sql.SQLException;

/**
 * Created by paggarwal on 2/29/16.
 */
@Configuration
public class DBConfig {
    @Value("#{ systemEnvironment['DATABASE_URL'] ?: 'jdbc:mysql://localhost:3306/rancherscheduler' }")
    private String dbUrl;

    @Value("#{ systemEnvironment['DATABASE_USERNAME'] ?: 'dev' }")
    private String dbUsername;

    @Value("#{ systemEnvironment['DATABASE_PASSWORD'] ?: 'dev' }")
    private String dbPassword;

    @Value("#{ systemEnvironment['DATABASE_POOL_INITIAL_SIZE'] ?: 2 }")
    private int dbInitialSize;

    @Value("#{ systemEnvironment['DATABASE_POOL_MAX_ACTIVE'] ?: 30 }")
    private int dbMaxActive;

    @Value("#{ systemEnvironment['DATABASE_POOL_MAX_IDLE'] ?: 5 }")
    private int dbMaxIdle;

    @Value("#{ systemEnvironment['DATABASE_POOL_MIN_IDLE'] ?: 2 }")
    private int dbMinIdle;

    @Value("#{ systemEnvironment['DATABASE_EVICTION_RUN_MILLIS'] ?: 5000 }")
    private int dbEvictionTimeMillis;

    @Value("#{ systemEnvironment['DATABASE_EVICTABLE_IDLE_MILLIS'] ?: 60000 }")
    private int dbEvictableIdleMillis;

    @Value("#{ systemEnvironment['DATABASE_VALIDATION_INTERVAL'] ?: 30000 }")
    private int dbValidationInterval;

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUsername);
        dataSource.setPassword(dbPassword);
        dataSource.setInitialSize(dbInitialSize);
        dataSource.setMaxActive(dbMaxActive);
        dataSource.setMaxIdle(dbMaxIdle);
        dataSource.setMaxWait(dbMinIdle);
        dataSource.setTimeBetweenEvictionRunsMillis(dbEvictionTimeMillis);
        dataSource.setMinEvictableIdleTimeMillis(dbEvictableIdleMillis);
        dataSource.setValidationInterval(dbValidationInterval);
        dataSource.setTestOnBorrow(true);
        dataSource.setValidationQuery("/* ping */ SELECT 1");
        dataSource.setTestWhileIdle(true);
        return dataSource;
    }

    @Bean
    @Inject
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

    @Bean
    @Inject
    public org.jooq.Configuration jooqConfig(DataSource dataSource) {
        return new DefaultConfiguration()
                .set(SQLDialect.MYSQL)
                .set(new DataSourceConnectionProvider(new TransactionAwareDataSourceProxy(dataSource)))
                .set(new DefaultExecuteListenerProvider(new DefaultExecuteListener() {
            @Override
            public void exception(ExecuteContext ctx) {
                SQLException e = ctx.sqlException();

                if (e != null) {
                    SQLDialect             dialect    = ctx.configuration().dialect();
                    SQLExceptionTranslator translator = (dialect != null)
                            ? new SQLErrorCodeSQLExceptionTranslator(dialect.name())
                            : new SQLStateSQLExceptionTranslator();

                    ctx.exception(translator.translate("jOOQ", ctx.sql(), e));
                }
            }
        }));
    }

    @Bean
    @Inject
    public DSLContext dsl(org.jooq.Configuration jooqConfig) {
        return new DefaultDSLContext(jooqConfig);
    }
}
