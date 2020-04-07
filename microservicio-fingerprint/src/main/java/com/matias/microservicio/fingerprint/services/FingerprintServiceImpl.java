package com.matias.microservicio.fingerprint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matias.microservicio.fingerprint.models.repository.FingerprintRepository;
import com.matias.microservicios.common.models.entity.Fingerprint;

import io.reactivex.Single;

@Service
public class FingerprintServiceImpl implements FingerprintService{
	
	@Autowired
	private FingerprintRepository fingerprintRepository;
	
	@Override
	public Single<?> validate() {
		return Single.create(s -> {
			s.onSuccess(new Fingerprint());
		});
	}
}
