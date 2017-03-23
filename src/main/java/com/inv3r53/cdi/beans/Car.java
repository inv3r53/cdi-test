package com.inv3r53.cdi.beans;

import javax.enterprise.context.ApplicationScoped;

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
@VehicleType(type = "Car")
@ApplicationScoped
public class Car implements Vehicle {

    /*
     * (non-Javadoc)
     * 
     * @see com.inv3r53.cdi.beans.qualifier.Vehicle#drive()
     */
    public void drive() {
        System.out.println(getClass());

    }

}
