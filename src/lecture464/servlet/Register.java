package lecture464.servlet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lecture464.model.Users;
import lecture464.db.*;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		/*For Assignment 2*/
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String add = request.getParameter("address");
		String ph = request.getParameter("phone");
		int phone = Integer.parseInt(ph); 
		
		/*From Assignment 1 */
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		Users aUser = new Users(userName, password,firstName,lastName,add,phone);
		
		UsersDB aUserDB = new UsersDB();
		
		boolean userExists = false;
		
		userExists = aUserDB.validateUserByUsername(userName);
		
		if(!userExists) {
			aUserDB.registerUser(aUser);
			response.sendRedirect("Login.jsp");
		} else {
			response.sendRedirect("Login.jsp");
		}
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
