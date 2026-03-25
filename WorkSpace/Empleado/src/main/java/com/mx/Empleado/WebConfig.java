package com.mx.Empleado;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer{
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/api/**")
		.allowedOrigins("*")
		.allowedMethods("GET", "PUT", "POST", "DELETE")
		.allowedHeaders("*");
	}
	

}
