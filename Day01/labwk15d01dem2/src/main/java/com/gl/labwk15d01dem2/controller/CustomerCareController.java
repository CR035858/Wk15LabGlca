package com.gl.labwk15d01dem2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.labwk15d01dem2.model.CCRepDetails;
import com.gl.labwk15d01dem2.model.SupportTicket;
import com.gl.labwk15d01dem2.service.SupportTicketService;

@RestController
public class CustomerCareController {
	
	@Autowired
	SupportTicketService stService;
	
	
	@RequestMapping("/repInfo")
	public CCRepDetails getCCRepInfo()
	{
		stService.getCCRepoDetails();
		return stService.getCCRepoDetails();
	}
	
	@RequestMapping("/getTicketInfo")
	public SupportTicket getTicketInfo()
	{
		stService.getSupportTicketInfo();
		return stService.getSupportTicketInfo();
	}
	
	

}
