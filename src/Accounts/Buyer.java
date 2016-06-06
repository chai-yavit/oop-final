package Accounts;

public class Buyer extends User {
    String name;
    String surname;

    public Buyer(String username, String password, String email,String name, String surname) {
        super(username, password, email);
    }
}
