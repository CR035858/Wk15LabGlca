package com.gl.labwk15d04dem01.model;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO - will check in DB if it is there it will use or will create
//	@GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTTITY // will expect Persistence Provider  to provide auto generation 
	int id;								//SEQUENCE :Indicates that the persistence provider must assignprimary 
										//keys for the entity using a database sequence.
										//Table : Indicates that the persistence provider must assignprimary keys for 
										//the entity using an underlyingdatabase table to ensure uniqueness @Entity
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
