package com.springmvcframework;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	// load the content of properties file
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;

	@RequestMapping("/showForm")
	private String showForm(Model model) {
	    //create a new student object
		Student student = new Student();
		//student.setFirstName("Kishor");
		//student.setLastName("Davara");
		
		//add a student to the model
		model.addAttribute("student",student);
		
		// add the country options to the model 
	    model.addAttribute("theCountryOptions", countryOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	private String processForm(@ModelAttribute("student") Student student) {
		
		//log the input data
		System.out.println("Student name: "+student.getFirstName()+" "+student.getLastName());
		
		return "student-confirmation";
	}
}
