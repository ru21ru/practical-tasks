package com.walking.lesson2_operators_console_io;

import java.util.Scanner;

/**
 * Введите с клавиатуры целые числа a и b.
 * Выведите на экран результат сравнения:
 * a3 > b2,       где a3 - a в кубе, b2 - b  в квадрате
 */
public class Task2 {
    public static void main(String[] args) {
//        Создаем сканер для чтения с клавиатуры
        Scanner scanner = new Scanner(System.in);

//        Выводим сообщение "Enter a: " в консоль.
//        Данное сообщение не является обязательным, лишь информирует пользователя,
//        какое действие от него ожидается
        System.out.print("Enter a: ");
//        Объявляем переменную а типа int и записываем в нее значение, введенное с клавиатуры
        int a = scanner.nextInt();

//        Повторяем те же действия для b
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

//        Сканер более не используется, ее необходимо закрыть.
//        Зачем - разберемся, когда будем изучать I/O Streams
        scanner.close();

//        Выводим результат выражения в консоль.
//        Также можно было записать результат выражения в переменную.
//        Это слегка увеличило бы читаемость кода
        System.out.println(a * a * a > b * b);
    }

    /*
     * Примечание: Возводить в степень можно с использованием Math.pow(),
     * не имею ничего против.
     * Однако на данный момент мы еще не знакомились с функциональностью класса Math.
     * */
}
