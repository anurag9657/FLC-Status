package addcase;

import java.sql.Connection;
import java.sql.PreparedStatement;


import javax.servlet.http.HttpServletRequest;
import utility.DBUtility;

public class AddCaseBiz {
	public int addCase(HttpServletRequest request){
			// TODO Auto-generated method stub
			int x=0;
			Connection conn=DBUtility.getConnection();
			try{
				
			PreparedStatement pst = conn.prepareStatement("insert into case_details(job_title,work_city,work_state,prevailing_wage,wage_source,program,withdrawn) values (?,?,?,?,?,?,?)");
		
			pst.setString(1,request.getParameter("jobTitle"));
			pst.setString(2,request.getParameter("workCity"));
			pst.setString(3, request.getParameter("workState"));
			pst.setString(4, request.getParameter("baseSalary"));
			pst.setString(5,request.getParameter("wageSource"));
			pst.setString(6, request.getParameter("program"));
			pst.setString(7,request.getParameter("withdrawn"));
			
			x = pst.executeUpdate();
			DBUtility.closeConnection(conn);

			}
			catch(Exception e){
			e.printStackTrace();
			}
			return x;
		}
}
