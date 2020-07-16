package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.DemoConfig;

@RestController
public class DemoController {

	@Autowired
	private DemoConfig demoConfig;

	@GetMapping("/greetMe")
	public String greetMe() {

		return demoConfig.getGreeting() + " from " + demoConfig.getName();
	}
}
