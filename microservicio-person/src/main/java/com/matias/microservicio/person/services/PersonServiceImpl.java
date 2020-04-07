package com.matias.microservicio.person.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matias.microservicio.person.models.repository.PersonRepository;
import com.matias.microservicios.common.models.entity.Person;

import io.reactivex.Single;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Single<Object> findPersonByDocument(String document) {
		return Single.create(s -> {
			List<Person> persons = personRepository.FindByDocument(document);
			if(persons.isEmpty()) {
				s.tryOnError(new EntityNotFoundException("Persona no encontrada"));
			}else {
				s.onSuccess(persons.get(0));
			}
		});
	}	
}
