package eu.kaluzinski.greetings_rest_service.controller;

import eu.kaluzinski.greetings_rest_service.FirstRestGreetingsApp;
import eu.kaluzinski.greetings_rest_service.model.random_quotes.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class QuotesController {
    private static final Logger log = LoggerFactory.getLogger(FirstRestGreetingsApp.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            Quote quote = restTemplate.getForObject(
                    "https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
            log.info("Quote for a day: {}", quote.getValue());
        };
    }
}