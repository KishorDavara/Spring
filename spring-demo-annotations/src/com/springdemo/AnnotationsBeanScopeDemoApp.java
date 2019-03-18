package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from the context
		Coach coach1 = context.getBean("tennisCoach",Coach.class);
		Coach coach2 = context.getBean("tennisCoach",Coach.class);
		
		System.out.println("\nPointing to the same object: "+ (coach1 == coach2));
		
		System.out.println("Memory location for coach1 "+ coach1);
		
		System.out.println("Memory location for coach1 "+ coach2);

		context.close();
	}

}
