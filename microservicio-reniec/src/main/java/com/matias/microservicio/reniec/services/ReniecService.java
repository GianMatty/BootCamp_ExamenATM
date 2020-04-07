package com.matias.microservicio.reniec.services;

import io.reactivex.Single;

public interface ReniecService {
	public Single<?> validate();
}
