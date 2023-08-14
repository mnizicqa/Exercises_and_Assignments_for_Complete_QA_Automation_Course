public class Main {

    public static void main(String[] args) {

        String[] pojam = {"bicycle", "car", "mobile phone"};
        String[] model = {"BMX", "Renault 4", "Iphone"};
        double[] cijena = {300, 10000, 2000};

        for (int i = 0; i < 3; i++) {
            System.out.println(model[i] + " is type " + pojam[i] + " and it costs " + cijena[i] + " KM.");
        }

    }
}