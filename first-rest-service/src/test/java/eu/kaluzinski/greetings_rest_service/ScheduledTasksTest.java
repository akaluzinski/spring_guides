package eu.kaluzinski.greetings_rest_service;

import eu.kaluzinski.greetings_rest_service.model.RecurringTasks;
import org.awaitility.Duration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class ScheduledTasksTest {

	@SpyBean
	RecurringTasks tasks;

	@Test
	void shouldLogCurrentTime() {
		await().atMost(Duration.FIVE_SECONDS).untilAsserted(() -> {
			verify(tasks, atLeast(3)).logCurrentTime();
			verify(tasks, atMost(7)).logCurrentTime();
		});
	}
}