package com.gl.labwk15d02dem1.service;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.labwk15d02dem1.model.CCRepDetails;
import com.gl.labwk15d02dem1.model.SupportTicket;




public interface SupportTicketService {
	
	
	public CCRepDetails getCCRepDetails();
	public SupportTicket getSupportTicketInfo();
	public List <CCRepDetails> getAllCCRepDetails();
	public List <SupportTicket> getAllTicketDetails();
	

}
