package com.ucb.FrankyService;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    String greet = "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieras estar mañana.";

    public String getGreeting() {
        return greet;
    }
}
