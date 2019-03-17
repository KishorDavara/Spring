package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligenece is the mother of good luck",
			"The journey is the reward"
	};
	
	Random random = new Random();
	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = random.nextInt(data.length);
		return data[index];
	}

}
