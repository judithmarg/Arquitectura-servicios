package com.ucb.FrankyService;

public class BoldMessage extends MessageMain{
    public BoldMessage(IText text){
        super(text);
    }

    @Override
    public String getText() {
        return String.format("<b> %s </b>", this.text.getText());
    }
}
