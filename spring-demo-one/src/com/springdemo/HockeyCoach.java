package com.springdemo;

public class HockeyCoach implements Coach {
	private FortuneService fortuneService;
	
	public HockeyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 1 hour on the center forward practice";
	}

	@Override
	public String getDailyFortune() {
		return "Hey "+ fortuneService.getFortune();
	}

}
