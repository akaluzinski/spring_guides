package eu.kaluzinski.greetings_rest_service;

import eu.kaluzinski.greetings_rest_service.controller.GreetingController;
import eu.kaluzinski.greetings_rest_service.model.Greeting;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FirstRestGreetingApp {

	@Test
	void shouldDisplayPassedParameter() {
		GreetingController controller = new GreetingController();
		Greeting greeting = controller.greeting("Test");

		assertThat(greeting.getId()).isEqualTo(1);
		assertThat(greeting.getContent()).isEqualTo("Welcome, Test!");

		Greeting greeting2 = controller.greeting("Test2");

		assertThat(greeting.getId()).isEqualTo(1);
		assertThat(greeting2.getId()).isEqualTo(2);
		assertThat(greeting2.getContent()).isEqualTo("Welcome, Test2!");
	}
}