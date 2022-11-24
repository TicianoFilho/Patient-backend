package br.com.globalhealth.estagio.patient.model.entity.form;

import java.time.LocalDateTime;
import java.util.List;

import br.com.globalhealth.estagio.patient.model.entity.Dependente;
import br.com.globalhealth.estagio.patient.model.entity.Endereco;
import br.com.globalhealth.estagio.patient.model.entity.Titular;

public class TitularForm {

	private Long id;
	private String name;
	private String cpf;
	private String healthInsuranceCardNumber;
	private Endereco endereco;
	private List<Dependente> dependentes;
	private boolean active;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	public TitularForm() {
		
	}
	
	public static Titular toTitular(TitularForm form) {
		Titular titular = new Titular();
		titular.setName(form.getName());
		titular.setCpf(form.getCpf());
		titular.setHealthInsuranceCardNumber(form.getHealthInsuranceCardNumber());
		titular.setEndereco(form.getEndereco());
		titular.setDependentes(form.getDependentes());
		titular.setActive(form.isActive());
		return titular;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public List<Dependente> getDependentes() {
		return dependentes;
	}


	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
