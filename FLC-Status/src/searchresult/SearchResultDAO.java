package searchresult;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import searchresult.Company;

import utility.DBUtility;

public class SearchResultDAO {

	    public static ArrayList<Company> list() throws SQLException {
	    	ArrayList<Company> products = new ArrayList<Company>();
            Connection conn = DBUtility.getConnection();

	        try (
	        		
	            PreparedStatement pst = conn.prepareStatement("select a.employer_name, b.job_title,concat(a.city,a.state),b.prevailing_wage,a.case_status "
	            		+ "from employer1 a inner join case_details b on a.case_no=b.case_no");
	        	
	            ResultSet resultSet = pst.executeQuery();
	        ) 
	        {
	            while (resultSet.next()) 
	            {
	                Company product = new Company();
	                product.setemployerName(resultSet.getString("employer_name"));
	                product.setjobTitle(resultSet.getString("job_title"));
	                product.setLocation(resultSet.getString("concat(a.city,a.state)"));
	                product.setbaseSal(resultSet.getString("prevailing_wage"));
	                product.setStatus(resultSet.getString("case_status"));
	                products.add(product);
	            }
	        }
	        catch(Exception e){
	    		e.printStackTrace();
			}
	        return products;
	    }
}
