package com.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;
	
    public CricketCoach() {
	 System.out.println("CricketCoach: Inside no-args constructor");	
	}
    
    public void setFortuneService(FortuneService fortuneService) {
    	System.out.println("CricketCoach: Inside setFortuneService Method");
    	this.fortuneService = fortuneService;
	}
    
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setEmailAddress Method");
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setTeam Method");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice the batting for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
