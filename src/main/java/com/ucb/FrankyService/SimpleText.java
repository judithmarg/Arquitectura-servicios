package com.ucb.FrankyService;

public class SimpleText implements IText{
    private final String message;
    public SimpleText(String message) {
        this.message = message;
    }

    @Override
    public String getText() {
        return message;
    }
}
