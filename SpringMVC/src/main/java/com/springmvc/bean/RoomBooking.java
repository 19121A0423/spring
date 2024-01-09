package com.springmvc.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class RoomBooking {

	private int id;

	@NotEmpty(message = "Name should be not empty")
	private String name;

	private int noOfPersons;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "RoomBooking  name=" + name + ", noOfPersons=" + noOfPersons + "]";
	}

	public RoomBooking() {
		super();
	}

}
