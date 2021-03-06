package com.charionnerotairo.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.charionnerotairo.springdemo.domain.Organization;

public class CNamespaceApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		//Print Organization details
		System.out.println(org);
		
		//close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}	

}
