package Accounts;


public class Seller extends User {

    String companyName;
    int rating;
    String mobileNumber;

    public Seller(String username, String password, String email, String companyName, int rating, String mobileNumber) {
        super(username, password, email);
        this.companyName = companyName;
        this.rating = rating;
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Seller(String username, String password, String email) {
        super(username, password, email);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
