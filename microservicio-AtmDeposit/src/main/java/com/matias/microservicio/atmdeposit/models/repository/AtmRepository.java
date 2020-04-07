package com.matias.microservicio.atmdeposit.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.matias.microservicios.common.models.entity.ATMDeposit;

public interface AtmRepository extends CrudRepository<ATMDeposit, Long>{

}
