package com.training.mvc;

public class StartView {
	public void printEmployee(Employee employee) {
		System.out.println("*****************************************************************");
		System.out.println("Employee Id " + employee.getEmpId());
		System.out.println("Employee Name " + employee.getEmpName());
		System.out.println("*****************************************************************");
	}
}
