package com.ucb.FrankyService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GreetingServiceTest {

    @Mock
    ConfigurationParam configurationParam;
    @InjectMocks
    GreetingService greetingService;
    String messageGreet = "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieras estar mañana.";

    @Test
    @DisplayName("Method to get greeting")
    void getGreeting() {
        when(configurationParam.getTextGreeting()).thenReturn(messageGreet);
        assertEquals(messageGreet,
                greetingService.getGreeting());
    }

    @Test
    @DisplayName("Method to get greeting with name")
    void getGreetingWithName() {
        when(configurationParam.getTextGreeting()).thenReturn(messageGreet);
        String expectedGreeting = "Judith. "+ messageGreet;
        assertEquals(expectedGreeting, greetingService.getGreeting("Judith"));
    }

    @Test
    @DisplayName("Method to get greeting with other name")
    void getGreetingWithOtherName() {
        when(configurationParam.getTextGreeting()).thenReturn(messageGreet);
        String expectedGreeting = "Billie. "+ messageGreet;
        assertEquals(expectedGreeting, greetingService.getGreeting("Billie"));
    }

    @Test
    @DisplayName("Method to get greeting incorrect")
    void getGreetingIncorrect() {
        when(configurationParam.getTextGreeting()).thenReturn(messageGreet);
        String expectedGreeting = "Lana. "+ messageGreet;
        assertNotEquals(expectedGreeting, greetingService.getGreeting("Billie"));
    }

    @Test
    @DisplayName("Method to get greeting with spaces")
    void getGreetingWithSpaces() {
        when(configurationParam.getTextGreeting()).thenReturn(messageGreet);
        String expectedGreeting = "Lana. "+ messageGreet;
        assertEquals(expectedGreeting, greetingService.getGreeting("   Lana     "));
    }
}