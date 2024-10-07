package com.gl.labwk15d01dem2.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.gl.labwk15d01dem2.model.CCRepDetails;
import com.gl.labwk15d01dem2.model.SupportTicket;

@Service
public class SupportTicketServiceImpl implements SupportTicketService{

	@Override
	public CCRepDetails getCCRepoDetails() {
		// TODO Auto-generated method stub
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
		ccRepDetails = getCCRepoDetails();
		supportTicket.setId(1);
		supportTicket.setTicketTitle("Product Complaint");
		supportTicket.setTicketDescription("Product Not Working");
		supportTicket.setTicketRaisedDate(new Date());
		supportTicket.setAssignedCCRep(new CCRepDetails("Hemant", "Chandra Gupta", "RTNagar", "Complaints", "Senior Rep"));
		return supportTicket;
	}

}
