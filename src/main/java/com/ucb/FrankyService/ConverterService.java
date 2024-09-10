package com.ucb.FrankyService;

import org.springframework.stereotype.Service;

@Service
public class ConverterService {

    ConfigurationParam configurationParam;

    public ConverterService(ConfigurationParam configurationParam) {
        this.configurationParam = configurationParam;
    }

    public double celsiusToFahrenheit(double celsius) {
        System.out.println(configurationParam.getOfficialDollar());
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double bsToDollars(double bs) {
        return bs / configurationParam.getOfficialDollar();
    }

}
