import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Automobil automobil = new Automobil();
//        automobil.yearOfManufacture = 2014;
//        automobil.setCarBrand("Audi");
//        automobil.model = "A4";
//        automobil.numberOfDoors = 4;
//        automobil.numberOfGears = 6;
//        System.out.println(automobil.getCarBrand() + " " + automobil.model + " " + automobil.yearOfManufacture);
//        automobil.paintCar("Crvena");
//        System.out.println(automobil.color);

//        Scanner scanner = new Scanner(System.in);
//        Person person = new Person("Marko", "Marković", 25, 185, 85);
//        System.out.println(person.firstName + " " + person.lastName + " " + person.age);
//        System.out.println("Kreirajmo novu osobu!");
//        System.out.println("Unesite ime osobe!");
//        person.firstName = scanner.nextLine();
//        System.out.println("Unesite prezime osobe!");
//        person.lastName = scanner.nextLine();
//        System.out.println("Koliko osoba ima godina?");
//        person.age = scanner.nextInt();
//        System.out.println("Koliko je osoba visoka?");
//        person.height = scanner.nextDouble();
//        System.out.println("Koliko je osoba teška?");
//        person.weight = scanner.nextDouble();
//        Student student = new Student("Martin", "Martinović", 18, 185, 85, "Prva Gimanzija", "IV-5");
//        System.out.println(student.firstName + " " + student.lastName + " " + student.classNum);
//        student.firstName = "Martin";
//        student.lastName = "Martinović";
//        student.age = 18;
//        student.height = 185;
//        student.weight = 85;
//        student.schoolName = "Prva Gimnazija";
//        student.classNum = "IV-5";
//        Professor professor = new Professor("Jela", "Dunović", 65, 170, 70, "Čengić Vila I", 30);
//        System.out.println(professor.firstName + " " + professor.lastName + " " + professor.schoolName);
//        professor.headmaster = "IV-3";
//        ProfessorPrirodnihNauka professorPrirodnihNauka = new ProfessorPrirodnihNauka("Jela", "Dunović", 65, 170, 70, "Čengić Vila I", 30, "Matematika");
//        System.out.println(professorPrirodnihNauka.firstName + " " + professorPrirodnihNauka.lastName + " " + professorPrirodnihNauka.subject);
//        person.showDetails();
//        student.showDetails();
//        student.showDetails("ice skating");
//        student.showDetails(45);
//        professor.showDetails();

        Voce voce = new Voce("Kruške",0.8, 5);
        voce.calculatePrice();
    }
}