package WorldWanderer;

//Author: Lachlan Partridge (s4103594)

public class Cabin extends Accomodation {
    private int unitNumber;
    private boolean hasBackyard;

    public Cabin(String address, String name, int price, int bedAmount, int bedroomAmount, int parkingAmount, boolean petfriendly, int kitckentype, int unitNumber, boolean hasBackyard) {
        super(address, name, price, bedAmount, bedroomAmount, parkingAmount, petfriendly, kitckentype);
        this.unitNumber = unitNumber;
        this.hasBackyard = hasBackyard;
    }
    public int getUnitNumber() { return unitNumber; }
    public boolean isHasBackyard() { return hasBackyard; }

    @Override
    public String getDetails() {
        return super.getDetails() +
                "\nUnit Number: " + unitNumber +
                "\nHas Backyard: " + (hasBackyard ? "Yes" : "No");
    }
}