package com.myteam.swimmingpool;

import com.myteam.swimmingpool.BaseElement;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Period extends BaseElement implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.Date desiredStartDate;
	private java.lang.String seasonType;

	public Period() {
	}

	public java.util.Date getDesiredStartDate() {
		return this.desiredStartDate;
	}

	public void setDesiredStartDate(java.util.Date desiredStartDate) {
		this.desiredStartDate = desiredStartDate;
	}

	public java.lang.String getSeasonType() {
		return this.seasonType;
	}

	public void setSeasonType(java.lang.String seasonType) {
		this.seasonType = seasonType;
	}

	public Period(java.util.Date desiredStartDate, java.lang.String seasonType) {
		this.desiredStartDate = desiredStartDate;
		this.seasonType = seasonType;
	}

}