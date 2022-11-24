package br.com.globalhealth.estagio.patient.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.globalhealth.estagio.patient.model.entity.Titular;

public interface PatientRepository extends JpaRepository<Titular, Long>{

}
