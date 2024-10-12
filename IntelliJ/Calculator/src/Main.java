public class Main {
    public static void main(String[] args) {
            System.out.print("Введите первое число: ");
            double firstInt = Calculator.initializeNumber();
            char operator = Calculator.initializeOperator();
            System.out.print("Введите второе число: ");
            double secondInt = Calculator.initializeNumber();
            double result = Calculator.calculate(firstInt, secondInt, operator);
            if (result % 1 == 0)
                System.out.println("Результат: " + (int) result);
            else
                System.out.println("Результат: " + result);
        }
}