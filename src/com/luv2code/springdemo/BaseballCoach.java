package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//DEFINE A PRIVATE FIELD FOR THE DEPENDENCY
	private FortuneService fortuneService;
	
	//DEFINE A CONSTRCUTOR FOR DEPENDENCY INJECTION
	public BaseballCoach (FortuneService ThefortuneService) {
		
		this.fortuneService = ThefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDaylyFortune() {
		//USE MY FORTUNESERVICE TO GET FORTUNE
		return fortuneService.getFortune();
	}

}
