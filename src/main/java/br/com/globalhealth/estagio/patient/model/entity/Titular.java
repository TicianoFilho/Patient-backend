package br.com.globalhealth.estagio.patient.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Titular extends Person {
	
	@OneToMany(mappedBy = "titular", fetch = FetchType.EAGER)
	private List<Dependente> dependentes;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;
	
	public Titular() {
		super();
	}

	public Titular(String name,  String cpf, String healthInsuranceCardNumber, boolean active) {
		super(name, cpf, healthInsuranceCardNumber, active);
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
