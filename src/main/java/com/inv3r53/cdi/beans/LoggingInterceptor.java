package com.inv3r53.cdi.beans;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Logger
@Interceptor
public class LoggingInterceptor {

	@AroundInvoke
	public Object log(InvocationContext ctx) throws Exception {
		System.out.println("Before");
		Object r = ctx.proceed();
		System.out.println("After");
		return r;
	}
}
