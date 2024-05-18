package models;

import logic.Memento;

public class Document {
    private String content;

    public void change(String newContent) {
        content = newContent;
    }

    public Memento saveToMemento() {
        return new Memento(content);
    }

    public void restoreFromMemento(Memento memento) {
        content = memento.getSavedContent();
    }

    public String getContent() {
        return content;
    }
}
