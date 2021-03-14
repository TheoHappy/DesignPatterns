package StructuralPatterns.Composite;


import java.util.Collections;
import java.util.Iterator;

public class HTMLLeafElement extends HTMLComponent {
    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    public Iterator<HTMLComponent> iterator() {
        Iterator<HTMLComponent> items = Collections.emptyIterator();
        return items;
    }
}
