package com.example.demo2;

public class SwimingCoach implements Coach{
	
	private FortuneService fortuneservice;
	public SwimingCoach (FortuneService thefortuneservice) {
		fortuneservice = thefortuneservice;
	}
	@Override
	public String getTraining() {
		return "Butterfly challange";
	}

	@Override
	public String getFortune() {
		// TODO use fortune service to get fortune
		
		return fortuneservice.getFortune();
	}
}
