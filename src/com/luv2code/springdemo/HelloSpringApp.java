package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LOAD THE SPRING CONFIGURATION FILE
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//RETRIVE BEAN FROM SRPING CONTEINER
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//CALL METHODS ON THE BEAN 
		System.out.println(theCoach.getDailyWorkout());
		
		//CALL FORTUNE
		System.out.println(theCoach.getDaylyFortune());
		
		//CLOSE THE CONTEXT
		context.close();
		
	}

}
