package com.ucb.FrankyService;

import org.springframework.stereotype.Component;

@Component
public class GoogleTranslate implements ApiTranslate {
    @Override
    public String translate(String message, String source, String target) {
        return "";
    }
}
