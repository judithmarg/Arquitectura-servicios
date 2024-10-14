package com.ucb.FrankyService.pattern.design.decorator.with;

public class SimpleLogger implements LoggerContent {
    private final String message;

    public SimpleLogger(String message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message;
    }
}
