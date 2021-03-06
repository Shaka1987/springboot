package com.example.demo01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo01.component.MyLocalResolver;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		//super.addViewControllers(registry);
		registry.addViewController("/example").setViewName("success");
	}
	
	@Bean
	public WebMvcConfigurer webMvcConfigurer() {
		WebMvcConfigurer wConfigurer = new WebMvcConfigurer() {

			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("login");
			}
			
		};
		return wConfigurer;
	}
	@Bean
	public LocaleResolver localeResolver() {
		return new MyLocalResolver();
		
	}
}
