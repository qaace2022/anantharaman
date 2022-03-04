package com.banking;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bank {
	private Admin1 admin;
	private String bankName;
	private List<Customers> customers;
	public Admin1 getAdmin() {
		return admin;
	}
	public void setAdmin(Admin1 admin) {
		this.admin = admin;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public List<Customers> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}
}
