package src.com.walking.lesson14_polymorphism.task2;

public class Main {
    public static void sound(Animal arrayAnimals[]){
        for (Animal animal: arrayAnimals) {
            animal.sound();
        }
    }
    public static void main(String[] args) {
        Cow cow = new Cow();
        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal arrayAnimal[] = new Animal[3];
        arrayAnimal[0] = cat;
        arrayAnimal[1] = cow;
        arrayAnimal[2] = dog;
        sound(arrayAnimal);
    }
}
