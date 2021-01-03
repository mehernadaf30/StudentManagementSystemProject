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
import net.studentmanagementsystem.dao.RegistrationForm_AddUserPageDAO;
import net.studentmanagementsystem.model.RegistrationForm_AddUserPage;

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * 
 */

/*@WebServlet(value = "/RegistrationForm_AddUserPage")*/
/*@WebServlet("/")*/
@WebServlet("/registerUser")
public class RegistrationForm_AddUserPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RegistrationForm_AddUserPageDAO userDAO;
	
	public void init() {
		userDAO = new RegistrationForm_AddUserPageDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NumberFormatException {
		//doGet(request, response);
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String loginid = request.getParameter("loginid");
		String password = request.getParameter("password");
		String confirmpwd = request.getParameter("confirmpwd");
		String schoolname = request.getParameter("schoolname");
		String coursename = request.getParameter("coursename");
		String telephone = request.getParameter("telephone");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String emailid = request.getParameter("emailid");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String country = request.getParameter("country");
		String state = request.getParameter("state");
		String city = request.getParameter("city");
		int roleid = Integer.valueOf(request.getParameter("roleid"));
		
		//Model Page object- which holds all getters and setters
		RegistrationForm_AddUserPage newUser = new RegistrationForm_AddUserPage();
		newUser.setFirstname(firstname);
		newUser.setLastname(lastname);
		newUser.setLoginid(loginid);
		newUser.setPassword(password);
		newUser.setConfirmpwd(confirmpwd);
		newUser.setSchoolname(schoolname);
		newUser.setCoursename(coursename);
		newUser.setTelephone(telephone);
		newUser.setGender(gender);
		newUser.setDob(dob);
		newUser.setEmailid(emailid);
		newUser.setAddress1(address1);
		newUser.setAddress2(address2);
		newUser.setCountry(country);
		newUser.setState(state);
		newUser.setCity(city);
		newUser.setRoleid(roleid);
		
		try {
			userDAO.insertUser(newUser);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("RegistrationSuccessPage.jsp");
		
	}

}
