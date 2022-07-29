package com.example.demo2;

public class FootbalCoach implements Coach{
	
	private FortuneService fortuneservice;
	public FootbalCoach (FortuneService thefortuneservice) {
		fortuneservice = thefortuneservice;
	}
	@Override
	public String getTraining() {
		return "crossbar challange";
	}

	@Override
	public String getFortune() {
		// TODO use fortune service to get fortune
		
		return fortuneservice.getFortune();
	}
}
