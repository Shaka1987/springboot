package com.example.demo01;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

@SpringBootApplication
public class SpringBootDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo01Application.class, args);
	}
	public ViewResolver myResolver() {
		return new MyViewResolver();
	}
	private static class MyViewResolver implements ViewResolver {

		@Override
		public View resolveViewName(String viewName, Locale locale) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
