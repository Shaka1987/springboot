package com.example.demo01.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloWorld {
	@ResponseBody()
	@RequestMapping("/hello")
	public String hello() {
		return "Hello world!";
	}
	 @RequestMapping(value = "success", method = RequestMethod.GET)
	
	public String success(Map<String, Object> map) {
		map.put("hello","<h1>你好</h1>");
		map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
		return "success";
	}
}
