package com.matias.microservicio.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.matias.microservicios.common.models.entity"})
public class MicroservicioAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAccountApplication.class, args);
	}

}
