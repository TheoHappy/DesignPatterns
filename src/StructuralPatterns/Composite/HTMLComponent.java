package StructuralPatterns.Composite;

import java.util.Iterator;

public abstract class HTMLComponent {
    private String type;

    abstract String getText();

    abstract void setText(String text);

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addElement(HTMLComponent element) {
        throw new UnsupportedOperationException("The Element cannot have children nodes.");
    }

    abstract Iterator<HTMLComponent> iterator();
}
