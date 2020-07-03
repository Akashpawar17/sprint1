package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Customer;
import com.capgemini.dao.DaoAccountImp;

public class ServiceAccountImp implements IServiceAccount {


		DaoAccountImp dao = new DaoAccountImp();

		public  List<Customer> createAccount(Customer c) {
			// TODO Auto-generated method stub
			return dao.createAccount(c);
			
		}
		public static  boolean validAddressLine1(String address1) {
			boolean flag=false;
			if(address1.matches("[a-zA-Z0-9/-]{3,}")) {
				flag=true;
			}
			return flag;
		}

		public static boolean validAddressLine2(String address2) {
			boolean flag=false;
			if(address2.matches("[a-zA-Z0-9/-]{3,}")) {
				flag=true;
			}
			return flag;
		}
		public static boolean validAddressCity(String city) {
			boolean flag=false;
			if(city.matches("[a-zA-Z]{3,}")) {
				flag=true;
			}
			return flag;
		}
		public static boolean validAddressState(String state) {
			boolean flag=false;
			if(state.matches("[a-zA-Z]{3,}")) {
				flag=true;
			}
			return flag;
		}
		public static boolean validAddressCountry(String country) {
			boolean flag=false;
			
			if(country.matches("[a-zA-Z]{3,}")) {
				flag=true;
			}
			return flag;
		}
		public static  boolean validAddressPincode(int pincode) {
			boolean flag=false;
			String str= String.valueOf(pincode);
			if(str.length()==6) {
				flag=true;
			}
			return flag;
		}
			
		
		public static boolean validCustomerName(String cname) {
			boolean flag=false;
			if(cname.matches("[a-zA-Z]{3,}")) {
				flag=true;
			}
			return flag;
		}
		public static boolean validCustomerContact(Long l) {
			boolean flag=false;
			String str= l+"";
			if(str.length()==10) {
				flag=true;
			}
			return flag;
		}
		public static  boolean validCustomerAadhar(Long l) {
			boolean flag=false;
			String str= l+"";
			if(str.length()==12) {
				flag=true;
			}
			return flag;
		}
		public static boolean validCustomerGender(String cgender) {
			boolean flag=false;
			if(cgender.equals("male")||cgender.equals("female")) {
				flag=true;
			}
			return flag;
		}
		public static boolean validCustomerPanNo(String pan) {
			boolean flag=false;
			String str= pan+"";
			if(str.matches("[a-zA-Z]{5}[0-9]{4}[a-zA-Z]")) {
				flag=true;
			}
			return flag;
		}
		public static  boolean userValidation(Customer c) {
			boolean flag=false;
			if(validAddressLine1(c.getAddress1())&&validAddressLine2(c.getAddress2())&&validAddressCity(c.getCustomerCity())&&
					validAddressCountry(c.getCustomerCountry())&&validAddressPincode(c.getCustomerPincode())&&validAddressState(c.getCustomerState())
					&&validCustomerName(c.getCustomerName())
					&&validCustomerContact(c.getCustomerContact())&&validCustomerAadhar(c.getCustomerAadhar())
					&&validCustomerGender(c.getCustomerGender())&&validCustomerPanNo(c.getCustomerPan())) {
				flag=true;
			}
			return flag;
		}
		
	}


