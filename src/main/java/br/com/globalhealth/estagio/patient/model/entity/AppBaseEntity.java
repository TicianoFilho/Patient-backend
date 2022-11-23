package br.com.globalhealth.estagio.patient.model.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public abstract class AppBaseEntity {

	private LocalDateTime createdAt;

	private LocalDateTime updatedAt;
}
