package WorldWanderer;

//Author: Lachlan Partridge (s4103594)

public class Accomodation () {
    private String address;
    private String name;
    private int price;
    private int bedAmount;
    private int bedroomAmount;
    private int parkingAmount;
    private boolean petfriendly;
    private int kitckentype; // 0 = none, 1 = communal, 2 = private

    public Accomodation(String address, String name, int price, int bedAmount, int bedroomAmount, int parkingAmount, boolean petfriendly, int kitckentype) {
        this.address = address;
        this.name = name;
        this.price = price;
        this.bedAmount = bedAmount;
        this.bedroomAmount = bedroomAmount;
        this.parkingAmount = parkingAmount;
        this.petfriendly = petfriendly;
        this.kitckentype = kitckentype;
    }

    public String getAddress() { return address; }
    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getBedAmount() { return bedAmount; }
    public int getBedroomAmount() { return bedroomAmount; }
    public int getParkingAmount() { return parkingAmount; }
    public boolean isPetfriendly() { return petfriendly; }
    public int getKitckentype() { return kitckentype; }

    public String getDetails() {
        return "Accomodation{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bedAmount=" + bedAmount +
                ", bedroomAmount=" + bedroomAmount +
                ", parkingAmount=" + parkingAmount +
                ", petfriendly=" + petfriendly +
                ", kitckentype=" + kitckentype +
                '}';
    }

}