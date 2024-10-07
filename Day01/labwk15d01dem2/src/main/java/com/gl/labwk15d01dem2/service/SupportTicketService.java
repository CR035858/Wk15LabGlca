package com.gl.labwk15d01dem2.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.labwk15d01dem2.model.CCRepDetails;
import com.gl.labwk15d01dem2.model.SupportTicket;


public interface SupportTicketService {
	
	
	public CCRepDetails getCCRepoDetails();
	public SupportTicket getSupportTicketInfo();
	

}
