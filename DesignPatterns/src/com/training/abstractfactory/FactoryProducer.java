package com.training.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryName) {
		// if this method is made static the every time instance is created,it is loaded
		// in the heap ehich would run costly.these kind of methods are called resource
		// intensive.
		if (factoryName.equals("vehicle")) {
			return new VehicleFactory();
		} else if (factoryName.equals("color")) {
			return new ColorFactory();
		}
		return null;
	}
}
