package WorldWanderer;

//Author: Lachlan Partridge (s4103594)

public class HolidayHome extends Accomodation {
    privated String ownerName;
    private String ownerPhone;
    privaet int keysafeCode;

    public Cabin(String address, String name, int price, int bedAmount, int bedroomAmount, int parkingAmount, boolean petfriendly, int kitckentype, String ownerName, String ownerPhone, int keysafeCode) {
        super(address, name, price, bedAmount, bedroomAmount, parkingAmount, petfriendly, kitckentype);
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
        this.keysafeCode = keysafeCode;
    }
    public String getOwnerName() { return ownerName; }
    public String getOwnerPhone() { return ownerPhone; }
    public int getKeysafeCode() { return keysafeCode; }

    @Override
    public String getDetails() {
        return super.getDetails() +
                "\nOwner Name: " + ownerName +
                "\nOwner Phone: " + ownerPhone +
                "\nKeysafe Code: " + keysafeCode;
    }
}