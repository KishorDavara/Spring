package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from Spring Container
		CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
						
		//call methods on the bean
		System.out.println(cricketCoach.getDailyWorkout());
						
		//let's call our new method for fortunes
	    System.out.println(cricketCoach.getDailyFortune());

	    System.out.println(cricketCoach.getEmailAddress());
	    
	    System.out.println(cricketCoach.getTeam());
       // close the context
	    context.close();
	}

}
