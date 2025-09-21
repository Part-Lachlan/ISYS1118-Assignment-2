package WorldWanderer;

//Author: Lachlan Partridge (s4103594)

public class Appartment extends Accomodation {
    private int floorNumber;
    private int roomNumber;

    public Cabin(String address, String name, int price, int bedAmount, int bedroomAmount, int parkingAmount, boolean petfriendly, int kitckentype, int floorNumber, int roomNumber) {
        super(address, name, price, bedAmount, bedroomAmount, parkingAmount, petfriendly, kitckentype);
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
    }
    public int getFloorNumber() { return floorNumber; }
    public int getRoomNumber() { return roomNumber; }

    @Override
    public String getDetails() {
        return super.getDetails() +
                "\nFloor Number: " + floorNumber +
                "\nRoom Number: " + roomNumber;
    }
}