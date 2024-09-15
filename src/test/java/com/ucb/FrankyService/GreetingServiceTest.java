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
    String englishGreet = "Ask yourself if what you are doing today is getting you closer to where you want to be tomorrow.";
    String chineseGreet = "问问自己，今天所做的一切是否能让你更接近明天的目标。";
    String germanGreet = "Fragen Sie sich, ob das, was Sie heute tun, Sie dem Ziel von morgen näher bringt.";

    @Test
    @DisplayName("Method to get greeting")
    void getGreeting() {
        when(configurationParam.getTextGreeting("spanish")).thenReturn(messageGreet);
        assertEquals(messageGreet,
                greetingService.getGreeting());
    }

    @Test
    @DisplayName("Method to get greeting with name")
    void getGreetingWithName() {
        when(configurationParam.getTextGreeting("spanish")).thenReturn(messageGreet);
        String expectedGreeting = "Judith. "+ messageGreet;
        assertEquals(expectedGreeting, greetingService.getGreeting("Judith", "spanish"));
    }

    @Test
    @DisplayName("Method to get greeting with other name")
    void getGreetingWithOtherName() {
        when(configurationParam.getTextGreeting("spanish")).thenReturn(messageGreet);
        String expectedGreeting = "Billie. "+ messageGreet;
        assertEquals(expectedGreeting, greetingService.getGreeting("Billie", "spanish"));
    }

    @Test
    @DisplayName("Method to get greeting incorrect")
    void getGreetingIncorrect() {
        when(configurationParam.getTextGreeting("spanish")).thenReturn(messageGreet);
        String expectedGreeting = "Lana. "+ messageGreet;
        assertNotEquals(expectedGreeting, greetingService.getGreeting("Billie", "spanish"));
    }

    @Test
    @DisplayName("Method to get greeting with spaces")
    void getGreetingWithSpaces() {
        when(configurationParam.getTextGreeting("spanish")).thenReturn(messageGreet);
        String expectedGreeting = "Lana. "+ messageGreet;
        assertEquals(expectedGreeting, greetingService.getGreeting("   Lana     ", "spanish"));
    }

    @Test
    @DisplayName("Method to get greeting english")
    void getGreetingEnglish() {
        when(configurationParam.getTextGreeting("english")).thenReturn(englishGreet);
        String expectedGreeting = "Judith. "+ englishGreet;
        assertEquals(expectedGreeting, greetingService.getGreeting("Judith", "english"));
    }

    @Test
    @DisplayName("Method to get greeting chinese")
    void getGreetingChinese() {
        when(configurationParam.getTextGreeting("chinese")).thenReturn(chineseGreet);
        String expectedGreeting = "Judith. "+ chineseGreet;
        assertEquals(expectedGreeting, greetingService.getGreeting("Judith", "chinese"));
    }

    @Test
    @DisplayName("Method to get greeting german")
    void getGreetingGerman() {
        when(configurationParam.getTextGreeting("german")).thenReturn(germanGreet);
        String expectedGreeting = "Judith. "+ germanGreet;
        assertEquals(expectedGreeting, greetingService.getGreeting("Judith", "german"));
    }
}