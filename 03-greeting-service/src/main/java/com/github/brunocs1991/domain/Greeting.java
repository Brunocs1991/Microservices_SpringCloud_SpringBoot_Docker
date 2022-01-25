package com.github.brunocs1991.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
