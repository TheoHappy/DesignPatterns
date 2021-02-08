package Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePizza pepperoni = new ConcretePizza();
        pepperoni.setSize("XL");
        pepperoni.setSauce("Pizza sauce");
        pepperoni.setCheese("mozzarella");
        pepperoni.setSausages("pepperoni");
        System.out.println(pepperoni);

        ConcretePizza superemePizza = (ConcretePizza) pepperoni.make();
        superemePizza.setMushrooms("Champignons");
        superemePizza.setToppings("Olives");
        System.out.println(superemePizza);
    }
}
