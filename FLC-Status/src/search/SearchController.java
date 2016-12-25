package search;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import search.SearchDAO;
import com.google.gson.Gson;

public class SearchController extends HttpServlet {
        private static final long serialVersionUID = 1L;

        protected void doGet(HttpServletRequest request,
                HttpServletResponse response) throws ServletException, IOException {

                response.setContentType("application/json");
                try {
                        String term = request.getParameter("term");
                        System.out.println("Data from ajax call " + term);

                        SearchDAO dataDao = new SearchDAO();
                        ArrayList<String> list = dataDao.getEmployerName(term);

                        String searchList = new Gson().toJson(list);
                        response.getWriter().write(searchList);
                } catch (Exception e) {
                        System.err.println(e.getMessage());
                }
        }
}
