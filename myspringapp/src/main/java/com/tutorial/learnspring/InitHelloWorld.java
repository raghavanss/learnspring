package com.tutorial.learnspring;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class InitHelloWorld implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean After Name" +beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("Bean Before Name" +beanName);
		return bean;
	}
	
}
	