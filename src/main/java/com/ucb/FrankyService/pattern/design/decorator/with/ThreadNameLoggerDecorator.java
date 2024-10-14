package com.ucb.FrankyService.pattern.design.decorator.with;

public class ThreadNameLoggerDecorator extends LoggerDecorator {

    public ThreadNameLoggerDecorator(LoggerContent loggerContent) {
        super(loggerContent);
    }

    @Override
    public String getContent() {
        return String.format("%s [%s]", loggerContent.getContent(), Thread.currentThread().getName() );
    }
}
