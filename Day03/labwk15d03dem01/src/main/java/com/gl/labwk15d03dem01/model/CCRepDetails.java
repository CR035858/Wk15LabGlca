package com.gl.labwk15d03dem01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CCRepDetails")
@Data 
public class CCRepDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="")
	String firstName;
	
	@Column(name="")
	String lastName;
	
	@Column(name="")
	String address;
	
	@Column(name="")
	String department;
	
	@Column(name="")
	String designation;
	
	
	
}
