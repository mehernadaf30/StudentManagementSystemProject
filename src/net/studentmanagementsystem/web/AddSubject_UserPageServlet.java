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

/*import net.javaguides.usermanagement.dao.UserDAO;
import net.javaguides.usermanagement.model.User;*/

//import DAO and Model class files
import net.studentmanagementsystem.dao.AddSubject_PageDAO;
import net.studentmanagementsystem.model.AddSubject_UserPage;

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * 
 */

/*@WebServlet(value = "/RegistrationForm_AddUserPage")*/
/*@WebServlet("/")*/
@WebServlet("/addSubject")
public class AddSubject_UserPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AddSubject_PageDAO userDAO;
	
	public void init() {
		userDAO = new AddSubject_PageDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NumberFormatException {
		//doGet(request, response);
		String subject_name = request.getParameter("subject_name");
		String subject_desc = request.getParameter("subject_desc");
		
		//Model Page object- which holds all getters and setters
		AddSubject_UserPage newUser = new AddSubject_UserPage();
		newUser.setSubject_name(subject_name);
		newUser.setSubject_desc(subject_desc);
		
		try {
			userDAO.insertUser(newUser);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("AddSubjectSuccessPage.jsp");
		
	}
}
