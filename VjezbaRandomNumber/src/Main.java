import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            System.out.println();
            System.out.println("Dobrodošli u igru Vidovita Vanga!");
            System.out.println("Da li ste spremni da testirate svoju vještinu vidovitosti?");
            System.out.println("Zamislila sam jedan broj, a na tebi je da pogodiš.");
            Thread.sleep(3000);
            System.out.println("Koji sam broj zamislila?");

            Random random = new Random();
            int brojVidoviteVange = random.nextInt(6);
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Da vidim kako pogađaš? Unesi broj, pa da vidimo da li si vidovit.");
            int unosBroja = scanner.nextInt();

            if (unosBroja == brojVidoviteVange) {
                System.out.println("Vidovit si! Pogodio si broj koji sam zamislila.");
                break;
            } else {
                System.out.println("Probaj ponovo! Nisi pogodio broj koji sam zamislila!");
            }
        }
    }
}