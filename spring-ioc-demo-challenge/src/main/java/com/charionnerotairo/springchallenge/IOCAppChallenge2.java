package com.charionnerotairo.springchallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IOCAppChallenge2 {

	public static void main(String[] args) {
		// create the application context (container)
				ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
				
				//create the bean
				City cty = (City) ctx.getBean("myorg");
				
				//invoke the company slogan via the bean
				cty.cityName();
				
				//close the application context (container)
				((ClassPathXmlApplicationContext) ctx).close();

	}

}
