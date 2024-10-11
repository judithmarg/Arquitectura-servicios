package com.ucb.FrankyService;

public class Main {
    public static void main(String[] args){
//        String message = "Starting app";
//        System.out.printf("%s", Instant.now());
//        System.out.printf("%s", UUID.randomUUID());
//        System.out.printf("%s", message);
//        IText text = new DateTimeLogger(new SimpleText("Starting app"));
//        System.out.println(text.getText());

        IText text2 = new BoldMessage(new ItalicMessage(new SimpleText("UCB")));
        System.out.println(text2.getText());
    }
}
