package com.ucb.FrankyService;

import org.springframework.stereotype.Service;

@Service
public class TranslateService {

    GoogleTranslate apiTranslate;
    TranslateService(GoogleTranslate apiTranslate) {
        this.apiTranslate = apiTranslate;
    }

    public String translate(TranslateRequestDto translateRequestDto) {
        return apiTranslate.translate(
                translateRequestDto.message(),
                translateRequestDto.source().toString(),
                translateRequestDto.target().toString());
    }
}
