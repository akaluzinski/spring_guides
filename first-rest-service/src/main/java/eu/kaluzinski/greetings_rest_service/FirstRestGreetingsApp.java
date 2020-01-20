package eu.kaluzinski.greetings_rest_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class FirstRestGreetingsApp {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestGreetingsApp.class, args);
	}
}