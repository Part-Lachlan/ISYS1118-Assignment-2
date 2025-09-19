package WorldWanderer;

public class User {
    private String username;
    private String name;
    private String surname;
    private String password;
    private String email;
    private int userID;

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

    @Override
    public String toString() {
        System.out.println(username + " " + name + " " + surname + " " + password);
        return null;
    }

}
