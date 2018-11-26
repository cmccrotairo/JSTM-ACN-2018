package com.charionnerotairo.springdemo.serviceimpl;

import java.util.Random;

import com.charionnerotairo.springdemo.service.RecruitmentService;

public class AgencyRecruitmentServiceImpl implements RecruitmentService {

	@Override
	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		
		String hiringFacts= "\n" + companyName + "'s " + departmentName + " hired " +
							random.nextInt(numberOfRecruitments) + " employees " +
							"using various hiring agencies.";
		
		return hiringFacts;
	}

}
