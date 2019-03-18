package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigAnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		//get the bean from the spring container
		SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);
		
		//call a method on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		//call our new swim coach methods ... has the properties value injected
		System.out.println("email: "+ coach.getEmail());
		System.out.println("team: "+ coach.getTeam());
		
		//close the context
		context.close();
	}

}
