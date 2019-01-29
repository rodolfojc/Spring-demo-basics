package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CREATE THE OBJECT(S)
		//BaseballCoach theCoach new BaseballCoach();
		//Coach theCoach = new BaseballCoach();
		//Coach theCoach = new TrackCoach();
		Coach theCoach = new GymCoach();
		
		
		//USE THE OBJECT
		System.out.print(theCoach.getDailyWorkout());
		
	}

}
