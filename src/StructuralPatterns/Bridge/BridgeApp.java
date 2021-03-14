package StructuralPatterns.Bridge;

import StructuralPatterns.Bridge.Brands.Dansicons;
import StructuralPatterns.Bridge.Buildings.Appartament;

public class BridgeApp {
    public static void main(String[] args) {
        Building building = new Appartament(new Dansicons());
        building.getDetails();
    }
}
