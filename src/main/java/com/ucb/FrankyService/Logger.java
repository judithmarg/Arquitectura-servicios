package com.ucb.FrankyService;

public abstract class Logger implements IText {
    IText text;
    public Logger(IText text) {
        this.text = text;
    }
}
