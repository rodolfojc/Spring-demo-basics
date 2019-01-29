package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//LOAD THE SPRING CONFIGURATION FILE
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//RETRIVE BEAN FROM SPRING CONTAINER
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//CALL METHOS ON BEANS
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDaylyFortune());
		
		
		//METHODS ADDED
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//CLOSE THE CONTEXT
		context.close();
	}

}
