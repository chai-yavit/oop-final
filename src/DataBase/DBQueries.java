package DataBase;

import Accounts.Buyer;
import Accounts.Seller;
import Accounts.User;

import java.util.List;

public interface DBQueries {
    public Seller getSellerByUsername(String companyName);
    public Seller getSellerByEmail(String email);
    public Seller getSellerByName(String name);
    public boolean addNewSeller(Seller seller);
    public List getAllSeller();


    public User getBuyerByUsername(String userName);
    public User getBuyerByEmail(String email);
    public User getBuyerByName(String name);
    public boolean addNewBuyer(Buyer buyer);
    public List getAllBuyer();

}
