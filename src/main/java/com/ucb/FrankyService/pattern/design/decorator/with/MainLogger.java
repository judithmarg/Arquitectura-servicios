package com.ucb.FrankyService.pattern.design.decorator.with;

public class MainLogger {
    public void main(String... arg) {
        LoggerContent loggerContent = new SimpleLogger("Starting service");
        loggerContent = new ThreadNameLoggerDecorator(loggerContent);
        loggerContent = new ClassNameLoggerDecorator(loggerContent);
        System.out.println(loggerContent.getContent());
    }
}
