package com.gl.labwk15d01dem1.model;

import java.util.Date;

public class SupportTicket {

	int id;
	String ticketTitle;
	String ticketDescription;
	String category;
	Date ticketRaisedDate;
	CCRepDetails assignedCCRep;
	
	
	public SupportTicket() {
		super();
	}


	public SupportTicket(int id, String ticketTitle, String ticketDescription, String category, Date ticketRaisedDate,
			String assignedTo) {
		super();
		this.id = id;
		this.ticketTitle = ticketTitle;
		this.ticketDescription = ticketDescription;
		this.category = category;
		this.ticketRaisedDate = ticketRaisedDate;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTicketTitle() {
		return ticketTitle;
	}


	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}


	public String getTicketDescription() {
		return ticketDescription;
	}


	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Date getTicketRaisedDate() {
		return ticketRaisedDate;
	}


	public void setTicketRaisedDate(Date ticketRaisedDate) {
		this.ticketRaisedDate = ticketRaisedDate;
	}


	


	public CCRepDetails getAssignedCCRep() {
		return assignedCCRep;
	}


	public void setAssignedCCRep(CCRepDetails assignedCCRep) {
		this.assignedCCRep = assignedCCRep;
	}


	@Override
	public String toString() {
		return "SupportTicket [id=" + id + ", ticketTitle=" + ticketTitle + ", ticketDescription=" + ticketDescription
				+ ", category=" + category + ", ticketRaisedDate=" + ticketRaisedDate 
				+ "]";
	}


	
	
	
	
}
