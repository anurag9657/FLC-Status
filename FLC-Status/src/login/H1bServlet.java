package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class H1bServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String message = null;
        HttpSession session =  request.getSession();
        String action = request.getParameter("action");
        String url = "/index.jsp";
        if (action == null) {
            action = "index";  // default action
        }
        if (action.equals("index")) {
            url = "/index.jsp";    // the "index" page
        }
        else if(action.equals("login")){
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String c_name = LoginDB.AutheticateUser(username, password);
            if(c_name.equals("failed")){
            	message = "Login Failed! Kindly enter correct credentials";
                System.out.println(message);
                url = "/userLogin.jsp";
            	
            }
            else {
            	//company_name = session.getAttribute("company_name").toString();
                message = "Hello "+c_name;
                System.out.println(message);
                
                url = "/companyDetails.jsp";
            }
        }
        else if (action.equals("signup")){
            String c_name = request.getParameter("company_name");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String cnf_password = request.getParameter("cnfpassword");
            Login login = null;
            
            if(password.equals(cnf_password)){
                System.out.println("passwords matched!");
                login = new Login();
                login.setCompany_name(c_name);
                login.setUsername(username);
                login.setPassword(password);
                LoginDB.RegisterCompany(login);
                message = "Successfully registered!";
                session.setAttribute("company_name", c_name);
                url="/userLogin.jsp";
            } else {
                message = "Passwords do not match! Kindly enter the details again.";
                System.out.println(message);
                url = "/signup.jsp";
            }
        }
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

}
