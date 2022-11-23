package br.com.globalhealth.estagio.patient.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Address {

	private Long id;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private String zip;
	
	private String country;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;
}
