package com.springmvcframework;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	private String showForm(Model model) {
	    //create a new student object
		Student student = new Student();
		//student.setFirstName("Kishor");
		//student.setLastName("Davara");
		
		//add a student to the model
		model.addAttribute("student",student);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	private String processForm(@ModelAttribute("student") Student student) {
		
		//log the input data
		System.out.println("Student name: "+student.getFirstName()+" "+student.getLastName());
		
		return "student-confirmation";
	}
}
