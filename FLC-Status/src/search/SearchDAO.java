package search;
import utility.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SearchDAO {
	 private Connection connection;

     public SearchDAO() throws Exception {
             connection = DBUtility.getConnection();
     }

     public ArrayList<String> getEmployerName(String frameWork) {
     ArrayList<String> list = new ArrayList<String>();
     PreparedStatement ps = null;
     String data;
     try {
     ps = connection.prepareStatement("SELECT distinct employer_name FROM EMPLOYER1 WHERE EMPLOYER_NAME LIKE ?");
             ps.setString(1, frameWork + "%");
             ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                     data = rs.getString("employer_name");
                     list.add(data);
             }
     } catch (Exception e) {
             System.out.println(e.getMessage());
     }
     return list;
}
}
