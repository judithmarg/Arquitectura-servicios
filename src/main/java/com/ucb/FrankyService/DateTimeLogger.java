package com.ucb.FrankyService;

import java.time.Instant;

public class DateTimeLogger extends Logger{
    public DateTimeLogger(IText text){
        super(text);
    }

    @Override
    public String getText() {
        return String.format("%s %s", Instant.now(), this.text.getText());
    }
}
