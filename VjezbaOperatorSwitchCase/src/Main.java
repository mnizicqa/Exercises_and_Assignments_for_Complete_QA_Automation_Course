import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvi operand:");
        double operand1 = scanner.nextDouble();
        System.out.println("Unesite drugi operand:");
        double operand2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Unesite željeni operator: +,-,*,/");
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                System.out.println("Zbir dva operanda je: " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Razlika dva operanda je: " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Proizvod dva operanda je: " + (operand1 * operand2));
                break;
            case "/":
                System.out.println("Količnik dva operanda je: " + (operand1 / operand2));
                break;
            default:
                System.out.println("Unijeli ste nepodržani operator! Molimo Vas probajte ponovo!");
        }
    }
}