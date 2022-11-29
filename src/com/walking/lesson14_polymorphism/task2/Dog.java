package src.com.walking.lesson14_polymorphism.task2;

public class Dog extends Animal {

    public void woof(){
        System.out.println("Гав");
    }
    public void sound(){
        woof();
    }

}
