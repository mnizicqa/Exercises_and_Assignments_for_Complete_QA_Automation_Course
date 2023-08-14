import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Dobrodošli u informacioni sistem za izbor jednog od dvije vrste proizvoda!");
        System.out.println("Možete izabrati između čokolade i vina!");
        System.out.println("Za odabir redoslijeda prvo čokolada pa onda vino unesite 1, a za odabir prvo vino pa onda čokolada unesite 2!");
        int choice = scanner.nextInt();

        if (choice == 1) {
            scanner.nextLine();
            System.out.println("Unesite ime čokolade koju ste odabrali:");
            String chocolateName = scanner.nextLine();
            System.out.println("Unesite barcode čokolade koju ste odabrali:");
            String chocolateBarCode = scanner.nextLine();
            System.out.println("Unesite baznu cijenu željene čokolade(KM):");
            double chocolateBasicPrice = scanner.nextDouble();
            System.out.println("Unesite baznu težinu željene čokolade(g):");
            int chocolateWeight = scanner.nextInt();
            Chocolate chocolate = new Chocolate(chocolateName, chocolateBarCode, chocolateBasicPrice, chocolateWeight);
            scanner.nextLine();
            System.out.println("Unesite ime vina koju ste odabrali:");
            String wineName = scanner.nextLine();
            System.out.println("Unesite barcode vina koje ste odabrali:");
            String wineBarCode = scanner.nextLine();
            System.out.println("Unesite baznu cijenu željenog vina(KM):");
            double wineBasicPrice = scanner.nextDouble();
            System.out.println("Unesite baznu težinu željenog vina(l):");
            int wineWeight = scanner.nextInt();
            scanner.nextLine();
            Wine wine = new Wine(wineName, wineBarCode, wineBasicPrice, wineWeight);
            System.out.println("Da li ste sigurni u vaš željeni izbor? Ukoliko jeste, molimo da ukucate slovo Y, a ukoliko niste pritisnite bilo koji drugi karakter!");
            String confirmation = scanner.nextLine();

            if (confirmation.equals("Y")) {
//                Method to calculate price of the chocolate and display the results
                chocolate.calculatePrice();
                System.out.println("Cijena čokolade sa uračunatim PDV-om je " + chocolate.price + " KM.");
                String chocolateOutput = chocolate.toString();
                System.out.println(chocolateOutput);
                System.out.println();
//                Method to calculate price of the wine and display the results
                wine.calculatePrice();
                System.out.println("Cijena vina sa uračunatim PDV-om je " + wine.price + " KM.");
                String wineOutput = wine.toString();
                System.out.println(wineOutput);
                System.out.println();
            }
        } else if (choice == 2) {
            scanner.nextLine();
            System.out.println("Unesite ime vina koju ste odabrali:");
            String wineName = scanner.nextLine();
            System.out.println("Unesite barcode vina koje ste odabrali:");
            String wineBarCode = scanner.nextLine();
            System.out.println("Unesite baznu cijenu željenog vina(KM):");
            double wineBasicPrice = scanner.nextDouble();
            System.out.println("Unesite baznu težinu željenog vina(l):");
            int wineWeight = scanner.nextInt();
            Wine wine = new Wine(wineName, wineBarCode, wineBasicPrice, wineWeight);
            scanner.nextLine();
            System.out.println("Unesite ime čokolade koju ste odabrali:");
            String chocolateName = scanner.nextLine();
            System.out.println("Unesite barcode čokolade koju ste odabrali:");
            String chocolateBarCode = scanner.nextLine();
            System.out.println("Unesite baznu cijenu željene čokolade(KM):");
            double chocolateBasicPrice = scanner.nextDouble();
            System.out.println("Unesite baznu težinu željene čokolade(g):");
            int chocolateWeight = scanner.nextInt();
            Chocolate chocolate = new Chocolate(chocolateName, chocolateBarCode, chocolateBasicPrice, chocolateWeight);
            scanner.nextLine();
            System.out.println("Da li ste sigurni u vaš željeni izbor? Ukoliko jeste, molimo da ukucate slovo Y, a ukoliko niste pritisnite bilo koji drugi karakter!");
            String confirmation = scanner.nextLine();

            if (confirmation.equals("Y")) {

//            Method to calculate price of the wine and display the results
                wine.calculatePrice();
                System.out.println("Cijena vina sa uračunatim PDV-om je " + wine.price + " KM.");
                String wineOutput = wine.toString();
                System.out.println(wineOutput);
                System.out.println();

//            Method to calculate price of the chocolate and display the results
                chocolate.calculatePrice();
                System.out.println("Cijena čokolade sa uračunatim PDV-om je " + chocolate.price + " KM.");
                String chocolateOutput = chocolate.toString();
                System.out.println(chocolateOutput);
                System.out.println();
            }
        } else {
            System.out.println("Unijeli ste nedozvoljenu opciju! Molim Vas da pokušate ponovo!");
        }
        System.out.println("Hvala Vam na korištenju našeg informacionog sistema! Dođite nam ponovo!");
    }
}