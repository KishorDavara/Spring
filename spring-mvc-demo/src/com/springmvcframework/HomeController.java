package com.springmvcframework;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //  it extends off Component class
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
