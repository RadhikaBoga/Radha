package com.ojas.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ojas.pojo.Customer;

public class Daocls {
	
	private JdbcTemplate template;
	
	public Daocls() {
		// TODO Auto-generated constructor stub
	}

	public Daocls(JdbcTemplate template) {
		super();
		this.template = template;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	public void save(Customer cust) {
		String query="insert into customer(custId,custName,contact) values ("+cust.getCustomerId()+","+cust.getCustomerName()+","+cust.getContact()+")";
		template.update(query);
	}
	
	public String delete() {
		
		return "deleted";
	}
	
}
