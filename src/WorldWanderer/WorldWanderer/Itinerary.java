package WorldWanderer;

// Author: Jose Ortega / 100%

import java.util.*;

public class Itinerary {
    private String name;
    private String email;
    private int itineraryID;
    private String destination;
    private String startDate;
    private String endDate;

    private ArrayList<VehicleRental> vehicleRentals;
    private ArrayList<AccommodationBooking> accommodationBookings;
    private ArrayList<FlightBooking> flightBookings;

    public Itinerary() {}

    public Itinerary(String name, String email, int itineraryID, String destination,
                     String startDate, String endDate) {
        this.name = name;
        this.email = email;
        this.itineraryID = itineraryID;
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;

        this.vehicleRentals = new ArrayList<>();
        this.accommodationBookings = new ArrayList<>();
        this.flightBookings = new ArrayList<>();
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
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

    // Confirm booking (finalize payment + send invoice)
    public void confirmBooking(UserCard userCard, PaymentProvider paymentProvider) {
        if (paymentProvider.authenticate()) {
            boolean success = paymentProvider.processPayment(userCard);
            if (success) {
                paymentProvider.sendInvoice();
                System.out.println("Booking confirmed for " + name);
            } else {
                System.out.println("Payment failed. Booking not confirmed.");
            }
        } else {
            System.out.println("Payment provider authentication failed.");
        }
    }

    // Cancel booking
    public void cancelBooking() {
        System.out.println("Booking cancelled for itinerary ID: " + itineraryID);
        // Optional: add logic to release reservations
    }


}
