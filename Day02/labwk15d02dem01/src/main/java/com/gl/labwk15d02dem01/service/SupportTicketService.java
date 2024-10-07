package com.gl.labwk15d02dem01.service;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.labwk15d02dem01.model.CCRepDetails;
import com.gl.labwk15d02dem01.model.SupportTicket;



@Controller
public interface SupportTicketService {
	
	@RequestMapping("/ccTicketInfo")
	public CCRepDetails getCCRepDetails();
	public SupportTicket getSupportTicketInfo();
	public List <CCRepDetails> getAllCCRepDetails();
	public List <SupportTicket> getAllTicketDetails();
	

}
