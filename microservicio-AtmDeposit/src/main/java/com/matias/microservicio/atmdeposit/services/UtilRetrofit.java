package com.matias.microservicio.atmdeposit.services;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class UtilRetrofit {
	private Retrofit retrofit =null;

	public UtilRetrofit(String baseUrl ) {
		this.retrofit = new Retrofit
				.Builder()
				.baseUrl(baseUrl)
				.addConverterFactory(GsonConverterFactory.create())
				.addCallAdapterFactory(RxJavaCallAdapterFactory.create())
				.build();
	}

	public Retrofit getRetrofit() {
		return retrofit;
	}

	
	
}
