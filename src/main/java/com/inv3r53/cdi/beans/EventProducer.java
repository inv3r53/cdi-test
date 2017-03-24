package com.inv3r53.cdi.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@ApplicationScoped
public class EventProducer {

	@Inject
	private Event<Vehicle> busEventProducer;

	public void generateEvent() {
		Vehicle b = new Bus();

		System.out.println(Thread.currentThread().getName() + " - " + getClass() + " before send " + b);
		busEventProducer.fire(b);
		System.out.println(Thread.currentThread().getName() + " - " + getClass() + " after send " + b);

		Vehicle van = new Van();
		busEventProducer.fire(van);
	}

}
