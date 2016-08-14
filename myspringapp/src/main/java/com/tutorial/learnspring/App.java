package com.tutorial.learnspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	
	/* public static String getClasspathString() {
	     StringBuffer classpath = new StringBuffer();
	     ClassLoader applicationClassLoader = App.class.getClassLoader();
	     if (applicationClassLoader == null) {
	         applicationClassLoader = ClassLoader.getSystemClassLoader();
	     }
	     URL[] urls = ((URLClassLoader)applicationClassLoader).getURLs();
	      for(int i=0; i < urls.length; i++) {
	          classpath.append(urls[i].getFile()).append("\r\n");
	      }    
	     
	      return classpath.toString();
	  }*/
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("LearnSpringBean.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage1();
		obj.getMessage2();
		
		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
		context.registerShutdownHook();
	}
}
