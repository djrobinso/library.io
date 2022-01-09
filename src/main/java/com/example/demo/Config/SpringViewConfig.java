package com.example.demo.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringViewConfig implements WebMvcConfigurer {
	
	public void addViewControllers(ViewControllerRegistry registry) {
		
		registry.addRedirectViewController("/", "index.html");
		//registry.addViewController("/index").setViewName("home");
		//registry.addViewController("/").setViewName("home");
		registry.addViewController("/login").setViewName("login");
	}

}
