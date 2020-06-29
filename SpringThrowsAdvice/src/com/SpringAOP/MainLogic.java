package com.SpringAOP;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource re = new ClassPathResource("Config.xml");
		BeanFactory bf = new XmlBeanFactory(re);
		Login lg = (Login)bf.getBean("proxyFactoryBean");
		lg.validate();

	}

}
