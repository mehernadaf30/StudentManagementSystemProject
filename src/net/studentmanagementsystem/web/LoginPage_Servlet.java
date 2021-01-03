package net.studentmanagementsystem.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.studentmanagementsystem.dao.LoginPage_DAO;
import net.studentmanagementsystem.model.LoginPage_User;

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * 
 */

/*UNCOMMENT BELOW LINE AFTER FINAL CODE IS READY*/


@WebServlet("/LoginServlet")
public class LoginPage_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginPage_DAO userDAO;
	
	public LoginPage_Servlet() {
	}
	
	public void init() {
		userDAO = new LoginPage_DAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//doGet(request, response);
		
		String userName = request.getParameter("uname");
	    String password = request.getParameter("psw");
	    
	    //LoginBean loginBean = new LoginBean();
	    LoginPage_User loginUser = new LoginPage_User();
	    
	    
	    //Get email id
	    String str = userName; 
	    
	    String fullname = capitalize(str.substring(0, str.indexOf("@")));
	    
	    loginUser.setLoginid(userName);
	    loginUser.setPassword(password);
	    
	    //LoginDao loginDao = new LoginDao();
	    LoginPage_DAO loginDao = new LoginPage_DAO();
	        
	    try
	    {
	        String userValidate = loginDao.authenticateUser(loginUser);
	 
	        if(userValidate.equals("Admin_Role"))
	        {
	            System.out.println("Admin's Home");
	 
	            HttpSession session = request.getSession(); //Creating a session
	                
	            session.setAttribute("Admin", userName); //setting session attribute
	            request.setAttribute("userName", userName);
	            
	            //Added here:
	            session.setAttribute("Admin", fullname); //setting session attribute
	            request.setAttribute("fullname", fullname);
	            
	 
	            request.getRequestDispatcher("Admin.jsp").forward(request, response);
	        }
	        else if(userValidate.equals("Faculty_Role"))
	        {
	            System.out.println("Faculty's Home");
	 
	            HttpSession session = request.getSession();
	            session.setAttribute("Faculty", userName);
	            request.setAttribute("userName", userName);
	            
	            //Added here:
	            session.setAttribute("Faculty", fullname); //setting session attribute
	            request.setAttribute("fullname", fullname);
	 
	            request.getRequestDispatcher("Faculty.jsp").forward(request, response);
	        }
	        else if(userValidate.equals("Student_Role"))
	        {
	            System.out.println("Student's Home");
	 
	            HttpSession session = request.getSession();
	            session.setMaxInactiveInterval(10*60);
	            session.setAttribute("Student", userName);
	            request.setAttribute("userName", userName);
	            
	            //Added here:
	            session.setAttribute("Student", fullname); //setting session attribute
	            request.setAttribute("fullname", fullname);
	 
	            request.getRequestDispatcher("Student.jsp").forward(request, response);
	        }
	        else
	        {
	            System.out.println("Error message = "+userValidate);
	            request.setAttribute("errMessage", userValidate);
	 
	            request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
	        }
	    }
	    catch (IOException e1)
	    {
	        e1.printStackTrace();
	    }
	    catch (Exception e2)
	    {
	        e2.printStackTrace();
	    }
	} //End of doPost()

	//Capitaliza first alpha of word
	public static String capitalize(String str) {
	    if(str == null || str.isEmpty()) {
	        return str;
	    }

	    return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

}
