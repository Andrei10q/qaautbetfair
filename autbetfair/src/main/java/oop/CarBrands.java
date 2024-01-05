package oop;

public class CarBrands {
    private float maxSpeed;
    private int maxGear;
    private String brand;
    private String model;
    private FuelType fuelType;

    // Constructor
    public CarBrands() {
       this.maxGear = 6;
       this.maxSpeed = 200;
       this.brand = "DACIA";
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxGear() {
        return maxGear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "CarBrand{" +
                "maxSpeed=" + maxSpeed +
                ", maxGear=" + maxGear +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType=" + fuelType +
                '}';
    }
}
