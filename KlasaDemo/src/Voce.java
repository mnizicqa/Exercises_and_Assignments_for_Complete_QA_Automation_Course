public class Voce extends Proizvod {

    String fruitType;
    double weight;
    double basePrice;

    public Voce(String fruitType, double weight, double basePrice) {
        this.fruitType = fruitType;
        this.weight = weight;
        this.basePrice = basePrice;
    }

    @Override
    public void calculatePrice() {
        double price = weight * basePrice;
        System.out.println("Cijena voća je " + price + " KM.");
    }
}
