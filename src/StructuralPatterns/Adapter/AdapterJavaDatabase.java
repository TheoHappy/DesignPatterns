package StructuralPatterns.Adapter;

public class AdapterJavaDatabase extends JavaApp implements Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        removeObject();
    }
}
