package br.com.globalhealth.estagio.patient.service;

import java.util.List;

import br.com.globalhealth.estagio.patient.model.entity.Dependente;

public interface DependenteService {
	
	public List<Dependente> findAll();
	public Dependente findOne(long id);
	public void save();
	public void delete(long id);
}
