package addcase;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import addcase.AddCaseBiz;

/**
 * Servlet implementation class AddCaseServlet
 */
public class AddCaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		AddCaseBiz obj=new AddCaseBiz();
	    RequestDispatcher rd = null;
		int flag=obj.addCase(request);
		rd = request.getRequestDispatcher("caseAdded.jsp");

		if(flag==1){
			request.setAttribute("message", "New defect created.");

		}
		else{
			request.setAttribute("message", "Some error occurred. Please try again.");
		}
		rd.forward(request, response);
	}
}
