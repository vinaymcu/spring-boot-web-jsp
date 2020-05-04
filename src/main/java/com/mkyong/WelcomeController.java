package com.mkyong;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@Value("${welcome.next}")
	private String next = "Hello World1";



	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping("/next")
	public String next(Map<String, Object> model) {
		System.out.println(" GO TO NEXT PAGE --------->>");
		model.put("next", "HELLO I am Next jsp page");
		return "next";
	}


	@RequestMapping("/emp")
	public String emp(Map<String, Object> model) {
		System.out.println(" GO TO EMP  PAGE --------->>");
		model.put("emp", "EMP:GOPAL,CITY:DELHI");
		return "emp";
	}

}