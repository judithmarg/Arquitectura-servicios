package com.ucb.FrankyService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    @Test
    void getGreeting() {
        GreetingService greetingService = new GreetingService();
        assertEquals("Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieras estar mañana.",
                greetingService.getGreeting());
    }
}