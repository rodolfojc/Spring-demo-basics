package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDaylyFortune() {
		return "Just do it!!"+this.fortuneService.getFortune();
	}

	//ADD INIT METHOD
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStratupStuff - Init");
	}
	
	//ADD DESTROY METHOD
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff - Destroy");
	}
	
	
}
