/**
 * version 1.0
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        greeting();
        startApplication();

    }

    static void greeting() {
        System.out.println("Простейший калькулятор");
        System.out.println("Добрый день это программа простейщший калькулятор v1.0\n" +
                "пока он может только выполнять простые действия с двумя числами.");
    }

    static void startApplication() {
        divide();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        divide();

        System.out.print("Выберите действие которое хотите совершить:\n" +
                "1) +(сложение)\n" +
                "2) -(вычитание)\n" +
                "3) /(деление)\n" +
                "4) (*)умножение\n" +
                "5) Возведение первого числа в степень второго\n" +
                "6) Корень первого числа возвести в степень второго\n");
        System.out.print("Выберите числом: ");
        int action = scanner.nextInt();
        if (action != 1 & action != 2 & action != 3 & action != 4 & action != 5 & action != 6) {
            System.out.println("Вы выбрали неправильное действие!");
            replay();
        }
        divide();
        act(num1, num2, action);
    }

    static void act(int num1, int num2, int action) {
        if (action == 1) {
            addition(num1, num2);
        } else if (action == 2) {
            subtraction(num1, num2);
        } else if (action == 3) {
            segmentation(num1, num2);
        } else if (action == 4) {
            multiplication(num1, num2);
        } else if (action == 5) {
            exponentiation(num1, num2);
        } else if (action == 6) {
            rooting(num1, num2);
        }
    }

    static void addition(int num1, int num2) {
        System.out.println("Результат выражения: " + num1 + " + " + num2 + " = " + (num1 + num2));
        continueWork();
    }

    static void subtraction(int num1, int num2) {
        System.out.println("Результат выражения: " + num1 + " - " + num2 + " = " + (num1 - num2));
        continueWork();
    }

    static void segmentation(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Деление на ноль запрещено!");
            replay();
        } else {
            if (num1 % num2 == 0) {
                System.out.println("Результат выражения: " + num1 + " / " + num2 + " = " + (num1 / num2));
                continueWork();
            } else {
                double result = (double) num1 / num2;
                System.out.println("Результат выражения: " + num1 + " / " + num2 + " = " + result);
                continueWork();
            }
        }
    }

    static void multiplication(int num1, int num2) {
        System.out.println("Результат выражения: " + num1 + " * " + num2 + " = " + (num1 * num2));
        continueWork();
    }

    static void exponentiation(int num1, int num2) {
        int num3 = num1;
        if (num2 == 0 || num2 == 1) {
            System.out.println("Результат выражения: " + num1);
            continueWork();
        } else {
            exponentiation2(num1, num2, num3);
        }
    }

    static void exponentiation2(int num1, int num2, int num3) {
        if (num2 > 1) {
            num1 = num1 * num3;
            num2 = num2 - 1;
            exponentiation2(num1, num2, num3);
        } else {
            System.out.println("Результат выражения: " + num1);
            continueWork();
        }
    }

    static void rooting(int num1, int num2){
        int result = num1 * num1;
        if (num1 == 0 || num1 == 1) {
            exponentiation(num1, num2);
        } else {
            exponentiation(result,num2);
        }
    }

    static void continueWork() {
        Scanner scanner = new Scanner(System.in);
        divide();
        System.out.println("Вы хотите продолжить?\n" +
                "1) Да\n" +
                "2) Нет");
        System.out.print("Ваш выбор: ");
        int result = scanner.nextInt();


        if (result == 1) {
            replay();
        } else if (result == 2) {
            System.exit(0);
        } else {
            System.out.println("Вы выбрали неправильное действие");
            continueWork();
        }
    }

    static void replay() {
        Scanner scanner = new Scanner(System.in);
        divide();
        System.out.println("Вернуться к действию:\n" +
                "1) Ввода чисел\n" +
                "2) Выход");
        System.out.print("Ваш выбор: ");
        int result = scanner.nextInt();

        if (result == 1) {
            startApplication();
        } else if (result == 2) {
            System.exit(0);
        } else {
            System.out.println("Вы выбрали неправильное действие");
            replay();
        }
    }

    static void divide() {
        System.out.println("****************************************************");
    }
}
