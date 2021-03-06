package com.charionnerotairo.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.charionnerotairo.springdemo.domain.Organization;
import com.charionnerotairo.springdemo.domain.promotion.TradeFair;

public class PropertiesWithAnnotationApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
		Organization org = (Organization) ctx.getBean("myorg");
		
		System.out.println(org);
		System.out.println("slogan: "+org.corporateSlogan());
		((AnnotationConfigApplicationContext) ctx).close();
				
	}	

}
