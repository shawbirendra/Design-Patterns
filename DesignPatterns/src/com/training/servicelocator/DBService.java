package com.training.servicelocator;

public class DBService implements Service {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "DB SErvice";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("we are executing DB Service");
	}

}
