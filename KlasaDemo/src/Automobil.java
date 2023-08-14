public class Automobil {
    int yearOfManufacture;
    private String carBrand;
    String model;
    int numberOfDoors;
    int numberOfGears;
    String color;

    public void setCarBrand(String carBrand){
        this.carBrand = carBrand;
    }
    public String getCarBrand(){
        return carBrand;
    }

    public void paintCar(String color){
        this.color = color;
    }
}
