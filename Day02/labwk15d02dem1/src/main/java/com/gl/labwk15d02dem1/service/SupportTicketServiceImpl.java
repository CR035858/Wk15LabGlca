package com.gl.labwk15d02dem1.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.gl.labwk15d02dem1.dao.DaoSample;
import com.gl.labwk15d02dem1.model.CCRepDetails;
import com.gl.labwk15d02dem1.model.SupportTicket;


import lombok.extern.slf4j.Slf4j;




@Service
@Slf4j
public class SupportTicketServiceImpl implements SupportTicketService{

	@Autowired
	DaoSample daoSample;
	
	@Override
	public CCRepDetails getCCRepDetails() {
		// TODO Auto-generated method stub
		log.info("Inside the getDDCRepoDetails Method....");
		
		CCRepDetails ccRepDetails = new CCRepDetails();
		ccRepDetails.setFirstName("Kiran Chandra");
		ccRepDetails.setLastName("Yadav");
		ccRepDetails.setAddress("Indiranagar");
		ccRepDetails.setDepartment("Complaints");
		ccRepDetails.setDesignation("Senior Rep");
		return ccRepDetails;
	}

	@Override
	public SupportTicket getSupportTicketInfo() {
		// TODO Auto-generated method stub
		SupportTicket supportTicket = new SupportTicket();
		CCRepDetails ccRepDetails = new CCRepDetails();
		ccRepDetails = getCCRepDetails();
		supportTicket.setId(1);
		supportTicket.setTicketTitle("Product Complaint");
		supportTicket.setTicketDescription("Product Not Working");
		supportTicket.setTicketRaisedDate(new Date());
		supportTicket.setAssignedCCRep(new CCRepDetails("Hemant", "Chandra Gupta", "RTNagar", "Complaints", "Senior Rep"));
		supportTicket.setAssignedCCRep( CCRepDetails.builder().firstName("Hemant").lastName("Chandra Gupta").address("Koramangala").department("complaints").designation("Senior Rep").build());
		
		return supportTicket;
	}

	@Override
	public List<CCRepDetails> getAllCCRepDetails() {
		// TODO Auto-generated method stub
		return daoSample.getAllCCRepDetails();
	}

	@Override
	public List<SupportTicket> getAllTicketDetails() {
		// TODO Auto-generated method stub
		return daoSample.getAllTickets();
	}
	
	
	
}
