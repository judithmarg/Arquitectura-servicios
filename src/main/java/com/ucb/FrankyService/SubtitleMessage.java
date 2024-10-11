package com.ucb.FrankyService;

public class SubtitleMessage extends MessageMain{
    public SubtitleMessage(IText text){
        super(text);
    }
    @Override
    public String getText() {
        return String.format("<s> %s </s>", this.text.getText());
    }
}
