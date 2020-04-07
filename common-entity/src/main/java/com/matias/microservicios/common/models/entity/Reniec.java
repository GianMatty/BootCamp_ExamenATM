package com.matias.microservicios.common.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

@Data
@Entity
@Table(name = "tbl_reniec")
public class Reniec {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//private String document;
	private String entityName;
	private boolean success;
	
	public Reniec() {
		this.entityName = "Reniec";
		this.success = true;
	}
	
}
