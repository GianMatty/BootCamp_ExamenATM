package com.matias.microservicios.common.models.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_cards")
public class Cards {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCars;
	@ElementCollection
	private List<Card> cards;
	
	public Cards() {
		this.cards = new ArrayList<>();
	}
	
	public void addCards(Card card) {
		this.cards.add(card);
	}
}
