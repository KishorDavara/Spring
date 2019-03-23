package com.springmvcframework;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	/**
	 * Controller method to read the form data and add the processed data to the model
	 */
	@RequestMapping("/processFormVersionTwo")
	private String letsShoutDude(HttpServletRequest request,Model model) {
     	//read the request parameters from the HTML form
		String theName = request.getParameter("studentName");
		
		// convert the data to uppercase
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! "+ theName;
		
		// add the message to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
