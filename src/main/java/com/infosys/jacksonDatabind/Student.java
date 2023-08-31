package com.infosys.jacksonDatabind;

public class Student {

	String name;
	int roll;
	String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int roll, String address) {
		super();
		this.name = name;
		this.roll = roll;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", address=" + address + "]";
	}

}
