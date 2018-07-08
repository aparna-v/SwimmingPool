package com.myteam.swimmingpool;

import com.myteam.swimmingpool.BaseElement;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person extends BaseElement implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.lang.String surname;
	private java.lang.Double age;
	private java.util.Date birthDate;
	private java.math.BigDecimal standardPrice;
	private java.util.List<com.myteam.swimmingpool.Price> priceList  = new java.util.ArrayList<>();

	public Person() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getSurname() {
		return this.surname;
	}

	public void setSurname(java.lang.String surname) {
		this.surname = surname;
	}

	public java.lang.Double getAge() {
		return this.age;
	}

	public void setAge(java.lang.Double age) {
		this.age = age;
	}

	public java.util.Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(java.util.Date birthDate) {
		this.birthDate = birthDate;
	}

	public java.math.BigDecimal getStandardPrice() {
		return this.standardPrice;
	}

	public void setStandardPrice(java.math.BigDecimal standardPrice) {
		this.standardPrice = standardPrice;
	}

	public java.util.List<com.myteam.swimmingpool.Price> getPriceList() {
		return this.priceList;
	}

	public void setPriceList(
			java.util.List<com.myteam.swimmingpool.Price> priceList) {
		this.priceList = priceList;
	}
	
	
    public void addPrice(Price p) {
        this.priceList.add(p);
    }

	public Person(java.lang.String name, java.lang.String surname,
			java.lang.Double age, java.util.Date birthDate,
			java.math.BigDecimal standardPrice,
			java.util.List<com.myteam.swimmingpool.Price> priceList) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.birthDate = birthDate;
		this.standardPrice = standardPrice;
		this.priceList = priceList;
	}

}