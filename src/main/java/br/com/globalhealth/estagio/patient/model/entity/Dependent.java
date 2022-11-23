package br.com.globalhealth.estagio.patient.model.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Dependent extends Person {

	private Long id;

}
