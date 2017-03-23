/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.inv3r53.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.inv3r53.cdi.beans.Bean1;
import com.inv3r53.cdi.beans.Vehicle;
import com.inv3r53.cdi.beans.VehicleTypeLiteral;

public class Main {

    private static WeldContainer container;

    public static void main(String[] args) {
        Weld weld = new Weld();
        container = weld.initialize();
        testBeanInit();
        //testBeanQualifier();
        weld.shutdown();
    }

    public static void testBeanInit() {
        Bean1 bean1 = container.instance().select(Bean1.class).get();
        bean1.run();
    }

    public static void testBeanQualifier() {
        VehicleTypeLiteral q = new VehicleTypeLiteral("Car");
        Vehicle v = container.instance().select(Vehicle.class, q).get();
        v.drive();
    }
}
