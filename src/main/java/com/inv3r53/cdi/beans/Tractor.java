package com.inv3r53.cdi.beans;

@VehicleType(type = "Tractor")
public class Tractor implements Vehicle {
	private String name;

	Tractor() {
		this.name = "Default";
	}

	Tractor(String name) {
		this.name = name;
	}

	public void drive() {
		System.out.println(getClass() + " " + name);

	}

}
