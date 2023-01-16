package src.com.walking.lesson33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

enum carAction {ADD, DELETE, EDIT, CAREATE_CATALOG}

public class CarRepository {
    public static void writeCar(String fileName, Car car, carAction action) {
        boolean rewrite = action == carAction.ADD;

        byte[] carByte = car.toString().getBytes();
        try {
            FileOutputStream fso = new FileOutputStream(fileName, rewrite);
            fso.write(carByte);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String[] getFileStrings(String fileName) {

        String[] arrayString;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            byte[] carByte = fis.readAllBytes();
            String readString = new String(carByte);
            arrayString = readString.split("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return arrayString == null ? new String[0] : arrayString;
    }

    public static <T> T getValue(String str, String valueName, T currentValue) {

        if (valueName.equals("number") && str.indexOf(valueName) != -1) {
            return (T) str.substring(str.indexOf(":") + 1).trim();
        } else if (valueName.equals("year") && (str.indexOf(valueName) != -1)) {
            return (T) Integer.valueOf(str.substring(str.indexOf(":") + 1).trim());
        } else if (valueName.equals("color") && str.indexOf(valueName) != -1) {
            return (T) str.substring(str.indexOf(":") + 1).trim();
        } else if (valueName.equals("actualTechnicalInspection") && str.indexOf(valueName) != -1) {
            return (T) (str.indexOf("not") != -1 ? Boolean.TRUE : Boolean.FALSE);
        }

        return currentValue;
    }

    public static Car readCar(String fileName, String carNumber) {
        String number = "";
        int year = 0;
        String color = "";
        boolean actualTechnicalInspection = false;

        String currentString;
        String[] arrayString = getFileStrings(fileName);

        boolean carFinded = false;
        int length = arrayString.length;
        for (int i = 0; i < length; i++) {
            number = getValue(arrayString[i], "number", number);
            if (number != null && !carFinded && number.equals(carNumber)) {
                length = i + 4;
                carFinded = true;
                continue;
            } else if (!carFinded) {
                i += 3;
                continue;
            }
            //year = getValue(arrayString[i], "year");
            if (arrayString[i].indexOf("year") != -1) {
                year = getValue(arrayString[i], "year", year);
                ;
            } else if (arrayString[i].indexOf("color") != -1) {
                color = getValue(arrayString[i], "color", color);
            } else if (arrayString[i].indexOf("actualTechnicalInspection") != -1) {
                actualTechnicalInspection = getValue(arrayString[i], "actualTechnicalInspection", actualTechnicalInspection);
                ;
            }

        }
            Car car;
            if (!number.isBlank() && (year > 0)) {
                car = new Car(number, year, color, actualTechnicalInspection);
            } else {
                car = null;
            }
            return car;

    }
}