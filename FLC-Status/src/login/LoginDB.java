package login;

import login.Login;
import utility.DBUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDB {
    
    public static int RegisterCompany(Login login){
		Connection conn=DBUtility.getConnection();

        PreparedStatement ps = null;
        
        String query = "INSERT into login(company_name, username, password) VALUES (?, ?, ?)";
        try{
            ps = conn.prepareStatement(query);
            ps.setString(1, login.getCompany_name());
            ps.setString(2, login.getUsername());
            ps.setString(3, login.getPassword());
            return ps.executeUpdate();
        } catch (SQLException e){
            System.out.println(e);
            return 0;
        } 
    }
    
    public static String AutheticateUser(String username, String Password){
        
		Connection conn=DBUtility.getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM login WHERE username = ?";
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            String db_username = null;
            String db_password = null;
            String c_name= null;
            if (rs.next()) {
                db_username = rs.getString("username");
                db_password = rs.getString("password");
                c_name= rs.getString("company_name");
            }
            if (username.equalsIgnoreCase(db_username) && Password.equalsIgnoreCase(db_password)){
                return c_name;
            }else {return "failed";}
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } 
 
    }
}
