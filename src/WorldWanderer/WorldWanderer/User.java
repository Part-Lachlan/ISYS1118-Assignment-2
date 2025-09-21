package WorldWanderer;

// Author: Jose Ortega (s3779997) / 100%

public class User {
    private String username;
    private String name;
    private String surname;
    private String password;
    private String email;
    private int userID;
    private Itinerary itinerary;
    private int totalCost;

    public User() {}

    public User(String username, String name, String surname, String password, String email, int userID) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.userID = userID;
    }

    public String getUsername() { return username; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
    public int getUserID() { return userID; }
    public Itinerary getItinerary() { return itinerary; }

    public int getTotalCost(Itinerary itinerary) {
        return totalCost; 
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + password + " " + email + " " + userID;
    }

}
