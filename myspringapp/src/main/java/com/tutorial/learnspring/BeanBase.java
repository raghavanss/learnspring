package com.tutorial.learnspring;

public class BeanBase {

	protected void init() {
		System.out.println("Calling INIT");
	}
	
	protected void destroy() {
		System.out.println("Calling Destroy");
		
	}
}
