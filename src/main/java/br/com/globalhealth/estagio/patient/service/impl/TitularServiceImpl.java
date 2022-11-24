package br.com.globalhealth.estagio.patient.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.globalhealth.estagio.patient.model.dao.TitularRepository;
import br.com.globalhealth.estagio.patient.model.entity.Titular;
import br.com.globalhealth.estagio.patient.model.entity.form.TitularForm;
import br.com.globalhealth.estagio.patient.service.TitularService;

@Service
public class TitularServiceImpl implements TitularService {

	@Autowired
	TitularRepository titularRepository;
	
	@Override
	public List<Titular> findAll() {
		return titularRepository.findAll();
	}

	@Override
	public Titular findOne(long id) {
		Titular titular = titularRepository.findById(id).get();
		return titular;
	}

	@Override
	public void save(TitularForm form) {
		titularRepository.save(TitularForm.toTitular(form));
		
	}

	@Override
	public void delete(long id) {
		titularRepository.deleteById(id);
	}

	
}
