package com.training.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	private List<Service> services;

	public Cache() {
		services = new ArrayList<>();
	}

	public Service getservice(String serviceName) {
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(serviceName)) {
				System.out.println("Returning Cached service " + serviceName + " Object");
				return service;
			}
		}
		return null;
	}

	public void addService(Service newService) {
		boolean exists = false;
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(newService.getName())) {
				exists = true;
			}
		}
		if (!exists) {
			services.add(newService);
		}
	}
}
