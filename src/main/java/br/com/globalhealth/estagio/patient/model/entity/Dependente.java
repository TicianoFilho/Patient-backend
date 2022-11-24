package br.com.globalhealth.estagio.patient.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Dependente extends Person {

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "titular_id")
	private Titular titular;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;
	
	public Dependente() {
		super();
	}

	public Dependente(String name, String cpf, String healthInsuranceCardNumber) {
		super(name, cpf, healthInsuranceCardNumber);
	}

	
}
