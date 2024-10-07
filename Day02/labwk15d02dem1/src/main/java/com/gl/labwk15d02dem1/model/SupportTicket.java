package com.gl.labwk15d02dem1.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Getter
//@Setter
//@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupportTicket {

	int id;
	String ticketTitle;
	String ticketDescription;
	String category;
	Date ticketRaisedDate;
	CCRepDetails assignedCCRep;
	
	
	

	


	@Override
	public String toString() {
		return "SupportTicket [id=" + id + ", ticketTitle=" + ticketTitle + ", ticketDescription=" + ticketDescription
				+ ", category=" + category + ", ticketRaisedDate=" + ticketRaisedDate 
				+ "]";
	}


	
	
	
	
}
