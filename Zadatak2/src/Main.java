import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // This is a program in which we can input whole number and check whether it is an odd or even number
        // Output would be a message which tells the user if the number is even or odd.
        Scanner entry = new Scanner(System.in);
        System.out.println("Please enter a whole number without decimals!");
        int number = entry.nextInt();

        if (number % 2 == 0) {
            System.out.println("Entered number " + number + " is an even number.");
        } else {
            System.out.println("Entered number " + number + " is an odd number.");
        }
    }
}