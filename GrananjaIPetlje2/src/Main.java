import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Unesite jedan cijeli broj: ");
//        int a = scanner.nextInt();

//        if (a % 2 == 0) {
//            if (a % 3 == 0) {
//                if (a % 5 == 0) {
//                    System.out.println("Unijeti broj " + a + " djeljiv sa 30");
//                }
//                System.out.println("Unijeti broj " + a + " djeljiv sa 6");
//            }
//            System.out.println("Unijeti broj " + a + " djeljiv sa 2");
//        } else if (a % 3 == 0) {
//            System.out.println("Unijeti broj " + a + " djeljiv sa 3");
//        } else if (a % 5 == 0) {
//            System.out.println("Unijeti broj " + a + " djeljiv sa 5");
//        } else {
//            System.out.println("Unijeti broj " + a + " nije djeljiv ni sa 2 ni sa 3 ni sa 5");
//        }

//        main:
//        for (int i = 0; i < 5; i++) {
//            inner:
//            for (int j = 0; j < 6; j++) {
//                if (j == 3) {
//                    System.out.println("Kuršlus");
//                    break inner;
//                }
//                System.out.println(j);
//            }
//            System.out.println(i);
//        }

//        int i = 0;
//        while (i<5) {
//            System.out.println(i);
//            i++;
//        }

//        int j = 8;
//        do {
//            System.out.println("Mi smo carevi");
//            j++;
//        } while (j < 2);

//        while (true) {
//            System.out.println("Ekstra");
//            break;
//        }
//
//        int[] a = new int[9];
//        int b[] = {1, 2, 3, 4, 5, 7};
//        a[0] = 1;
//        a[1] = 1;
//        a[2] = 3;
//        a[3] = 1;
//        a[4] = 32;
//        a[6] = 1;
//        a[7] = 1;
//        a[8] = 1;
//        int c = a[4];
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println("Član a [" + i + "] je: " + a[i]);
//        }

        String[][] x = {
                {"vanila", "čokolada", "biber"},
                {"automobil", "mobilni telefon", "avion"},
                {"kvaka"}
        };

        for (int i = 0; i < x.length; i++) {
            System.out.println(" Pojmovi: ");
            for (int j = 0; j < x.length; j++) {
                System.out.println(x[i][j]+"\t");
            }
        }
    }
}
