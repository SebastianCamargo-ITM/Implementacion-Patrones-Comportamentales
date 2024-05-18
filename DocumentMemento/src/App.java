import java.util.Iterator;

import logic.DocumentHistory;
import logic.Memento;
import models.Document;

public class App {
    public static void main(String[] args) throws Exception {
        Document document = new Document();
        DocumentHistory history = new DocumentHistory();
        
        document.change("Hola");
        history.save(document);
        document.change("Soy un documento");
        history.save(document);
        document.change("Me gusta el patrón Memento");
        history.save(document);
        history.undo(document);// Content: Soy un documento
        history.redo(document);// Content: Me gusta el patrón Memento

        Iterator<Memento> iterator = history.iterator();

        System.out.println("\nDocument history:");
        while (iterator.hasNext()) {
            Memento memento = iterator.next();
            System.out.println(memento.getSavedContent());
        }

        System.out.println("=====================================");
        System.out.println("Current content: " + document.getContent());
    }
}
