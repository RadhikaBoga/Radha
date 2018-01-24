package com.ojas.pojo;

public class Customer {

	private int customerId;
	private String customerName;
	private double contact;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getContact() {
		return contact;
	}
	public void setContact(double contact) {
		this.contact = contact;
	}
	public Customer(int customerId, String customerName, double contact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contact = contact;
	}
	public Customer() {
		super();
	}
	
	
}
