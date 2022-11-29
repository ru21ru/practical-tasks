package src.com.walking.lesson14_polymorphism.task1;

import java.util.Scanner;

/*Реализуйте класс «Правильная фигура». Для него создайте классы-наследники «Треугольник» и «Квадрат».

        Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
        Программа должна нарисовать в консоли выбранную пользователем фигуру,
        используя символы '-', '|', '/', '\'.

        Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер фигуры:");
        int sizeFigure = scanner.nextInt();
        if (sizeFigure < 1) {
            System.out.println("Фигура размера меньше одного уродская, лучше Вам на это не смотреть");
            return;
        }
        System.out.println("");
        System.out.print("Введите количество углов фигуры (3 или 4):");
        int numAngel = scanner.nextInt();
        if (numAngel == 3) {
            Triangle triangle = new Triangle(sizeFigure);
            triangle.printFigure();
        }
        else if (numAngel == 4) {
            Rectangle rectangle = new Rectangle(sizeFigure);
            rectangle.printFigure();
        }
        else {
            System.out.println("Нет реализации вывода фигур с другим количеством углов");
        }
    }
}
