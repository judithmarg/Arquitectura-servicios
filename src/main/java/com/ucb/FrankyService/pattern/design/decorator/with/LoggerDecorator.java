package com.ucb.FrankyService.pattern.design.decorator.with;

public abstract class LoggerDecorator implements LoggerContent{
    LoggerContent loggerContent;

    public LoggerDecorator(LoggerContent loggerContent) {
        this.loggerContent = loggerContent;
    }
}
