package com.myteam.swimmingpool;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CalculatedAttribute implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer integerValue;
	private java.lang.Boolean booleanValue;
	private java.math.BigDecimal bigDecimalValue;
	private java.lang.String className;
	private java.lang.String stringValue;
	private java.lang.String key;

	public CalculatedAttribute() {
	}

	public java.lang.Integer getIntegerValue() {
		return this.integerValue;
	}

	public void setIntegerValue(java.lang.Integer integerValue) {
		this.integerValue = integerValue;
	}

	public java.lang.Boolean getBooleanValue() {
		return this.booleanValue;
	}

	public void setBooleanValue(java.lang.Boolean booleanValue) {
		this.booleanValue = booleanValue;
	}

	public java.math.BigDecimal getBigDecimalValue() {
		return this.bigDecimalValue;
	}

	public void setBigDecimalValue(java.math.BigDecimal bigDecimalValue) {
		this.bigDecimalValue = bigDecimalValue;
	}

	public java.lang.String getClassName() {
		return this.className;
	}

	public void setClassName(java.lang.String className) {
		this.className = className;
	}

	public java.lang.String getStringValue() {
		return this.stringValue;
	}

	public void setStringValue(java.lang.String stringValue) {
		this.stringValue = stringValue;
	}

	public java.lang.String getKey() {
		return this.key;
	}

	public void setKey(java.lang.String key) {
		this.key = key;
	}

	public CalculatedAttribute(java.lang.Integer integerValue,
			java.lang.Boolean booleanValue,
			java.math.BigDecimal bigDecimalValue, java.lang.String className,
			java.lang.String stringValue, java.lang.String key) {
		this.integerValue = integerValue;
		this.booleanValue = booleanValue;
		this.bigDecimalValue = bigDecimalValue;
		this.className = className;
		this.stringValue = stringValue;
		this.key = key;
	}

}