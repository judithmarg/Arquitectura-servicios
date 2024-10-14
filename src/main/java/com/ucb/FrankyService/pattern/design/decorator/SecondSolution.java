package com.ucb.FrankyService.pattern.design.decorator;

import java.time.Instant;
import java.util.UUID;

public class SecondSolution {
    public void main(String[] args) {
        String message = "Staring service";
        new LoggerClon(message, SecondSolution.class).log();
    }

    private static class LoggerClon {
        private final String message;
        private final String nameClass;
        public LoggerClon(String message, Class classz) {
            this.message = message;
            this.nameClass = classz.getSimpleName();
        }

        public void log() {
            System.out.printf(" (%s) ", UUID.randomUUID());
            System.out.printf(" %s ", Instant.now().toString());
            System.out.printf(" %s ", nameClass);
            System.out.printf(" %s ", this.message);
            System.out.printf(" [%s] ", Thread.currentThread().getName());
        }
    }
}
