package com.training.abstractfactory;

public interface IColor {

	void paint();
}

class Red implements IColor {

	@Override
	public void paint() {
		System.out.println("Car Painting with Red color");
	}

}

class Blue implements IColor {

	@Override
	public void paint() {
		System.out.println("Car Painting with Blue color");

	}

}