package Homework7.obj;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog dog) {
        System.out.println("Wooooow "+dog.getName());
    }
    public void greets(BigDog bigDog){
        System.out.println("Woooooooooow "+bigDog.getName());
    }

}
