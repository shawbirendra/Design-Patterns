package com.training.facade;

public class Client {
	public static void main(String[] args) {
		FacadeCar car = new FacadeCar();
		car.hatchBackerDriver();

		car.sedanDrive();

		car.suvDrive();
	}
}
