package DataBase;

import Accounts.Buyer;
import Accounts.Seller;
import Accounts.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AccountDB implements DBQueries {
    private Connection con;

    public AccountDB(Connection con) {
        this.con = con;
    }

    @Override
    public Seller getSellerByUsername(String companyName) {
        return null;
    }

    @Override
    public Seller getSellerByEmail(String email) {
        return null;
    }

    @Override
    public Seller getSellerByName(String name) {
        return null;
    }

    @Override
    public boolean addNewSeller(Seller seller) {
    return false;
    }

    @Override
    public List getAllSeller() {
        return null;
    }

    @Override
    public User getBuyerByUsername(String userName) {
        return null;
    }

    @Override
    public User getBuyerByEmail(String email) {
        return null;
    }

    @Override
    public User getBuyerByName(String name) {
        return null;
    }

    @Override
    public boolean addNewBuyer(Buyer buyer) {
        return false;
    }

    @Override
    public List getAllBuyer() {
        return null;
    }
}
