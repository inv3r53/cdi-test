package com.inv3r53.cdi.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@ApplicationScoped
public class EventProducer {

    @Inject
    private Event<Vehicle> eventProducer;

    @Inject
    private Event<Bus> busEventProducer;

    public void generateEvent() {
        //Qualifiers on Vehicle implementation are not considered for events.
        Vehicle b = new Bus();

        System.out.println(Thread.currentThread().getName() + " - " + getClass() + " before send " + b);
        //only Vehicle type observer will be called.
        eventProducer.fire(b);
        System.out.println(Thread.currentThread().getName() + " - " + getClass() + " after send " + b);

        //this will trigger both Bus observer and Vehicle observer 
        busEventProducer.fire(new Bus());

        Vehicle van = new Van();
        eventProducer.fire(van);

        Vehicle jeep = new Jeep();
        //here both vehicle and Jeep observer will be called
        eventProducer.select(new VehicleTypeLiteral("Jeep")).fire(jeep);

    }

}
