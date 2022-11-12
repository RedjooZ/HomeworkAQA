package Lesson6.work;

import Lesson6.obj.Cat;

public class Lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat(false, "meat and fish", 4, "Barsik"),
                cat1 = new Cat(false, "fish and milk", 4, "Bysya", "White");
        cat.Print();
        cat1.Print();
    }
}
