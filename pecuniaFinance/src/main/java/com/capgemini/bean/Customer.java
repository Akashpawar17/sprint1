package com.capgemini.bean;

import java.time.LocalDate;

public class Customer {


	

	
		private String address1;
		private String address2;
		private String customerCity;
		private String customerState;
		private String customerCountry;
		private int customerPincode;
		private String customerName;
		private long customerContact;
		private long customerAadhar;
		private String customerPan;
		private String customerGender;
		private LocalDate date;
		public Customer(String address1, String address2, String customerCity, String customerState, String customerCountry,
				int customerPincode, String customerName, long customerContact, long customerAadhar, String customerPan,
				String customerGender, LocalDate date) {
			super();
			this.address1 = address1;
			this.address2 = address2;
			this.customerCity = customerCity;
			this.customerState = customerState;
			this.customerCountry = customerCountry;
			this.customerPincode = customerPincode;
			this.customerName = customerName;
			this.customerContact = customerContact;
			this.customerAadhar = customerAadhar;
			this.customerPan = customerPan;
			this.customerGender = customerGender;
			this.date = date;
		}
		public Customer() {
			super();
		}
		public String getAddress1() {
			return address1;
		}
		public void setAddress1(String address1) {
			this.address1 = address1;
		}
		public String getAddress2() {
			return address2;
		}
		public void setAddress2(String address2) {
			this.address2 = address2;
		}
		public String getCustomerCity() {
			return customerCity;
		}
		public void setCustomerCity(String customerCity) {
			this.customerCity = customerCity;
		}
		public String getCustomerState() {
			return customerState;
		}
		public void setCustomerState(String customerState) {
			this.customerState = customerState;
		}
		public String getCustomerCountry() {
			return customerCountry;
		}
		public void setCustomerCountry(String customerCountry) {
			this.customerCountry = customerCountry;
		}
		public int getCustomerPincode() {
			return customerPincode;
		}
		public void setCustomerPincode(int customerPincode) {
			this.customerPincode = customerPincode;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public long getCustomerContact() {
			return customerContact;
		}
		public void setCustomerContact(long customerContact) {
			this.customerContact = customerContact;
		}
		public long getCustomerAadhar() {
			return customerAadhar;
		}
		public void setCustomerAadhar(long customerAadhar) {
			this.customerAadhar = customerAadhar;
		}
		public String getCustomerPan() {
			return customerPan;
		}
		public void setCustomerPan(String customerPan) {
			this.customerPan = customerPan;
		}
		public String getCustomerGender() {
			return customerGender;
		}
		public void setCustomerGender(String customerGender) {
			this.customerGender = customerGender;
		}
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
		}
		@Override
		public String toString() {
			return "Customer [address1=" + address1 + ", address2=" + address2 + ", customerCity=" + customerCity
					+ ", customerState=" + customerState + ", customerCountry=" + customerCountry + ", customerPincode="
					+ customerPincode + ", customerName=" + customerName + ", customerContact=" + customerContact
					+ ", customerAadhar=" + customerAadhar + ", customerPan=" + customerPan + ", customerGender="
					+ customerGender + ", date=" + date + "]";
		}
		
		
		

	}

	
	
	


