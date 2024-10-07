package com.gl.labwk15d02dem01.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gl.labwk15d02dem01.model.CCRepDetails;
import com.gl.labwk15d02dem01.model.SupportTicket;

@Repository
public class DaoSample {

	CCRepDetails ccRepDetails = new CCRepDetails();
	SupportTicket supportTicket = new SupportTicket();
	List <CCRepDetails> ccRepDetailsList = new ArrayList<>();
	List <SupportTicket> supportTicketsList = new ArrayList<>();
	
	public DaoSample()
	{
		CCRepDetails ccRepDetails1 = new CCRepDetails("Hari Kishan","Bhat","RTNagar","Complaints","Senior Rep");
		CCRepDetails ccRepDetails2 = new CCRepDetails("Naresh","Gupta","Koramangala","Suggestions","Junior Rep");
		CCRepDetails ccRepDetails3 = new CCRepDetails("Sumanth","Sharma","RTNagar","Suggestions","Senior Rep");
		CCRepDetails ccRepDetails4 = new CCRepDetails("Anirudh","Bhat","Koramangala","Complaints","Junior Rep");
		CCRepDetails ccRepDetails5 = new CCRepDetails("Kiran","Nayak","Indiranagar","Billing","Manager");
		CCRepDetails ccRepDetails6 = new CCRepDetails("Shravan","Nayak","Indiranagar","Billing","Senior Manager");
		CCRepDetails ccRepDetails7 = new CCRepDetails("Meera","Nair","Jayanagar","Complaints","Senior Manager");
		CCRepDetails ccRepDetails8 = new CCRepDetails("Bibhuthi","Gupta","Jayanagar","Complaints","Senior Rep");
		
		ccRepDetailsList.add(ccRepDetails1);
		ccRepDetailsList.add(ccRepDetails2);
		ccRepDetailsList.add(ccRepDetails3);
		ccRepDetailsList.add(ccRepDetails4);
		ccRepDetailsList.add(ccRepDetails5);
		ccRepDetailsList.add(ccRepDetails6);
		ccRepDetailsList.add(ccRepDetails7);
		ccRepDetailsList.add(ccRepDetails8);
		
		
		SupportTicket supportTicket1 = new SupportTicket(1,"ProductRelated","Product NotWorking","Complaints",new Date(),ccRepDetails1);
		SupportTicket supportTicket2 = new SupportTicket(2,"ProductRelated","Product NotWorking","Complaints",new Date(),ccRepDetails1);
		SupportTicket supportTicket3 = new SupportTicket(3,"SuggestionRelated","Product Suggestion","Suggestions",new Date(),ccRepDetails2);
		SupportTicket supportTicket4 = new SupportTicket(4,"ProductRelated","Product NotWorking","Complaint",new Date(),ccRepDetails4);
		SupportTicket supportTicket5 = new SupportTicket(5,"BillingRelated","Billing Issue","Billing",new Date(),ccRepDetails5);
		SupportTicket supportTicket6 = new SupportTicket(6,"BillingRelated","Billing Issue","Billing",new Date(),ccRepDetails5);
		SupportTicket supportTicket7 = new SupportTicket(7,"SuggestionRelated","Product Suggestion","Suggestions",new Date(),ccRepDetails2);
		SupportTicket supportTicket8 = new SupportTicket(8,"SuggestionRelated","Product NotWorking","Complaint",new Date(),ccRepDetails1);
		
		supportTicketsList.add(supportTicket1);
		supportTicketsList.add(supportTicket2);
		supportTicketsList.add(supportTicket3);
		supportTicketsList.add(supportTicket4);
		supportTicketsList.add(supportTicket5);
		supportTicketsList.add(supportTicket6);
		supportTicketsList.add(supportTicket7);
		supportTicketsList.add(supportTicket8);
		
	}
	
	public List <CCRepDetails> getAllCCRepDetails()
	{
		return ccRepDetailsList;
	}
	
	public List <SupportTicket> getAllTickets()
	{
		return supportTicketsList;
	}
}
