package com.training.bridge;

public class Pentagon extends Shape{

	public Pentagon(IColor color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.println("Pentagon is appliance with color ");
		getColor().applyColor();
		
	}

}
