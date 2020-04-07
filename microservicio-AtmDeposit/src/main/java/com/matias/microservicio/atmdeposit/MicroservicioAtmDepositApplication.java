package com.matias.microservicio.atmdeposit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.matias.microservicios.common.models.entity"})
public class MicroservicioAtmDepositApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAtmDepositApplication.class, args);
	}

}
