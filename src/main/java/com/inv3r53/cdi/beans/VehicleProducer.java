package com.inv3r53.cdi.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class VehicleProducer {

	@Produces
	@CustomVehicle
	public Vehicle getTractor() {
		return new Tractor("Custom");
	}

}
