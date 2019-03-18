package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
//@Scope("prototype")
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
    
    // init method
    @PostConstruct
    public void doMyStartupStuff() {
    	System.out.println("Inside doMyStartupStuff()");
    }
    
    //destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
    	System.out.println("Inside doMyCleanupStuff()");
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
