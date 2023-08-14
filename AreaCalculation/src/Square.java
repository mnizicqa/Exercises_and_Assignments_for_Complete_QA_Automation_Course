
import java.util.Scanner;

public class Square extends Shape {

    public double a;

    public Square() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite stranicu kvadrata,da biste izračunali njegovu površinu!");
        this.a = scanner.nextDouble();
        area();
    }

    @Override
    public void area() {
        double squareArea = this.a * this.a;
        System.out.println("Površina kvadrata iznosi " + squareArea + "cm");
    }

    @Override
    public void show() {
        System.out.println("Ovo je kvadrat!");
    }

    public void show(String color,String name){
        System.out.println("Ovo je kvadrat, i njegova boja je " + color + " i zove se " + name);
    }

}
