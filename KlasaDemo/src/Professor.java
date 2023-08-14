public class Professor extends Person {

    String schoolName;
    int yearsOfExperience;
    String headmaster;

    public Professor(String firstName, String lastName, int age, double height, double weight, String schoolName, int yearsOfExperience) {
        super(firstName, lastName, age, height, weight);
        this.schoolName = schoolName;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void showDetails() {
        System.out.println("Professor" + " " + this.firstName + " " + this.lastName + " " + "has the following details:");
        System.out.println("Years of Experience : " + this.yearsOfExperience);

    }
}
