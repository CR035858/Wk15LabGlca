package com.gl.labwk15d02dem01;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gl.labwk15d02dem01.service.SupportTicketService;


import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Labwk15d02dem01Application implements CommandLineRunner{
	
	@Autowired
	SupportTicketService supportTicketService;

	public static void main(String[] args) {
		SpringApplication.run(Labwk15d02dem01Application.class, args);
		System.out.println("Welcome to Spring Boot Tools - Lombok...Dev Tools .. Config");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		log.info("Fetch  CCRepDetails ->{}", supportTicketService.getCCRepDetails());
		
		log.info("Fetch Support Ticket Details ->{}", supportTicketService.getSupportTicketInfo());
		
		log.info("Fetch All CCRep Details -->{} ",supportTicketService.getAllCCRepDetails());
		
		log.info("Fetch All Ticket Details -->{} ",supportTicketService.getAllTicketDetails());
		
		
		
	
		
	}

}
