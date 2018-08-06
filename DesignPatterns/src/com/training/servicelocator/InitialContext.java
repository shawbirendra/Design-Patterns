package com.training.servicelocator;

//work for any service
public class InitialContext {
	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("db")) {
			System.out.println("Looking for DB service and crearting");
			return new DBService();
		} if (jndiName.equalsIgnoreCase("erp")) {
			System.out.println("Looking for ERP service and create");
			return new ERPService();
		}
		return null;
	}
}
