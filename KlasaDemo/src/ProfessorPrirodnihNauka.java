public class ProfessorPrirodnihNauka extends Professor{

    String subject;

    public ProfessorPrirodnihNauka(String firstName, String lastName, int age, double height, double weight, String schoolName, int yearsOfExperience, String subject) {
        super(firstName, lastName, age, height, weight, schoolName, yearsOfExperience);
        this.subject = subject;
    }

}
