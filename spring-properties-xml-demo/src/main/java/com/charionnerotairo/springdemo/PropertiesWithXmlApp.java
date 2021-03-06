package com.charionnerotairo.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.charionnerotairo.springdemo.domain.Organization;
import com.charionnerotairo.springdemo.domain.promotion.TradeFair;

public class PropertiesWithXmlApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization org = (Organization) ctx.getBean("myorg");
		System.out.println(org);
		
		//close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}	

}
