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
package com.inv3r53.cdi.beans;

import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@ApplicationScoped
public class Bean1 {

	@Inject
	@Any
	private Instance<Vehicle> i;

	@Inject
	@VehicleType(type = "Bus")
	private Vehicle bus; // Will have Bus injected if no alternative is activated else Jeep if alternative is activated.

	@Inject
	private Vehicle auto; // default qualifier is present by default at injection point. //if alternative is activated
							// then Auto is replaced by Van.

	@PostConstruct
	private void init() {
		System.out.println("Post Construct :" + getClass());
		System.out.println("**************************************");
		System.out.println(i.iterator().hasNext());
		Iterator<Vehicle> it = i.iterator(); // Van i.e @alternative wont be added in this unless activated explicitly
												// in
												// beans.xml
		while (it.hasNext()) {
			System.out.println(it.next().getClass());
		}
		System.out.println("**************************************");
		//
		System.out.print("Qualifier Bus=>");
		bus.drive();
		System.out.print("Qualifier Default=>");
		auto.drive();
		System.out.println("**************************************");
	}

	@PreDestroy
	private void dest() {
		System.out.println("Pre Destroy :" + getClass());
	}

	@Inject
	private Bean2 bean2;

	public void run() {
		bean2.print();
	}

}
