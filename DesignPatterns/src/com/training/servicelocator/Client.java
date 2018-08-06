package com.training.servicelocator;

public class Client {
	public static void main(String[] args) {
		Service dbService = ServiceLocator.getService("db");
		dbService.execute();

		Service dbService2 = ServiceLocator.getService("db");
		dbService2.execute();

		Service dbService3 = ServiceLocator.getService("db");
		dbService3.execute();
		System.out.println("==========for erp===========");
		Service erService = ServiceLocator.getService("erp");
		erService.execute();
	}
}
