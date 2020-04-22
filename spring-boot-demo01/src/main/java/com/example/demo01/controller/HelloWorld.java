package com.example.demo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld {
	@ResponseBody()
	@RequestMapping("/hello")
	public String hello() {
		return "Hello world!";
	}
	
}
