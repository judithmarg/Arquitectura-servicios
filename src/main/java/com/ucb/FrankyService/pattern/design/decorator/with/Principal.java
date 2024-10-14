package com.ucb.FrankyService.pattern.design.decorator.with;

public class Principal {
    public static void main(String[] args) {
        ContentText simpleText = new BoldText(new ItalicText (new SimpleText("Java is power")));
        System.out.println(simpleText.text());
    }

    interface ContentText {
        String text();
    }

    static class SimpleText implements ContentText {
        private final String text;
        public SimpleText(String text) {
            this.text = text;
        }

        @Override
        public String text() {
            return this.text;
        }
    }

    static abstract class ContentDecorator implements ContentText {
        protected final ContentText contentText;
        ContentDecorator(ContentText contentText) {
            this.contentText = contentText;
        }
    }

    static class ItalicText extends ContentDecorator {
        public ItalicText(ContentText contentText) {
            super(contentText);
        }

        @Override
        public String text() {
            return String.format("<Italic>%s</Italic>", contentText.text());
        }
    }

    static class BoldText extends ContentDecorator {
        public BoldText(ContentText contentText) {
            super(contentText);
        }

        @Override
        public String text() {
            return String.format("<Bold>%s</Bold>", contentText.text());
        }
    }
}
