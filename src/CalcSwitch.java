import java.util.Scanner;

public class CalcSwitch {
    public static void main(String[] args) {

        CalcSwitch calcResult = new CalcSwitch();
        System.out.println("Ваш результат: " +  calcResult.calc());
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
        switch (symbol) {
            case "+":
                return result = firstNumber + secondNumber;

            case "-":
                return result = firstNumber - secondNumber;

            case "*":
                return result = firstNumber * secondNumber;

            case "/":
                return result = firstNumber / secondNumber;

            default:
                System.out.println("Некорректно введенные данные");
                break;
        }
        return result;
    }
}