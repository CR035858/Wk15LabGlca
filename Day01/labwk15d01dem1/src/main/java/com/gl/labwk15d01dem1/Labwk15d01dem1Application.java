package com.gl.labwk15d01dem1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.gl.labwk15d01dem1.controller","com.gl.labwk15d01dem1.service","com.gl.labwk15d01dem1.model"})
public class Labwk15d01dem1Application {

	public static void main(String[] args) {
		SpringApplication.run(Labwk15d01dem1Application.class, args);
		System.out.println("Hello World, Welcome to SPRINGBOOT apps.....");
	}

}
