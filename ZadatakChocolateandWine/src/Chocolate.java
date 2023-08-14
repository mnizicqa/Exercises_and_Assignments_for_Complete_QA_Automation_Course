public class Chocolate extends Product {

//     Field contains values where information about products will be stored
    public int chocolateWeight;

//     Parametrized constructor used to fill out necessary data for the object
    public Chocolate(String productName, String barCode, double basicPrice, int chocolateWeight) {
        this.productName = productName;
        this.barCode = barCode;
        this.basicPrice = basicPrice;
        this.chocolateWeight = chocolateWeight;
    }

//   Override of predefined method toString(), where information about our selected type of product will be displayed
    @Override
    public String toString() {
        return "Product name: " + productName + " Product type: chocolate, Barcode: " + barCode + " Price with Value Added Tax: " + price + " KM, Weight: " + chocolateWeight + " g.";
    }
}
