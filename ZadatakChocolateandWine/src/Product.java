public abstract class Product {

//     Fields contain values where information about products will be stored
    public String productName, barCode;
    public double basicPrice, price;
    public final double pdv = 0.2;

//    Method for price calculation of desired products
    public void calculatePrice() {
        this.price = (1 + pdv) * this.basicPrice;
    }
}
