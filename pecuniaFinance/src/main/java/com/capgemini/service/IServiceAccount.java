package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Customer;

public interface IServiceAccount {
	List<Customer> createAccount(Customer c);

}
