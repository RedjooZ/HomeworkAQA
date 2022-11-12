package Lesson6.obj;

public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;
    private String name;

    public Animal(boolean vegetarian, String eats, int noOfLegs, String name) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
        this.name = name;
    }

    public Animal() {
        System.out.println("Animal was created");
        ;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
