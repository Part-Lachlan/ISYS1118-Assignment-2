package WorldWanderer;

//Author: Lachlan Partridge (s4103594)

public class Support() {
    private int supportID;
    private String name;
    private String phone;
    private String email;

    private Support(supportID, name, phone, email) {
        this.supportID = supportID;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getSupportID() { return supportID; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
}
