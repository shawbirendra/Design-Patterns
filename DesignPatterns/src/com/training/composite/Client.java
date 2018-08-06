package com.training.composite;

public class Client {
	public static void main(String[] args) {
		Customer customer1 = new Customer(101, "Birendra");
		Customer customer2 = new Customer(101, "Lohith");
		Customer customer3 = new Customer(101, "Ramana");
		Customer customer4 = new Customer(101, "Tejash");
		Customer customer5 = new Customer(101, "Kavitha");
		Customer customer6 = new Customer(101, "Ravi");
		Customer customer7 = new Customer(101, "Divya");

		customer1.addReference(customer2);
		customer1.addReference(customer3);
		customer1.addReference(customer4);

		customer2.addReference(customer5);
		customer2.addReference(customer6);

		customer4.addReference(customer7);
		
		System.out.println("print all customer reference tree");
		System.out.println("---------------"+customer1.getCustName()+"'s Reference----------------");
		
		for(Customer temp:customer1.getReferences()) {
			System.out.println(temp.getCustId()+", "+temp.getCustName());
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println("---------------"+customer1.getCustName()+"'s Reference---Aftre Remove of "+customer2.getCustName()+"-------------");
		customer1.removeReference(customer2);
		for(Customer temp:customer1.getReferences()) {
			System.out.println(temp.getCustId()+", "+temp.getCustName());
		}
		
	}
}
