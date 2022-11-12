package Lesson6.obj;


public class Cat extends Animal {
    private String color;

    public Cat(boolean vegetarian, String eats, int noOfLegs, String name, String color) {
        super(vegetarian, eats, noOfLegs, name);
        this.color = color;
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs, String name) {
        super(vegetarian, eats, noOfLegs, name);
        this.color = "black";
    }

    public void Voice() {
        System.out.println("Cat " + getName() + " says MurMurMur");
    }

    public void Print() {
        System.out.println("Cat was created:");
        System.out.println("Is vegetarian? -"+isVegetarian());
        System.out.println("What does it eat? -"+getEats());
        System.out.println("Number of legs? -"+getNoOfLegs());
        System.out.println("Name? -"+getName());
        System.out.println("Color? -"+color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
