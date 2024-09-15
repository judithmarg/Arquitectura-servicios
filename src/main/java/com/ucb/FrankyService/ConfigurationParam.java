package com.ucb.FrankyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ConfigurationParam {

    @Value("${dollarOfficial}")
    double officialDollar;

    @Value("${textGreeting}")
    String greetingSpanish;

    @Value("${greetingEnglish}")
    String greetingEnglish;

    @Value("${greetingChinese}")
    String greetingChinese;

    @Value("${greetingFrench}")
    String greetingFrench;

    @Value("${greetingItalian}")
    String greetingItalian;

    @Value("${greetingPortuguese}")
    String greetingPortuguese;

    @Value("${greetingGerman}")
    String greetingGerman;

    double getOfficialDollar() {
        return officialDollar;
    }

    String getTextGreeting(String language) {
        Map<String, String> map = new HashMap<>();
        map.put("spanish", greetingSpanish);
        map.put("english", greetingEnglish);
        map.put("portuguese", greetingPortuguese);
        map.put("chinese", greetingChinese);
        map.put("italian", greetingItalian);
        map.put("french", greetingFrench);
        return map.get(language);
    }
}
