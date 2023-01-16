package src.com.walking.lesson33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String FILE_NAME = "./Resource/carCatalog.txt";

        Car car1 = new Car("666", 2020, "black", true);
        Car car2 = new Car("2222", 2027, "blue", false);

        CarRepository carRepository = new CarRepository();

        carRepository.writeCar(FILE_NAME, car1,  carAction.CAREATE_CATALOG);
        carRepository.writeCar(FILE_NAME, car2, carAction.ADD);

        Car car = carRepository.readCar(FILE_NAME, "2222");
        System.out.println(car);
    }
}
