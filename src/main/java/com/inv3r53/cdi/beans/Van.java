package com.inv3r53.cdi.beans;

import javax.enterprise.inject.Alternative;

@Alternative
public class Van implements Vehicle {

	public void drive() {
		System.out.println(getClass());

	}

}
