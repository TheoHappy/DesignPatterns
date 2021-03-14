package StructuralPatterns.Bridge.Buildings;

import StructuralPatterns.Bridge.Brand;
import StructuralPatterns.Bridge.Building;

public class Appartament extends Building {
    public Appartament(Brand brand) {
        super(brand);
    }

    @Override
    public void getType() {
        System.out.println("Appartament");
    }
}
