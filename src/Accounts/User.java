package Accounts;

public abstract class User {
    private String username;
    private String password;
    private String email;
    int type;
    public User(String username, String password, String email){
        this.username=username;
        this.password=password;

        this.email=email;
    }

    // -------------Getters----------------------


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
    // -------------Getters----------------------

// -------------Setters----------------------
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

// -------------Setters----------------------
}
