package com.example.demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach1 = context.getBean("myCoach", Coach.class);
		System.out.println(coach1.getTraining());
		System.out.println(coach1.getFortune());
		CricketCoach coach2 = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(coach2.getTraining());
		System.out.println(coach2.getFortune());
		System.out.println(coach2.getTeam());
		System.out.println(coach2.getEmailAdress());
		context.close();
	}
}
