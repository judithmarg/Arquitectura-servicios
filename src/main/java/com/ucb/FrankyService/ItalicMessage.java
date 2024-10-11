package com.ucb.FrankyService;

public class ItalicMessage  extends MessageMain{
    public ItalicMessage(IText text){
        super(text);
    }

    @Override
    public String getText() {
        return String.format("<c> %s </c>", this.text.getText());
    }
}

