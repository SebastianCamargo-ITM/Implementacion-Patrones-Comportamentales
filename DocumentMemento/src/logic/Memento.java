package logic;

public class Memento {
    private String content;

    public Memento(String contentToSave) {
        content = contentToSave;
    }

    public String getSavedContent() {
        return content;
    }
}
