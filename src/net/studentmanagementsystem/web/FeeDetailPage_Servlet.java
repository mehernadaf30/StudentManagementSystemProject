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

import net.studentmanagementsystem.dao.FeeDetailPage_DAO;
import net.studentmanagementsystem.model.FeeDetailPage_User;

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * 
 */

/*UNCOMMENT BELOW LINE AFTER FINAL CODE IS READY*/

/*@WebServlet("/")*/
public class FeeDetailPage_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FeeDetailPage_DAO userDAO;
	
	public void init() {
		userDAO = new FeeDetailPage_DAO();
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
			default:
				RequestDispatcher dispatcher = request.getRequestDispatcher("FeeDetail_List.jsp");
				dispatcher.forward(request, response);
				break;	
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<FeeDetailPage_User> listUser = userDAO.selectAllUsers();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("FeeDetail_List.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("FeeDetail_Form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		FeeDetailPage_User existingUser = userDAO.selectUser(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("FeeDetail_Form.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		
		String stud_name = request.getParameter("stud_name");
		String emailid = request.getParameter("emailid");
		String school_name = request.getParameter("school_name");
		String course = request.getParameter("course");
		String month = request.getParameter("month");
		int totalfee = Integer.valueOf(request.getParameter("totalfee"));
		int paidfee = Integer.valueOf(request.getParameter("paidfee"));
		int remfee = Integer.valueOf(request.getParameter("remfee"));
		String date = request.getParameter("date");
		
		FeeDetailPage_User newUser = new FeeDetailPage_User(stud_name, emailid, school_name ,course ,month, totalfee ,paidfee ,remfee ,date);
		userDAO.insertUser(newUser);
		response.sendRedirect("list");		
	}
	
	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String stud_name = request.getParameter("stud_name");
		String emailid = request.getParameter("emailid");
		String school_name = request.getParameter("school_name");
		String course = request.getParameter("course");
		String month = request.getParameter("month");
		int totalfee = Integer.valueOf(request.getParameter("totalfee"));
		int paidfee = Integer.valueOf(request.getParameter("paidfee"));
		int remfee = Integer.valueOf(request.getParameter("remfee"));
		String date = request.getParameter("date");
		
		FeeDetailPage_User book = new FeeDetailPage_User(id, stud_name, emailid, school_name ,course ,month, totalfee ,paidfee ,remfee ,date);
		userDAO.updateUser(book);
		response.sendRedirect("list");
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		userDAO.deleteUser(id);
		response.sendRedirect("list");

	}

}
