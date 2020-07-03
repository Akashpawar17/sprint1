package com.capgemini.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bean.Customer;

public class DaoAccountImp implements  IDaoAccount {
	List<Customer> list = new ArrayList<Customer>();
	boolean flag=false;

	public List<Customer> createAccount(Customer c) {

				list.add(c);
			
				flag=true;
				return list;
			}
	}


