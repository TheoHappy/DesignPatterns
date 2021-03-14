package StructuralPatterns.Bridge.Buildings;

import StructuralPatterns.Bridge.Brand;
import StructuralPatterns.Bridge.Building;

public class Garage extends Building {
    public Garage(Brand brand) {
        super(brand);
    }

    @Override
    public void getType() {
        System.out.println("Garage");
    }
}
