package WorldWanderer;

// Author: Jose Ortega

import java.util.*;

public class Itinerary {
    private int itineraryID;
    private String destination;
    private String startDate;
    private String endDate;

    private ArrayList<VehicleRental> vehicleRentals;
    private ArrayList<AccommodationBooking> accommodationBookings;
    private ArrayList<FlightBooking> flightBookings;

    public Itinerary() {}

    public Itinerary(int itineraryID, String destination,
                     String startDate, String endDate) {
        this.itineraryID = itineraryID;
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;

        this.vehicleRentals = new ArrayList<>();
        this.accommodationBookings = new ArrayList<>();
        this.flightBookings = new ArrayList<>();
    }

    public int getItineraryID() { return itineraryID; }
    public String getDestination() { return destination; }
    public String getStartDate() { return startDate; }
    public String getEndDate() { return endDate; }

    // Methods for managing bookings
    public void addVehicleRental(VehicleRental rental) {
        vehicleRentals.add(rental);
    }

    public void addAccommodationBooking(AccommodationBooking booking) {
        accommodationBookings.add(booking);
    }

    public void addFlightBooking(FlightBooking booking) {
        flightBookings.add(booking);
    }
}
