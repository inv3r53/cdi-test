package com.inv3r53.cdi.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class EventObserver {

	public void receiveEvent(@Observes Bus bus) {
		System.out.println(Thread.currentThread().getName() + " - " + getClass() + " " + bus.getClass() + " : " + bus);
	}

	public void receiveEvent(@Observes Vehicle v) {
		System.out.println(Thread.currentThread().getName() + " - " + getClass() + " " + v.getClass() + " : " + v);
	}
}
