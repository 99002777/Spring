package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class GreetController {
	
	@RequestMapping("/greet")
	public String sayHello(ModelMap map) {
		String msg="have a nice day";
		map.addAttribute("message",msg);
		return "success";
	}

}
