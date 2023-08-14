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

        if (operator.equals("+")) {
            System.out.println("Zbir dva operanda je: " + (operand1 + operand2));
        } else if(operator.equals("-")){
            System.out.println("Razlika dva operanda je: " + (operand1 - operand2));
        } else if(operator.equals("*")){
            System.out.println("Proizvod dva operanda je: " + (operand1 * operand2));
        } else if(operator.equals("/")){
            System.out.println("Količnik dva operanda je: " + (operand1 / operand2));
        } else {
            System.out.println("Unijeli ste nepodržani operator! Molimo Vas probajte ponovo!");
        }
    }
}