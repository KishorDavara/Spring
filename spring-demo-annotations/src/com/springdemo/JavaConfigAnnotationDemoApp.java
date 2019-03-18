package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigAnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		//get the bean from the spring container
		Coach coach = context.getBean("tennisCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
