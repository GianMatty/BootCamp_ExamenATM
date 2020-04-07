package com.matias.microservicio.card.services;

import io.reactivex.Single;

public interface CardService {
	public Single<Object> bucarCards(String document);
}
