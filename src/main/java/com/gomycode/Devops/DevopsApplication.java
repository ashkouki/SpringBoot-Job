package com.gomycode.Devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication


public class DevopsApplication  extends SpringBootServletInitializer {

	
	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
		
	}

}
