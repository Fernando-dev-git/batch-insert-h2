package com.maverick.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootBatchMensajeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBatchMensajeApplication.class, args);
	}

}
