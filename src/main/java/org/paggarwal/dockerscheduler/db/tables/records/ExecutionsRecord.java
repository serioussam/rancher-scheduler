/**
 * This class is generated by jOOQ
 */
package org.paggarwal.dockerscheduler.db.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.paggarwal.dockerscheduler.db.tables.Executions;


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
public class ExecutionsRecord extends UpdatableRecordImpl<ExecutionsRecord> implements Record9<Integer, Integer, byte[], byte[], String, Integer, Timestamp, Timestamp, byte[]> {

	private static final long serialVersionUID = -1839029178;

	/**
	 * Setter for <code>dockerscheduler.EXECUTIONS.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dockerscheduler.EXECUTIONS.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>dockerscheduler.EXECUTIONS.task_id</code>.
	 */
	public void setTaskId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dockerscheduler.EXECUTIONS.task_id</code>.
	 */
	public Integer getTaskId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>dockerscheduler.EXECUTIONS.stdout</code>.
	 */
	public void setStdout(byte[] value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dockerscheduler.EXECUTIONS.stdout</code>.
	 */
	public byte[] getStdout() {
		return (byte[]) getValue(2);
	}

	/**
	 * Setter for <code>dockerscheduler.EXECUTIONS.stderr</code>.
	 */
	public void setStderr(byte[] value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dockerscheduler.EXECUTIONS.stderr</code>.
	 */
	public byte[] getStderr() {
		return (byte[]) getValue(3);
	}

	/**
	 * Setter for <code>dockerscheduler.EXECUTIONS.environment_variables</code>.
	 */
	public void setEnvironmentVariables(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dockerscheduler.EXECUTIONS.environment_variables</code>.
	 */
	public String getEnvironmentVariables() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>dockerscheduler.EXECUTIONS.status</code>.
	 */
	public void setStatus(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dockerscheduler.EXECUTIONS.status</code>.
	 */
	public Integer getStatus() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>dockerscheduler.EXECUTIONS.started_on</code>.
	 */
	public void setStartedOn(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dockerscheduler.EXECUTIONS.started_on</code>.
	 */
	public Timestamp getStartedOn() {
		return (Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>dockerscheduler.EXECUTIONS.ended_on</code>.
	 */
	public void setEndedOn(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dockerscheduler.EXECUTIONS.ended_on</code>.
	 */
	public Timestamp getEndedOn() {
		return (Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>dockerscheduler.EXECUTIONS.payload</code>.
	 */
	public void setPayload(byte[] value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dockerscheduler.EXECUTIONS.payload</code>.
	 */
	public byte[] getPayload() {
		return (byte[]) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, byte[], byte[], String, Integer, Timestamp, Timestamp, byte[]> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, byte[], byte[], String, Integer, Timestamp, Timestamp, byte[]> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Executions.EXECUTIONS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Executions.EXECUTIONS.TASK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field3() {
		return Executions.EXECUTIONS.STDOUT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field4() {
		return Executions.EXECUTIONS.STDERR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Executions.EXECUTIONS.ENVIRONMENT_VARIABLES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return Executions.EXECUTIONS.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return Executions.EXECUTIONS.STARTED_ON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return Executions.EXECUTIONS.ENDED_ON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field9() {
		return Executions.EXECUTIONS.PAYLOAD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getTaskId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value3() {
		return getStdout();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value4() {
		return getStderr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getEnvironmentVariables();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getStartedOn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value8() {
		return getEndedOn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value9() {
		return getPayload();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExecutionsRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExecutionsRecord value2(Integer value) {
		setTaskId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExecutionsRecord value3(byte[] value) {
		setStdout(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExecutionsRecord value4(byte[] value) {
		setStderr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExecutionsRecord value5(String value) {
		setEnvironmentVariables(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExecutionsRecord value6(Integer value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExecutionsRecord value7(Timestamp value) {
		setStartedOn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExecutionsRecord value8(Timestamp value) {
		setEndedOn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExecutionsRecord value9(byte[] value) {
		setPayload(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExecutionsRecord values(Integer value1, Integer value2, byte[] value3, byte[] value4, String value5, Integer value6, Timestamp value7, Timestamp value8, byte[] value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ExecutionsRecord
	 */
	public ExecutionsRecord() {
		super(Executions.EXECUTIONS);
	}

	/**
	 * Create a detached, initialised ExecutionsRecord
	 */
	public ExecutionsRecord(Integer id, Integer taskId, byte[] stdout, byte[] stderr, String environmentVariables, Integer status, Timestamp startedOn, Timestamp endedOn, byte[] payload) {
		super(Executions.EXECUTIONS);

		setValue(0, id);
		setValue(1, taskId);
		setValue(2, stdout);
		setValue(3, stderr);
		setValue(4, environmentVariables);
		setValue(5, status);
		setValue(6, startedOn);
		setValue(7, endedOn);
		setValue(8, payload);
	}
}
