package Prototype;

public class ConcretePizza extends Pizza {

    private String size;
    private String sauce;
    private String cheese;
    private String mushrooms;
    private String sausages;
    private String toppings;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(String mushrooms) {
        this.mushrooms = mushrooms;
    }

    public String getSausages() {
        return sausages;
    }

    public void setSausages(String sausages) {
        this.sausages = sausages;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    Pizza make() throws CloneNotSupportedException {
        return (Pizza) super.clone();
    }

    @Override
    public String toString() {
        return "ConcretePizza{" +
                "size='" + size + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", mushrooms='" + mushrooms + '\'' +
                ", sausages='" + sausages + '\'' +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}
