package Lesson5;

public class Dog {
   private String name;
    private int age;
    private String color;
    private int height;

    public Dog(String name, int age, String color, int height) {
        this.name = name;
        if (age>0&&age<20){
            this.age = age;
        }
        this.color = color;
        this.height = height;
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        this.age = 5;
        this.height = 80;
    }
    public Dog() {
        System.out.println("Creating object of the class Dog");
    }

    public void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
        System.out.println(height);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
