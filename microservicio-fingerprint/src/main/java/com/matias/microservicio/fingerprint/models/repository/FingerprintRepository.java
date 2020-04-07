package com.matias.microservicio.fingerprint.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.matias.microservicios.common.models.entity.Fingerprint;

public interface FingerprintRepository extends CrudRepository<Fingerprint, Long>{

}
