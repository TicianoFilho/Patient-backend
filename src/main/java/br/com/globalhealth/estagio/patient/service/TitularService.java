package br.com.globalhealth.estagio.patient.service;

import java.util.List;

import br.com.globalhealth.estagio.patient.model.entity.Titular;
import br.com.globalhealth.estagio.patient.model.entity.form.TitularForm;

public interface TitularService {

	public List<Titular> findAll();
	public Titular findOne(long id);
	public void save(TitularForm form);
	public void delete(long id);
}
