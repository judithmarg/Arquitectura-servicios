package com.ucb.FrankyService.pattern.design.decorator;

import java.time.Instant;
import java.util.UUID;

public class LoggerWithoutPattern {
    public static void main(String[] args) {
        String message = "Staring service";
        System.out.printf(" (%s) ", UUID.randomUUID());
        System.out.printf(" %s ", Instant.now().toString());
        //System.out.printf(" %s ", this.getClass().getName());
        System.out.printf(" %s ", message);
        System.out.printf(" [%s] ", Thread.currentThread().getName());
    }
}
