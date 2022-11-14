package Homework7.work;

import Homework7.obj.*;

public class Main7 {
    public static void main(String[] args) {
        Cat cat = new Cat("Bobby");
        Dog dog = new Dog("Sharik"),
                dog1 = new Dog("Recks");
        BigDog bigDog = new BigDog("BARBOS");
        Lion lion = new Lion("Cezar");
        Wolf wolf = new Wolf("Zver");
        cat.greets();
        cat.feed();
        cat.play();
        cat.walk();
        dog.greets();
        dog.feed();
        dog.play();
        dog.walk();
        dog.greets(dog1);
        bigDog.greets();
        bigDog.greets(dog1);
        bigDog.greets(new BigDog("TUZIK"));
        lion.greets();
        lion.hunting();
        wolf.greets();
        wolf.hunting();
    }

}
