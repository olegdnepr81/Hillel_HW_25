import java.util.Scanner;

public class CalcIfElse {
    public static void main(String[] args) {

        CalcIfElse calcResult = new CalcIfElse();
        System.out.println("Ваш результат: " + calcResult.calc());
    }

    public double calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Введите знак \"+\" - сложение, \"-\" - вычитание,  \"*\" - умножение,  \"\\\" - деление:");
        scanner.nextLine();
        String symbol = scanner.nextLine(); // "+" - сложение, "-" - вычитание,  "*" - умножение,  "\" - деление
        System.out.println("Введите второе число:");
        double secondNumber = scanner.nextDouble();
        double result = 0;
        if (symbol.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (symbol.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (symbol.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (symbol.equals("/")) {
            result = firstNumber / secondNumber;
        }
        else {
            System.out.println("Некорректно введенные данные");
        }
        return result;
    }
}
