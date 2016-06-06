package Accounts;

public class AccountFactory {
    //Returns new User
    public static Seller getNewSeller(String username, String password, String email, String companyName, int rating, String mobileNumber){
        return new Seller(username,password,email,companyName,rating,mobileNumber);
    }
    public static Buyer getNewBuyer(String username, String password, String email,String name, String surname){
        return new Buyer(username,password,email,name,surname);
    }
}
