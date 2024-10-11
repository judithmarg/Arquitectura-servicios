package com.ucb.FrankyService;

public class ThreadName extends Logger {
    public ThreadName(IText text) {
        super(text);
    }

    @Override
    public String getText() {
        return String.format("%s %s", Thread.currentThread().getName(), this.text.getText());
    }
}
