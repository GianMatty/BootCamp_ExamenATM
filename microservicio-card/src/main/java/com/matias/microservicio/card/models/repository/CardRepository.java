package com.matias.microservicio.card.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.matias.microservicios.common.models.entity.Cards;

public interface CardRepository extends CrudRepository<Cards, Long> {
	
}
