package com.tutorial.learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

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
		ApplicationContext context = new ClassPathXmlApplicationContext("LearnSpringBean.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
	
	
	}
}
