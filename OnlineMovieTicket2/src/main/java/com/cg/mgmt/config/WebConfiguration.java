/**
 * 
 */
package com.cg.mgmt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Nishant
 *
 */
@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET",
				"HEAD", "POST", "PUT", "DELETE", "OPTIONS", "PATCH");
		WebMvcConfigurer.super.addCorsMappings(registry);
	}
	
}
