package com.digti.hibernate.servlet.bean;
public class AadharDetails {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getFname() {
		return fname;
	}
	public int getAge() {
		return age;
	}
	public long getPhno() {
		return phno;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getPincode() {
		return pincode;
	}
	public String getEmail() {
		return email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	String fname;
	int age;
	long phno;
	String address;
	String city;
	String state;
	int pincode;
	String email;
}
