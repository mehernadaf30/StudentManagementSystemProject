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

import net.studentmanagementsystem.dao.StudentDetailPage_DAO;
import net.studentmanagementsystem.model.StudentDetailPage_User;

//Adding here for back button to login page based on user session- 30DEC20
import net.studentmanagementsystem.dao.LoginPage_DAO;
import net.studentmanagementsystem.model.LoginPage_User;

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * 
 */


/*UNCOMMENT THIS WHILE EXECUTING MAIN PROGRAM*/


//@WebServlet("/")
/*@WebServlet("/studentDetailPage_Servlet")*/
/*@WebServlet("/StudentDetailPage_Servlet")*/

public class StudentDetailPage_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDetailPage_DAO userDAO;
	
	//Added for back button - 30DEC20
	//private LoginPage_DAO userDAO;
	
	public void init() {
		userDAO = new StudentDetailPage_DAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		try {	
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertUser(request, response);
				break;
			case "/delete":
				deleteUser(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateUser(request, response);
				break;
			/*default:
				listUser(request, response);
				break;*/	
			case "/list":
				listUser(request, response);
				break;
			
			case "/back":
				backToLoginPage(request, response);
				break;
				
			default:
				RequestDispatcher dispatcher = request.getRequestDispatcher("StudentDetail_List.jsp");
				dispatcher.forward(request, response);
				break;	
			}
			
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<StudentDetailPage_User> listUser = userDAO.selectAllUsers();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StudentDetail_List.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("StudentDetail_Form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		StudentDetailPage_User existingUser = userDAO.selectUser(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StudentDetail_Form.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {System.out.print(request.getRequestURL().toString());
		String stud_name = request.getParameter("stud_name");
		String emailid = request.getParameter("emailid");
		String dob = request.getParameter("dob");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		StudentDetailPage_User newUser = new StudentDetailPage_User(stud_name, emailid, dob, contact, address);
		userDAO.insertUser(newUser);
		response.sendRedirect("list");
	}
	
	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String stud_name = request.getParameter("stud_name");
		String emailid = request.getParameter("emailid");
		String dob = request.getParameter("dob");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		
		StudentDetailPage_User book = new StudentDetailPage_User(id, stud_name, emailid, dob, contact, address);
		userDAO.updateUser(book);
		response.sendRedirect("list");
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		userDAO.deleteUser(id);
		response.sendRedirect("list");

	}
	
	//For back button - 30DEC20
	private void backToLoginPage(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		
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
	}
	
	//Capitaliza first alpha of word
		public static String capitalize(String str) {
		    if(str == null || str.isEmpty()) {
		        return str;
		    }

		    return str.substring(0, 1).toUpperCase() + str.substring(1);
		}
	

}
