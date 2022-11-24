package br.com.globalhealth.estagio.patient.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.globalhealth.estagio.patient.model.entity.Dependent;

public interface DependentRepository extends JpaRepository<Dependent, Long>{

}
