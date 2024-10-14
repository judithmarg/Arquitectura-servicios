package com.ucb.FrankyService.pattern.design.decorator;

import java.sql.SQLOutput;
import java.time.Instant;
import java.util.UUID;

public class ThirdSolution {
    public static void main(String[] args) {
        String message = "Staring service";
        new Logger(message, ThirdSolution.class, true).log();
        new Logger(message, ThirdSolution.class, false).log();
    }

    private static class Logger {
        private final String message;
        private final String nameClass;
        private Boolean isVisibleNameThread = true;

        public Logger(String message, Class classz, Boolean visibleNameThread) {
            this.message = message;
            this.nameClass = classz.getSimpleName();
            this.isVisibleNameThread = visibleNameThread;
        }

        public void log() {
            System.out.printf(" (%s) ", UUID.randomUUID());
            System.out.printf(" %s ", Instant.now().toString());
            System.out.printf(" %s ", nameClass);
            System.out.printf(" %s ", this.message);
            if(this.isVisibleNameThread) {
                System.out.printf(" [%s] ", Thread.currentThread().getName());
            }
            System.out.println();
        }

    }
}
