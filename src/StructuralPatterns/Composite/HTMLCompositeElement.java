package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HTMLCompositeElement extends HTMLComponent{
    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    private List<HTMLComponent> elements = new ArrayList<>();

    public void addElement(HTMLComponent element) {
        elements.add(element);
    }

    public Iterator<HTMLComponent> iterator() {
        return elements.iterator();
    }

    public String getText() {
        StringBuilder htmlText = new StringBuilder(this.text);
        Iterator<HTMLComponent> iter = this.iterator();
        while (iter.hasNext()) {
            htmlText.append(iter.next().getText());
        }
        return htmlText.toString();
    }
}
