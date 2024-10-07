package com.gl.labwk15d02dem01.model;





import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CCRepDetails {
	
	String firstName;
	String lastName;
	String address;
	String department;
	String designation;
	
	
	@Override
	public String toString() {
		return "CCRepDetails [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", department=" + department + ", designation=" + designation + "]";
	}
	
	
	

}
