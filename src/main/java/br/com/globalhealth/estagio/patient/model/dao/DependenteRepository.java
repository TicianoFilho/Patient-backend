package br.com.globalhealth.estagio.patient.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.globalhealth.estagio.patient.model.entity.Dependente;

public interface DependenteRepository extends JpaRepository<Dependente, Long>{

}
