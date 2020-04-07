package com.matias.microservicios.common.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "tbl_card")
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCard;
	private String cardNumber;
	private boolean active;
	
	public Card(String cardNumber, boolean active) {
		this.cardNumber = cardNumber;
		this.active = active;
	}
}
