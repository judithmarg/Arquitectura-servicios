package com.ucb.FrankyService.pattern.design.decorator.with;

public class ClassNameLoggerDecorator extends LoggerDecorator {

    public ClassNameLoggerDecorator(LoggerContent loggerContent) {
        super(loggerContent);
    }
    @Override
    public String getContent() {
        return String.format("%s %s :", loggerContent.getContent(), this.getClass().getSimpleName());
    }
}
