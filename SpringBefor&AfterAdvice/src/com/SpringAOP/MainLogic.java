package com.SpringAOP;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
	public static void main(String args[]) {
		Resource rs = new ClassPathResource("Config.xml");
		BeanFactory fac = new XmlBeanFactory(rs);
		Bank b=(Bank)fac.getBean("proxyFactoryBean");
		b.withdraw();
		b.deposit();
	
	}

}
