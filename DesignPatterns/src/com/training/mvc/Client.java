package com.training.mvc;

public class Client {
	public static void main(String[] args) {
		// this comes from DB or external resources
		Employee employee = retrieve();
		StartView startView = new StartView();
		EmployeeController controller = new EmployeeController(employee, startView);
		controller.updateView("star");
	}

	private static Employee retrieve() {
		return new Employee(101, "Divya");
	}
}
