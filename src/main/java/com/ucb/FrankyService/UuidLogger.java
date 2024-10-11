package com.ucb.FrankyService;

import java.util.UUID;

public class UuidLogger extends Logger{
    public UuidLogger(IText text) {
        super(text);
    }

    @Override
    public String getText() {
        return String.format("%s %s", UUID.randomUUID(), this.text.getText());
    }
}
