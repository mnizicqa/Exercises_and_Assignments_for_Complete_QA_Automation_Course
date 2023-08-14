import java.util.Scanner;

public class Circle extends Shape {

    public double r;
    public final double Pi = 3.14;

    public Circle() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite poluprečnik kruga!");
        this.r = scanner.nextDouble();
        area();
    }

    @Override
    public void area() {
        double circleArea = this.r * this.r * Pi;
        System.out.println("Površina kruga iznosi " + circleArea + "cm");
    }
}
