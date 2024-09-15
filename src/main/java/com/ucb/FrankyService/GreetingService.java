package com.ucb.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    ConfigurationParam configurationParam;

    public String getGreeting() {
        return configurationParam.getTextGreeting("spanish");
    }

    public String getGreeting(String username, String language) {
        String name = username.trim() + ". ";
        return name + configurationParam.getTextGreeting(language);
    }
}
