package com.ucb.FrankyService;

public class ClassName extends Logger{
    public ClassName(IText text) {
        super(text);
    }

    @Override
    public String getText() {
        return String.format("%s %s", "className", this.text.getText());
    }
}
