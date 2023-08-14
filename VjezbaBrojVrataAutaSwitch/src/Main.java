public class Main {

    public static void main(String[] args) {

        String carMake = "Audi";
        int doors = 3;

        if (carMake.equals("Ford")) {
            switch (doors) {
                case 1:
                    System.out.println("Car maker is Ford and the car has 1 door");
                    break;
                case 2:
                    System.out.println("Car maker is Ford and the car has 2 doors");
                    break;
                case 3:
                    System.out.println("Car maker is Ford and the car has 3 doors");
                    break;
                case 4:
                    System.out.println("Car maker is Ford and the car has 4 doors");
                    break;
                case 5:
                    System.out.println("Car maker is Ford and the car has 5 doors");
                    break;
                default:
                    System.out.println("Car maker Ford does not produce cars with more than 5 doors");
            }
        } else {
            System.out.println("Please select the car maker Ford");
        }
    }
}
