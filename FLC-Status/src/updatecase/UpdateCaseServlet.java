package updatecase;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import updatecase.UpdateCaseBiz;
/**
 * Servlet implementation class AddCaseServlet
 */
public class UpdateCaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UpdateCaseBiz obj=new UpdateCaseBiz();
	    RequestDispatcher rd = null;
		int flag=obj.addCase(request);
		rd = request.getRequestDispatcher("updatedCase.jsp");

		if(flag==1){
			request.setAttribute("message", "New defect created.");

		}
		else{
			request.setAttribute("message", "Some error occurred. Please try again.");
		}
		rd.forward(request, response);
	}
}
