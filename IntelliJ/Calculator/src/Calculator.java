import java.util.Scanner;

public class Calculator {

    public static double initializeNumber() {
        while (true) {
            double number;
            Scanner console = new Scanner(System.in);
            if (console.hasNextInt()) {
                number = (double) console.nextInt();
                return number;
            } else if (console.hasNextDouble()) {
                number = console.nextDouble();
                return number;
            } else {
                System.out.print("Надо ввести число!\nВведите число: ");
            }
        }

    }

    public static char initializeOperator() {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.print("Введите один из математических операторов: сложение (+), вычитание (-), умножение (*) или деление (/): ");
            char operator = console.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                return operator;
            } else {
                System.out.println("Ошибка. Неверный математический оператор! Попробуйте снова.");
            }
        }
    }

    public static double calculate(double a, double b, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = a + b;
                return result;
            case '-':
                result = a - b;
                return result;
            case '*':
                result = a * b;
                return result;
            case '/':
                if (b != 0) {
                    result = a / b;
                    return result;
                } else {
                    System.out.println("Делить на ноль нельзя!");
                    return 0;
                }
            default:
                System.out.println("Неизвестная операция!");
                return 0;
        }
    }
}

