	package lecture464.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lecture464.db.UsersDB;
import lecture464.model.*;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		boolean userExists = false;
		boolean userPasswordMatches = false;
		
		Users aUser = new Users();
		
		UsersDB aUserDB = new UsersDB();
		
		userExists = aUserDB.validateUserByUsername(userName);
		userPasswordMatches = aUserDB.validateUserByPassword(password);
		
		if(userExists && userPasswordMatches) {
			aUser = aUserDB.getUser(userName);
			
			HttpSession session = request.getSession();
		    session.setAttribute("userBean", aUser);
		    
		    String address = "CustomerHomepage.jsp";
		    RequestDispatcher dispatcher =
		      request.getRequestDispatcher(address);
		    dispatcher.forward(request, response);
			
		} else {
			response.sendRedirect("Register.jsp");
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
