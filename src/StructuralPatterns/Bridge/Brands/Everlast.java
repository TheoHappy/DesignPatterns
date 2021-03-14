package StructuralPatterns.Bridge.Brands;

import StructuralPatterns.Bridge.Brand;

public class Everlast implements Brand {
    @Override
    public void setBrand() {
        System.out.println("Everlast");
    }
}
