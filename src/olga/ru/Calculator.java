package olga.ru;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите значение переменной: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double y = scanner.nextDouble();
        char operator1 = scanner.next().charAt(0);
        double z = scanner.nextDouble();

        System.out.println("=");
        if (operator == '+' && operator1 == '+') {
            System.out.println((x + y) + z);
        } else if (operator == '+' && operator1 == '-') {
            System.out.println((x + y) - z);
        } else if (operator == '+' && operator1 == '*') {
            System.out.println((x + y) * z);
        } else if (operator == '+' && operator1 == '/') {
            System.out.println((x + y) / z);
        }

        if (operator == '-' && operator1 == '+') {
            System.out.println((x - y) + z);
        } else if (operator == '-' && operator1 == '-') {
            System.out.println((x - y) - z);
        } else if (operator == '-' && operator1 == '*') {
            System.out.println((x - y) * z);
        } else if (operator == '-' && operator1 == '/') {
            System.out.println((x - y) / z);
        }

        if (operator == '*' && operator1 == '+') {
            System.out.println((x * y) + z);
        } else if (operator == '*' && operator1 == '-') {
            System.out.println((x * y) - z);
        } else if (operator == '*' && operator1 == '*') {
            System.out.println((x * y) * z);
        } else if (operator == '+' && operator1 == '/') {
            System.out.println((x * y) / z);
        }

        if (operator == '/' && operator1 == '+') {
            System.out.println((x / y) + z);
        } else if (operator == '/' && operator1 == '-') {
            System.out.println((x / y) - z);
        } else if (operator == '/' && operator1 == '*') {
            System.out.println((x / y) * z);
        } else if (operator == '/' && operator1 == '/') {
            System.out.println((x / y) / z);
        }
    }
}
