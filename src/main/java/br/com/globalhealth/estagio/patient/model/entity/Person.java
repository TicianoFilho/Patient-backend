package br.com.globalhealth.estagio.patient.model.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person extends AppBaseEntity {

	@Column
	private String name;
	
	@Column(unique = true)
	private String cpf;

	@Column(name = "health_insurance_card_number")
	private String healthInsuranceCardNumber;
	
	public Person() {
		super();
	}	

	public Person(String name, String cpf, String healthInsuranceCardNumber) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.healthInsuranceCardNumber = healthInsuranceCardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHealthInsuranceCardNumber() {
		return healthInsuranceCardNumber;
	}

	public void setHealthInsuranceCardNumber(String healthInsuranceCardNumber) {
		this.healthInsuranceCardNumber = healthInsuranceCardNumber;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
