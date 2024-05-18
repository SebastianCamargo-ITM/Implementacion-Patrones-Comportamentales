package logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import models.Document;

public class DocumentHistory implements Iterable<Memento>{
    private List<Memento> history = new ArrayList<>();
    private List<Memento> future = new ArrayList<>();

    public void save(Document document) {
        history.add(document.saveToMemento());
        // Clear the future when a new change is made
        future.clear();
    }

    public void undo(Document document) {
        if (!history.isEmpty()) {
            Memento memento = history.remove(history.size() - 1);
            future.add(memento); // Add the undone change to the future
            document.restoreFromMemento(memento);
        }
    }

    public void redo(Document document) {
        if (!future.isEmpty()) {
            Memento memento = future.remove(future.size() - 1);
            history.add(memento); // Add the redone change back to the history
            document.restoreFromMemento(memento);
        }
    }

    @Override
    public Iterator<Memento> iterator() {
        return new Iterator<Memento>() {
            private int index = history.size() - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Memento next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return history.get(index--);
            }
        };
    }
}
