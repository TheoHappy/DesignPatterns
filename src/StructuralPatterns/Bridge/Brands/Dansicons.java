package StructuralPatterns.Bridge.Brands;

import StructuralPatterns.Bridge.Brand;

public class Dansicons implements Brand {
    @Override
    public void setBrand() {
        System.out.println("Dansicons");
    }
}
