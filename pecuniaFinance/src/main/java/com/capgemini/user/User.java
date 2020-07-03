package com.capgemini.user;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.bean.Customer;
import com.capgemini.dao.DaoAccountImp;
import com.capgemini.service.ServiceAccountImp;

public class User {
	
	


	

		public static void main(String[] args)  throws Exception  {
			Scanner scanner = new Scanner(System.in);
			ServiceAccountImp service = new ServiceAccountImp();
			DaoAccountImp dao = new DaoAccountImp();

			Customer customerobject = new Customer();
			boolean done=false;
			do {
		try {
			while (true) {
				System.out.println("****WELCOME TO PECUNIAFINANCE***");
				System.out.println("****CREATING NEW ACCOUNT OF CUSTOMER***");

				System.out.println("1.Adding Customer Details to create New Account");
				System.out.println("2.Exit");
				
				
				int choice = scanner.nextInt();
				switch (choice) {

				case 1:
					System.out.println("please enter customer address1");
					String address1 = scanner.next();
					

					System.out.println("please enter customer address2");
					String address2 = scanner.next();
					

					System.out.println("please enter customer City");
					String city = scanner.next();
					

					System.out.println("please enter customer state");
					String state = scanner.next();
					

					System.out.println("please enter customer country");
					String country = scanner.next();
					

					System.out.println("please enter customer pincode");
					int pincode = scanner.nextInt();
					done=true;
					
				
					System.out.println("please enter customer name");
					String name = scanner.next();
					System.out.println("please enter customer contact");
					long contact = scanner.nextLong();
					System.out.println("please enter customer aadhar");
					long aadhar = scanner.nextLong();
					System.out.println("please enter customer gender");
					String gender = scanner.next();
					System.out.println("please enter customer pan no.");
					String pan = scanner.next();

					customerobject.setAddress1(address1);
					customerobject.setAddress2(address2);
					customerobject.setCustomerCity(city);
					customerobject.setCustomerState(state);
					customerobject.setCustomerCountry(country);
					customerobject.setCustomerPincode(pincode);
					customerobject.setCustomerName(name);
					customerobject.setCustomerContact(contact);
					customerobject.setCustomerAadhar(aadhar);
					customerobject.setCustomerGender(gender);
					customerobject.setCustomerPan(pan);
					
					boolean isValid = ServiceAccountImp.userValidation(customerobject);
					if (isValid == true) {
						List<Customer> create = service.createAccount(customerobject);
						List<Customer> da=dao.createAccount(customerobject);
			 			System.out.println("Customer Account created sucessfully");
						System.out.println(da.toString());
						

					}
					else {
						System.out.println("invalid customer details");
					}

					break;
				case 2:
					System.err.println("customer not intrested in creating account");
				}
				break;
			
			}
		}catch(InputMismatchException e) {
			System.out.println("you did not entered an integer");
			System.out.println("please enter an integer");
		}
			}while(!done);
				
			
			
		}
			
			}

			
	



