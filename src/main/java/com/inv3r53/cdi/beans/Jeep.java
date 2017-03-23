package com.inv3r53.cdi.beans;

import javax.enterprise.inject.Alternative;

@Alternative
@VehicleType(type = "Bus")
public class Jeep implements Vehicle {

	public void drive() {
		System.out.println(getClass());

	}

}
