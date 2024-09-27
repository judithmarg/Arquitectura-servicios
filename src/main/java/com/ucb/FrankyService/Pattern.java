package com.ucb.FrankyService;

public class Pattern {

    private String name;
    private String[] features;
    private String category;
    private String[] advantages;
    private String[] disadvantages;
    private String[] application;

    public Pattern(String name, String[] features, String category, String[] application, String[] advantages, String[] disadvantages) {
        this.name = name;
        this.disadvantages = disadvantages;
        this.features = features;
        this.category = category;
        this.advantages = advantages;
        this.application = application;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFeatures() {
        return features;
    }

    public void setFeatures(String[] features) {
        this.features = features;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String[] getAdvantages() {
        return advantages;
    }

    public void setAdvantages(String[] advantages) {
        this.advantages = advantages;
    }

    public String[] getDisadvantages() {
        return disadvantages;
    }

    public void setDisadvantages(String[] disadvantages) {
        this.disadvantages = disadvantages;
    }

    public String[] getApplication() {
        return application;
    }

    public void setApplication(String[] application) {
        this.application = application;
    }

}
