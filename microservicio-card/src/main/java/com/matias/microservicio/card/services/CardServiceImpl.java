package com.matias.microservicio.card.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matias.microservicio.card.models.repository.CardRepository;
import com.matias.microservicios.common.models.entity.Card;
import com.matias.microservicios.common.models.entity.Cards;

import io.reactivex.Single;

@Service
public class CardServiceImpl implements CardService{

	@Autowired
	private CardRepository cardRepository;
	
	@Override
	public Single<Object> bucarCards(String document) {
		return Single.create(s -> {
			Cards cards = new Cards();
			cards.addCards(new Card("1111222233334441", true));
			cards.addCards(new Card("1111222233334442", true));
			cards.addCards(new Card("1111222233334443", true));
			cards.addCards(new Card("1111222233334444", false));
			cards.addCards(new Card("1111222233334445", false));
			cards.addCards(new Card("1111222233334446", false));
			
			s.onSuccess(cards);
		});
	}
}
