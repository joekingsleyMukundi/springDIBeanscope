package com.example.demo2;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneservice;
	private String emailAdress;
	private String team;
	
	
	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public FortuneService getFortuneservice() {
		return fortuneservice;
	}

	public void setFortuneservice(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getTraining() {
		// TODO Auto-generated method stub
		return "Practice fast balling";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}
//	bean start or init methods
	public void doMyStartUpStuff() {
		System.out.println("doing start");
	}
//	bean destroy method
	public void doMyCleanupStuff() {
		System.out.println("doing clean up");
	}

}
