package com.training.facade;

public class FacadeCar {
	private HatchBack hatchBack;
	private Sedan sedan;
	private SUV suv;

	public FacadeCar() {
		// TODO Auto-generated constructor stub
		this.hatchBack = new HatchBack();
		this.sedan = new Sedan();
		this.suv = new SUV();
	}

	public void hatchBackerDriver() {
		hatchBack.drive();

	}

	public void sedanDrive() {
		sedan.drive();

	}

	public void suvDrive() {
		suv.drive();

	}
}
