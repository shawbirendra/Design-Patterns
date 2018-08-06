package com.training.abstractfactory;

public class Client {
	public static void main(String[] args) {
		AbstractFactory factories = FactoryProducer.getFactory("vehicle");

		IVehicle fordCar = factories.getVehicle("car");
		
		fordCar.move();
		fordCar.speed(120);
		fordCar.paintVehicle("blue").paint();;

		IVehicle manTruck = factories.getVehicle("truck");
		manTruck.move();
		manTruck.speed(50);

		IColor redColor = FactoryProducer.getFactory("color").getColor("red");
		redColor.paint();

	}
}
