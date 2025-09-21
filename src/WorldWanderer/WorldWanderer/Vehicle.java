package WorldWanderer;

// Author: Jose Ortega (s3779997) / 100%

public class Vehicle {
    private String registrationID;
    private String licensePlate;
    private String model;
    private String brand;
    private String engine;
    private int year;
    private String transmission;
    private String type;
    private double vehiclePrice;

    public Vehicle() {}

    public Vehicle(String registrationID, String licensePlate, String model, String brand, String engine,
                   int year, String transmission, String type, double vehiclePrice) {
        this.registrationID = registrationID;
        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
        this.engine = engine;
        this.year = year;
        this.transmission = transmission;
        this.type = type;
        this.vehiclePrice = vehiclePrice;
    }

    public String getRegistrationID() { return registrationID; }
    public String getLicensePlate() { return licensePlate; }
    public String getModel() { return model; }
    public String getBrand() { return brand; }
    public String getEngine() { return engine; }
    public int getYear() { return year; }
    public String getTransmission() { return transmission; }
    public String getType() { return type; }
    public double getVehiclePrice() { return vehiclePrice; }

    // Calculate rental price based on user's destination and duration
    public double calculateRentalCost(int days) {
        return 0;
    }
}
