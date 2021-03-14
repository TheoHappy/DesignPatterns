package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HTMLPage {
    private List<HTMLElement> elements = new ArrayList<>();

    public void addElement(HTMLElement element) {
        elements.add(element);
    }

    public Iterator<HTMLElement> iterator() {
        return elements.iterator();
    }
}
