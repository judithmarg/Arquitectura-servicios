package com.ucb.FrankyService;

public enum Language {
    ES("ES"),
    EN("EN"),
    FR("FR"),
    CH("CH");
    private final String description;
    Language(String description){
        this.description = description;
    }

    public String toString(){
        return this.description;
    }
}
