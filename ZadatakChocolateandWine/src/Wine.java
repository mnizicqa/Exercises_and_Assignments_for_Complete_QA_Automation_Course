public class Wine extends Product {

//     Fields contain values where information about products will be stored
    public double wineBottleVolume;
    public final double wineTax = 0.1;

//    Parametrized constructor used to fill out necessary data for the object
    public Wine(String productName, String barCode, double basicPrice, double wineBottleVolume) {
        this.productName = productName;
        this.barCode = barCode;
        this.basicPrice = basicPrice;
        this.wineBottleVolume = wineBottleVolume;
    }

//  Override of method calculatePrice for the wine, when we add wineTax of 10% to already given pdv
    @Override
    public void calculatePrice() {
        this.price = (1 + wineTax) * (1 + pdv) * basicPrice;
    }


//     Override of predefined method toString(), where information about our selected type of product will be displayed
    @Override
    public String toString() {
        return "Product name: " + productName + " Product type: wine, Barcode: " + barCode + " Price with Value Added Tax: " + price + " KM, Volume: " + wineBottleVolume + " l.";
    }
}
