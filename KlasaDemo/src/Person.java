import fascikla.klasa;
public class Person {
    String firstName;
    String lastName;
    int age;
    double height;
    double weight;

    public Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void showDetails() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    fascikla.klasa klasa = new fascikla.klasa();
}
