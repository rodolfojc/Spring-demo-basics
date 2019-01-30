package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//LOAD THE SPRING CONFIGURATION FILE
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
		
		//RETRIVE BEAN FROM SPRING CONTAINER
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//CHECK IF BEANS ARE THE SAME BEAN
		boolean result = (theCoach == alphaCoach);
		
		//PRINTING RESULT
		System.out.println("\nPointing to the same object: "+result );
		
		System.out.println("\nMemory location for theCoach: "+theCoach );
		
		System.out.println("\nMemory location for alphaCoach: "+alphaCoach );
		
	}

}
