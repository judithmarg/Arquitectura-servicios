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
class ConverterServiceTest {

    @Mock
    ConfigurationParam configurationParam;

    @InjectMocks
    ConverterService converterService;


    @Test
    @DisplayName("Method to Converter celsius to fahrenheit")
    void celsiusToFahrenheit() {
        assertEquals(212.0, converterService.celsiusToFahrenheit(100));
    }

    @Test
    @DisplayName("Method to converter fahrenheit to celsius")
    void fahrenheitToCelsius() {
        assertEquals(100, converterService.fahrenheitToCelsius(212));
    }

    @Test
    @DisplayName("Method to converter bs to dollar")
    void dollarToBs() {
        when(configurationParam.getOfficialDollar()).thenReturn(6.96);
        assertEquals(1.0, converterService.bsToDollars(6.96));
    }
}