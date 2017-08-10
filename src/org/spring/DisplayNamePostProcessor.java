package org.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNamePostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bean Name After Initialization: " + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bean Name Before Initialization: " + beanName);
		return bean;
	}
	/*
	 * We can use this BeanPostProcessor just by creating bean for this in XML file.
	 * <bean class="org.spring.DisplayNamePostProcessor" />
	 */
}
