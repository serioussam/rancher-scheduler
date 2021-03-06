/**
 * This class is generated by jOOQ
 */
package org.paggarwal.dockerscheduler.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.paggarwal.dockerscheduler.db.Dockerscheduler;
import org.paggarwal.dockerscheduler.db.Keys;
import org.paggarwal.dockerscheduler.db.tables.records.QrtzLocksRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QrtzLocks extends TableImpl<QrtzLocksRecord> {

	private static final long serialVersionUID = 500421216;

	/**
	 * The reference instance of <code>dockerscheduler.QRTZ_LOCKS</code>
	 */
	public static final QrtzLocks QRTZ_LOCKS = new QrtzLocks();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<QrtzLocksRecord> getRecordType() {
		return QrtzLocksRecord.class;
	}

	/**
	 * The column <code>dockerscheduler.QRTZ_LOCKS.SCHED_NAME</code>.
	 */
	public final TableField<QrtzLocksRecord, String> SCHED_NAME = createField("SCHED_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_LOCKS.LOCK_NAME</code>.
	 */
	public final TableField<QrtzLocksRecord, String> LOCK_NAME = createField("LOCK_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

	/**
	 * Create a <code>dockerscheduler.QRTZ_LOCKS</code> table reference
	 */
	public QrtzLocks() {
		this("QRTZ_LOCKS", null);
	}

	/**
	 * Create an aliased <code>dockerscheduler.QRTZ_LOCKS</code> table reference
	 */
	public QrtzLocks(String alias) {
		this(alias, QRTZ_LOCKS);
	}

	private QrtzLocks(String alias, Table<QrtzLocksRecord> aliased) {
		this(alias, aliased, null);
	}

	private QrtzLocks(String alias, Table<QrtzLocksRecord> aliased, Field<?>[] parameters) {
		super(alias, Dockerscheduler.DOCKERSCHEDULER, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<QrtzLocksRecord> getPrimaryKey() {
		return Keys.KEY_QRTZ_LOCKS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<QrtzLocksRecord>> getKeys() {
		return Arrays.<UniqueKey<QrtzLocksRecord>>asList(Keys.KEY_QRTZ_LOCKS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzLocks as(String alias) {
		return new QrtzLocks(alias, this);
	}

	/**
	 * Rename this table
	 */
	public QrtzLocks rename(String name) {
		return new QrtzLocks(name, null);
	}
}
