import java.util.Scanner;

public class Calculator {
    double operand1, operand2;
    Scanner entry;

    public Calculator() {
        this.entry = new Scanner(System.in);
        System.out.println("Please enter first decimal number!");
        this.operand1 = entry.nextDouble();
        System.out.println("Please enter second decimal number!");
        this.operand2 = entry.nextDouble();
    }

    public void add() {
        System.out.println("Sum of these two decimal numbers is " + (this.operand1 + this.operand2));
    }

    public void sub() {
        System.out.println("When we subtract these two decimal numbers we get " + (this.operand1 - this.operand2));
    }

    public void mul() {
        System.out.println("When we multiply these two decimal numbers we get " + (this.operand1 * this.operand2));
    }

    public void div() {
        System.out.println("When we divide these two decimal numbers we get " + (this.operand1 / this.operand2));
    }
}
