package com.matias.microservicio.reniec.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matias.microservicio.reniec.models.repository.ReniecRepository;
import com.matias.microservicios.common.models.entity.Reniec;

import io.reactivex.Single;

@Service
public class ReniecServiceImpl implements ReniecService{
	@Autowired
	private ReniecRepository reniecRepository;

	@Override
	public Single<?> validate() {
		return Single.create(s -> {
			s.onSuccess(new Reniec());
		});
	}
	
	
}
