package com.springdemo;

public class HappyFortuneService implements FortuneService {
    
	public HappyFortuneService() {
	 System.out.println("HappyFortuneService: Inside no-args constructor");
	}
    
	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
