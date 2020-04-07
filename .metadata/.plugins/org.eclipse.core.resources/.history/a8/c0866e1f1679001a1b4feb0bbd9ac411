package com.matias.microservicio.atmdeposit.services;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface AtmServiceRetrofit {
	@GET("core/persons")
	Single<Object> findPersonByDocumento(@Body String documentNumber);
	
}
