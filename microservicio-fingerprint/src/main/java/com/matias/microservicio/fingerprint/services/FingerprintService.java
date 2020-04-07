package com.matias.microservicio.fingerprint.services;

import io.reactivex.Single;

public interface FingerprintService {
	public Single<?> validate();
}
