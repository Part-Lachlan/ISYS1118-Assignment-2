package WorldWanderer;

//Author: Lachlan Partridge (s4103594)

public class AccomodationBooking {
    private int accomodationID;
    private String checkInDate;
    private String checkOutDate;
    private int adults;
    private int children;
    private String destination;
    private Accomodation accomodation;

    public AccomodationBooking(String accomodationID, String checkInDate, String checkOutDate, int numberOfGuests, int totalCost) {
        this.accomodationID = accomodation;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.adults = adults;
        this.children = children;
        this.destination = destination;
    }
    
    public void setAccomodation(Accomodation accomodation) { this.accomodation = accomodation; }

    public String getAccomodationID() { return accomodationID; }
    public String getCheckInDate() { return checkInDate; }
    public String getCheckOutDate() { return checkOutDate; }
    public int getAdults() { return adults; }
    public int getChildren() { return children; }
    public Accomodation getAccomodation() { return accomodation; }
}