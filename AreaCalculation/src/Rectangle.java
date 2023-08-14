import java.util.Scanner;

public class Rectangle extends Shape {

    double a;
    double b;

    public Rectangle() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite stranicu a pravougaonika da biste izračunali njegovu površinu!");
        this.a = scanner.nextDouble();
        System.out.println("Unesite stranicu b pravougaonika da biste izračunali njegovu površinu!");
        this.b = scanner.nextDouble();
        area();
    }

    @Override
    public void area() {
        double rectangleArea = this.a * this.b;
        System.out.println("Površina pravougaonika iznosi " + rectangleArea + "cm");
    }

}
