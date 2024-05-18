import java.util.Iterator;

import logic.DocumentHistory;
import logic.Memento;
import models.Document;

public class App {
    public static void main(String[] args) throws Exception {
        Document document = new Document();
        DocumentHistory history = new DocumentHistory();
        
        document.change("Hello");
        history.save(document);
        document.change("Hello World");
        history.save(document);
        document.change("Hello World!");
        history.save(document);
        history.undo(document);
        history.redo(document);
        

        Iterator<Memento> iterator = history.iterator();

        System.out.println("Document history:");
        while (iterator.hasNext()) {
            Memento memento = iterator.next();
            System.out.println(memento.getSavedContent());
        }

        System.out.println("=====================================");
        System.out.println("Current content: " + document.getContent());
    }
}
