package com.accenture;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;


@SpringBootApplication
public class UtilitySinkApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(UtilitySinkApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UtilitySinkApplication.class, args);
	}
	
	@Bean
	public Function<Message<String>, Message<String>> readChannel01() {

		return message -> {
			logger.info("************* Se re-envia mensaje a business-stream: {}", message.getPayload());
			return message;
		};
	}

}
