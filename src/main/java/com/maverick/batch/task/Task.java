package com.maverick.batch.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task {

	private static final Logger log = LoggerFactory.getLogger(Task.class);
	
	@Scheduled(fixedRate = 5000)
	private void fechaActual() {
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		log.info("La hora actual es {}" , dt.format(new Date()));
		
	}
}
