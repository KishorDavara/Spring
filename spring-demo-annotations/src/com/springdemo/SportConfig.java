package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//we commented this because we don't want to do full component scan as we have bean declared
//@ComponentScan("com.springdemo")
@PropertySource("classpath:sport.properties")
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
