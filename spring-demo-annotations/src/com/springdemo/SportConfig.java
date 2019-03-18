package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springdemo")
public class SportConfig {

//define a bean for sad fortune service
@Bean	
public FortuneService sadFortuneService() {
	return new SadFortuneService();
}

//define a bean for our swim coach AND inject dependency
@Bean
public Coach swimCoach() {
	return new SwimCoach(sadFortuneService());
}
}
