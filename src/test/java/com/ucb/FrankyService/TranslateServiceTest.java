package com.ucb.FrankyService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TranslateServiceTest {

    @Mock
    ApiTranslate apiTranslate;

    @InjectMocks
    TranslateService translateService;

    @Test
    void translate() {
        when(apiTranslate.translate("Hola", Language.ES.toString(), Language.EN.toString())).thenReturn("Hello");

        TranslateRequestDto translateRequestDto = new TranslateRequestDto("Hola", Language.ES, Language.EN);

        assertEquals("Hello", translateService.translate(translateRequestDto));
    }
}