package com.matias.microservicio.account.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.matias.microservicios.common.models.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Long>{

}
