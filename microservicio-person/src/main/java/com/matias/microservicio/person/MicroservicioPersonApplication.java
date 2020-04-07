package com.matias.microservicio.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.matias.microservicios.common.models.entity"})
public class MicroservicioPersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioPersonApplication.class, args);
	}

}
