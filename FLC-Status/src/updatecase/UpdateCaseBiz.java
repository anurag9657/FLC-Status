package updatecase;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

import utility.DBUtility;

public class UpdateCaseBiz {
	public int addCase(HttpServletRequest request){
		// TODO Auto-generated method stub
		int x=0;
		Connection conn=DBUtility.getConnection();
		try{
			
		PreparedStatement pst = conn.prepareStatement("update case_details set job_title=?,work_city=?,work_state=?,prevailing_wage=?,wage_source=?,program=?,withdrawn=? where case_id=?");
	
		pst.setString(1,request.getParameter("jobTitle"));
		pst.setString(2,request.getParameter("workCity"));
		pst.setString(3, request.getParameter("workState"));
		pst.setString(4, request.getParameter("baseSalary"));
		pst.setString(5,request.getParameter("wageSource"));
		pst.setString(6, request.getParameter("program"));
		pst.setString(7,request.getParameter("withdrawn"));
		pst.setString(7,request.getParameter("case_id"));
		
		x = pst.executeUpdate();
		DBUtility.closeConnection(conn);

		}
		catch(Exception e){
		e.printStackTrace();
		}
		return x;
	}
}
