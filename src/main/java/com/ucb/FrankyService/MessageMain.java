package com.ucb.FrankyService;

public abstract class MessageMain implements IText{
    IText text;
    public MessageMain(IText text){
        this.text = text;
    }
}
