package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("home")
	public String showHome() {
		System.out.println("hello from kubernetes");
		return "Welcome to my Home";
	}

}
