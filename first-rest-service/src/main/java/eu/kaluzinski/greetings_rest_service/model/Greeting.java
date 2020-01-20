package eu.kaluzinski.greetings_rest_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Greeting {

    private final long id;
    private final String content;
}
