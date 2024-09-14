package com.ucb.FrankyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationParam {

    @Value("${dollarOfficial}")
    double officialDollar;

    @Value("${textGreeting}")
    String textGreeting;

    double getOfficialDollar() {
        return officialDollar;
    }

    String getTextGreeting() {
        return textGreeting;
    }
}
