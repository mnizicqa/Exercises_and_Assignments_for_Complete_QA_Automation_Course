import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Console c = System.console();
//        c.writer().println("Enter first operand:");
//        String operand1 = c.readLine();
//        c.writer().println("Enter second operand:");
//        String operand2 = c.readLine();
//        c.writer().println("Result is:");
//        c.writer().println(Integer.parseInt(operand1) + Integer.parseInt(operand2));
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first operand:");
//        int op1 = scanner.nextInt();
//        System.out.println("Enter second operand:");
//        int op2 = scanner.nextInt();
//        System.out.println("Result is: " + (op1 + op2));

//        double x = 10.5;
//        int y = (int) x;
//        System.out.println(y);

        int x = 330;
        int y = 20;

        if (x>=y || y>500){
            System.out.println("X je veće od Y!");
        }else {
            System.out.println("Y je veće od X!");
        }
    }
}