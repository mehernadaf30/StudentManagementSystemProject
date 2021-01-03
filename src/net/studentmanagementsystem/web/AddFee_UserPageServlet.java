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
import net.studentmanagementsystem.dao.AddFee_UserPageDAO;
import net.studentmanagementsystem.model.AddFee_UserPage;

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * 
 */

/*@WebServlet(value = "/RegistrationForm_AddUserPage")*/
/*@WebServlet("/")*/
@WebServlet("/addFee")
public class AddFee_UserPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AddFee_UserPageDAO userDAO;
	
	public void init() {
		userDAO = new AddFee_UserPageDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NumberFormatException {
		//doGet(request, response);
		String stud_name = request.getParameter("stud_name");
		String month = request.getParameter("month");
		int amount = Integer.valueOf(request.getParameter("amount"));
		int totalfee = Integer.valueOf(request.getParameter("totalfee"));
		int paidfee = Integer.valueOf(request.getParameter("paidfee"));
		int balancefee = Integer.valueOf(request.getParameter("balancefee"));
		String date = request.getParameter("date");
		
		//Model Page object- which holds all getters and setters
		AddFee_UserPage newUser = new AddFee_UserPage();
		newUser.setStud_name(stud_name);
		newUser.setMonth(month);
		newUser.setAmount(amount);
		newUser.setTotalfee(totalfee);
		newUser.setPaidfee(paidfee);
		newUser.setBalancefee(balancefee);
		newUser.setDate(date);
		
		try {
			userDAO.insertUser(newUser);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("AddFeeSuccessPage.jsp");
		
	}

}
