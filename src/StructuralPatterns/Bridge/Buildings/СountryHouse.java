package StructuralPatterns.Bridge.Buildings;

import StructuralPatterns.Bridge.Brand;
import StructuralPatterns.Bridge.Building;

public class СountryHouse extends Building {
    public СountryHouse(Brand brand) {
        super(brand);
    }

    @Override
    public void getType() {
        System.out.println("Сountry House");
    }
}
