package com.charionnerotairo.springdemo.serviceimpl;

import java.util.Random;

import com.charionnerotairo.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {


	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName +
				" offers world class Cloud computing infrastructure. "+
				"\nThe annual income exceeds "+ random.nextInt(revenue) + " dollars.";
		return service;
	}
	
	public void postConstruct() {
		System.out.println("cloudService: postConstruct called........");;
	}
	
	public void preDestroy() {
		System.out.println("cloudService: postDestroy called........");;
	}

}
