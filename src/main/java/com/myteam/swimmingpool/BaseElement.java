package com.myteam.swimmingpool;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BaseElement implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.List<com.myteam.swimmingpool.CalculatedAttribute> calculatedAttributeList;

	public BaseElement() {
	}

	public java.util.List<com.myteam.swimmingpool.CalculatedAttribute> getCalculatedAttributeList() {
		return this.calculatedAttributeList;
	}

	public void setCalculatedAttributeList(
			java.util.List<com.myteam.swimmingpool.CalculatedAttribute> calculatedAttributeList) {
		this.calculatedAttributeList = calculatedAttributeList;
	}

	public BaseElement(
			java.util.List<com.myteam.swimmingpool.CalculatedAttribute> calculatedAttributeList) {
		this.calculatedAttributeList = calculatedAttributeList;
	}

}