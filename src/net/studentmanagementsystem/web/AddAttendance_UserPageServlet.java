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
import net.studentmanagementsystem.dao.AddAttendanceUser_PageDAO;
import net.studentmanagementsystem.model.AddAttendance_UserPage;

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * 
 */

/*@WebServlet(value = "/RegistrationForm_AddUserPage")*/
/*@WebServlet("/")*/
@WebServlet("/addAttendance")
public class AddAttendance_UserPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AddAttendanceUser_PageDAO userDAO;
	
	public void init() {
		userDAO = new AddAttendanceUser_PageDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NumberFormatException {
		//doGet(request, response);
		String stud_name = request.getParameter("stud_name");
		String subject_name = request.getParameter("subject_name");
		String status = request.getParameter("status");
		String lecture_title = request.getParameter("lecture_title");
		String date = request.getParameter("date");
		
		//Model Page object- which holds all getters and setters
		AddAttendance_UserPage newUser = new AddAttendance_UserPage();
		newUser.setStud_name(stud_name);
		newUser.setSubject_name(subject_name);
		newUser.setStatus(status);
		newUser.setLecture_title(lecture_title);
		newUser.setDate(date);
		
		try {
			userDAO.insertUser(newUser);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("AddAttendanceSuccessPage.jsp");
		
	}

}
