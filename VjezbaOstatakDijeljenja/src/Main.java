public class Main {

    public static void main(String[] args) {

        int x = 523134;
        int y = 325423;

        if (x % y == 0) {
            System.out.println("Ne postoji ostatak dijeljenja brojeva " + x + " i" + y);
        } else if (x % y > 1000) {
            System.out.println("OStatak dijeljenja brojeva " + x + " i " + y + " je veći od 1000");
        } else if (x % y < 1000) {
            System.out.println("OStatak dijeljenja brojeva " + x + " i " + y + " je veći od 1000");
        }
    }
}