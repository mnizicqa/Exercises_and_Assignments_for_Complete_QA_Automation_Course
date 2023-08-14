public class Student extends Person {

    String schoolName;
    String classNum;

    public Student(String firstName, String lastName, int age, double height, double weight, String schoolName, String classNum) {
        super(firstName, lastName, age, height, weight);
        this.schoolName = schoolName;
        this.classNum = classNum;
    }

    @Override
    public void showDetails() {
        System.out.println("Student" + " " + this.firstName + " " + this.lastName + " " + "has the following details:");
        System.out.println("School Name: " + this.schoolName);
        System.out.println("Class Num: " + this.classNum);
    }

    public void showDetails(String hobby){
        System.out.println("Our student " + this.firstName + " " + this.lastName + " " + "has the following hobby and it is "+hobby + ".");
    }

    public void showDetails(int shoeSize){
        System.out.println("Our student " + this.firstName + " " + this.lastName + " " + "has the following shoe size and it is "+shoeSize + ".");
    }
}
