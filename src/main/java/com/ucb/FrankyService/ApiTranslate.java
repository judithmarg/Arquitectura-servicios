package com.ucb.FrankyService;

import org.springframework.stereotype.Component;

@Component
public interface ApiTranslate {

    public String translate(String message, String source, String target);
}
