package src.com.walking.lesson14_polymorphism.task2;

public class Cat extends Animal {

    public void meow(){
        System.out.println("Мяу");
    }

    public void sound(){
        meow();
    }
}
