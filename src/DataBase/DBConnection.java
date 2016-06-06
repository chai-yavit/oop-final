package DataBase;

import Accounts.User;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public boolean AddNewAccount( User account) throws SQLException, NoSuchAlgorithmException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://" + DBInfo.MYSQL_DATABASE_SERVER + "/"
                        + DBInfo.MYSQL_DATABASE_NAME +
                        "?characterEncoding=UTF8&useSSL=false", DBInfo.MYSQL_USERNAME, DBInfo.MYSQL_PASSWORD)) {
            DBQueries queries=DBFactory.getDBQueries(con);
           return queries.addNewAccount(account);
        } catch (SQLException ex) {
            throw new AssertionError(ex);
        }

    }

}
