package com.inv3r53.cdi.beans;


//By default it has @Default qualifier
public class Auto implements Vehicle {

	public void drive() {
		System.out.println(getClass());

	}

}
