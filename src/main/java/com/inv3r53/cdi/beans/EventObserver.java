package com.inv3r53.cdi.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class EventObserver {

    public void receiveEvent(@Observes Bus bus) {
        System.out.println(Thread.currentThread().getName() + " - In Observes Bus - " + bus.getClass() + " : " + bus);
    }

    public void receiveEvent(@Observes Vehicle v) {
        System.out.println(Thread.currentThread().getName() + " - In Observes Vehicle - " + v.getClass() + " : " + v);
    }

    public void receiveEventWithQual(@Observes @VehicleType(type = "Jeep") Vehicle v) {
        System.out.println(Thread.currentThread().getName() + " - In Observes Vehicle with Jeep Qualifier -" + v.getClass() + " : " + v);
    }
}
