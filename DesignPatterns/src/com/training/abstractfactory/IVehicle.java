package com.training.abstractfactory;

public interface IVehicle {

	public void move();

	public void speed(int maxSpeed);

	public IColor paintVehicle(String color);
}

class Car implements IVehicle {

	@Override
	public void move() {
		System.out.println("Car Moving...");
	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("Max speed of car is " + maxSpeed);
	}

	@Override
	public IColor paintVehicle(String color) {
		return new ColorFactory().getColor(color);
	}
}

class Truck implements IVehicle {

	@Override
	public void move() {
		System.out.println("Truck Moving...");
	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("Max speed of truck is " + maxSpeed);

	}

	@Override
	public IColor paintVehicle(String color) {
		return new ColorFactory().getColor(color);
	}

}