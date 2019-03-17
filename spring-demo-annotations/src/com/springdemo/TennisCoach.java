package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	//@Qualifier("RESTFortuneService")
	private FortuneService fortuneServie;
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneServie) {
//		this.fortuneServie = fortuneServie;
//	}
	
    public TennisCoach() {
    	System.out.println("TennisCoach: Inside default constructor ");
    }
	
//    @Autowired
//	public void setFortuneServie(FortuneService fortuneServie) {
//    	System.out.println("TennisCoach: Inside setFortuneServie method");
//		this.fortuneServie = fortuneServie;
//	}

    /*
    @Autowired
	public void doSomeCrazyStuff(FortuneService fortuneServie) {
    	System.out.println("TennisCoach: Inside doSomeCrazyStuff method");
		this.fortuneServie = fortuneServie;
	}*/
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneServie.getFortune();
	}

}
