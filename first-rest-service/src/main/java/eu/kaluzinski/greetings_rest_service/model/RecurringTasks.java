package eu.kaluzinski.greetings_rest_service.model;

import org.slf4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.slf4j.LoggerFactory.getLogger;

@Component
public class RecurringTasks {
    private static final long INTERVAL = 1000;
    private static final Logger log = getLogger(RecurringTasks.class);
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    @Scheduled(fixedRate = INTERVAL)
    public void logCurrentTime() {
        log.info("Current time is {}", FORMATTER.format(LocalDateTime.now()));
    }
}