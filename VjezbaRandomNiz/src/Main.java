import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] pojmovi = {"Heart", "Cherry", "Coin", "Melon", "Jocker"};
        System.out.println("Combination is:");

        for (int i = 0; i < pojmovi.length; i++) {
            Random random = new Random();
            int brojPojma = random.nextInt(pojmovi.length);
            System.out.print(" "+ pojmovi[brojPojma]);
        }
    }
}
