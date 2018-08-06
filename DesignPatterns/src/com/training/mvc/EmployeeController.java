package com.training.mvc;

public class EmployeeController {

	private Employee model;
	private StartView startView;

	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}

	// private DashView dashView;
	public Employee getModel() {
		return model;
	}

	public EmployeeController(Employee model, StartView startView) {
		super();
		this.model = model;
		this.startView = startView;
	}

	public void setModel(Employee model) {
		this.model = model;
	}

	public StartView getStartView() {
		return startView;
	}

	public void setStartView(StartView startView) {
		this.startView = startView;
	}

	public void updateView(String viewType) {
		System.out.println("Showing " + viewType + " View");
		startView.printEmployee(model);
	}
}
