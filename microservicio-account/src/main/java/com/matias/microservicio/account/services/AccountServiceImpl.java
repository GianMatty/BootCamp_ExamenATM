package com.matias.microservicio.account.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matias.microservicio.account.models.repository.AccountRepository;
import com.matias.microservicios.common.models.entity.Account;
import com.matias.microservicios.common.models.entity.Person;

import io.reactivex.Single;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Single<Object> findAccountByCard(String cardNumber) {
		return Single.create(s -> {
			if(cardNumber.equals("1111222233334441")) {
				s.onSuccess(new Account(cardNumber + "XXX", 1000));
			}else if(cardNumber.equals("1111222233334442")) {
				s.onSuccess(new Account(cardNumber + "XXX", 500));
			}else if(cardNumber.equals("1111222233334443")) {
				s.onSuccess(new Account(cardNumber + "XXX", 1500));
			}else {
				s.tryOnError(new EntityNotFoundException("Cuenta no encontrada"));
			}
		});
	}
}
