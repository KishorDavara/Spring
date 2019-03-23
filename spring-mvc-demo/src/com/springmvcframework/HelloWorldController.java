package com.springmvcframework;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	/*
	 * Controller method to show the initial HTML form
	 */
	@RequestMapping("/showForm")
	private String showForm() {
		return "helloworld-form";
	}
	
	/*
	 * Controller method to process the initial HTML form
	 */
	@RequestMapping("/processForm")
	private String processForm() {
		return "helloworld";
	}
}
