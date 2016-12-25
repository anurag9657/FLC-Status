package searchresult;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import searchresult.Company;

/**
 * Servlet implementation class SearchResultController
 */
public class SearchResultController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchResultController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		if(action.equals("search")){
			try {
	            ArrayList<Company> products = SearchResultDAO.list();
	            request.setAttribute("products", products); // Will be available as ${products} in JSP
	    		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
	    		rd.forward(request, response);
	    		System.out.println("products"+products);
	        } catch (SQLException e) {
	            throw new ServletException("Cannot obtain products from DB", e);
	        }
		}
}
	

	}

