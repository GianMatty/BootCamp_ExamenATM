package com.matias.microservicios.common.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_fingerprint")
public class Fingerprint {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//private String document;
	private String entityName;
	private boolean success;
	
	public Fingerprint() {
		this.entityName = "Core";
		this.success = true;
	}
}
