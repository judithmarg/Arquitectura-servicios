package com.ucb.FrankyService;

import java.time.Instant;
import java.util.UUID;

public class SingleLogger {
    private final String message;
    private final boolean enableDateTime;
    private final boolean enableId;
    private final boolean enableThread;
    private final String className;
    private final boolean enableClassName;


    public SingleLogger(String message, boolean enableDateTime, boolean enableId, boolean enableThread, String className, boolean enableClassName) {
        this.message = message;
        this.enableDateTime = enableDateTime;
        this.enableId = enableId;
        this.enableThread = enableThread;
        this.className = className;
        this.enableClassName = enableClassName;
    }

    public void printLog() {
        if(enableDateTime) {
            System.out.printf("%s ", Instant.now());
        }
        if(enableId) {
            System.out.printf("%s ", UUID.randomUUID());
        }
        System.out.printf("%s ", message);
        if(enableThread) {
            System.out.printf("[%s] ", Thread.currentThread().getName());
        }
        if(enableClassName) {
            System.out.printf("%s ", className);
        }
    }
}
