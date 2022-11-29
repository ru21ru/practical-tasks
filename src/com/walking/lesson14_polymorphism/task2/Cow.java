package src.com.walking.lesson14_polymorphism.task2;

public class Cow extends Animal {

    public void moo(){
        System.out.println("Муууу");
    }
    public void  sound(){
        moo();
    }
}
