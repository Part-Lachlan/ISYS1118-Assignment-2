package WorldWanderer;

// Author: Jose Ortega / 100%

public class VehicleRental{
    private int vehicleRentID;
    private String startDate;
    private String endDate;
    private String destination;

    public VehicleRental(int rentID, String startDate, String endDate, String destination) {
        this.vehicleRentID = rentID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.destination = destination;
    }

    public int getVehicleRentID() { return vehicleRentID; }
    public String getStartDate() { return startDate; }
    public String getEndDate() { return endDate; }
    public String getDestination() { return destination; }

    public Vehicle getVehicleData() {
        Vehicle v = new Vehicle();
        return v;
    }

    // Calculate the difference of the registered start and end date.
    public static double calcVehicleRentDuration(String startDate, String endDate) {
        return 0;
    }

    public double calcTotalCost(Vehicle vehicle, String destination) {
        double totalCost = 0;
        calcVehicleRentDuration(getStartDate(), getEndDate());
        return totalCost;
    }
}
