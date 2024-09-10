package com.ucb.FrankyService;

public class ConverterServiceBuilder {
    private ConfigurationParam configurationParam;

    public ConverterServiceBuilder setConfigurationParam(ConfigurationParam configurationParam) {
        this.configurationParam = configurationParam;
        return this;
    }

    public ConverterService createConverterService() {
        return new ConverterService(configurationParam);
    }
}