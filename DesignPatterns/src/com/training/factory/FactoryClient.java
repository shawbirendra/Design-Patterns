package com.training.factory;

public class FactoryClient {
	public static void main(String[] args) {
		Car car = null;
		car = Car.getCar(CarName.AUDI);
		car.drive();
	}
}
