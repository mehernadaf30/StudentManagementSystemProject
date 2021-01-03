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

import net.studentmanagementsystem.dao.AttendanceDetailPage_DAO;
import net.studentmanagementsystem.model.AttendanceDetailPage_User;

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * 
 */


@WebServlet("/")
/*@WebServlet("/attendanceDetailPage_Servlet")*/
public class AttendanceDetailPage_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AttendanceDetailPage_DAO userDAO;
	
	public void init() {
		userDAO = new AttendanceDetailPage_DAO();
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
				RequestDispatcher dispatcher = request.getRequestDispatcher("AttendanceDetail_List.jsp");
				dispatcher.forward(request, response);
				break;	
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<AttendanceDetailPage_User> listUser = userDAO.selectAllUsers();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("AttendanceDetail_List.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("AttendanceDetail_Form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		AttendanceDetailPage_User existingUser = userDAO.selectUser(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("AttendanceDetail_Form.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String stud_name = request.getParameter("stud_name");
		String sub_name = request.getParameter("sub_name");
		String lec_name = request.getParameter("lec_name");
		String dob = request.getParameter("dob");
		String status = request.getParameter("status");
		AttendanceDetailPage_User newUser = new AttendanceDetailPage_User(stud_name, sub_name, lec_name, dob, status);
		userDAO.insertUser(newUser);
		response.sendRedirect("list");		
	}
	
	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String stud_name = request.getParameter("stud_name");
		String sub_name = request.getParameter("sub_name");
		String lec_name = request.getParameter("lec_name");
		String dob = request.getParameter("dob");
		String status = request.getParameter("status");
		
		AttendanceDetailPage_User book = new AttendanceDetailPage_User(id, stud_name, sub_name, lec_name, dob, status);
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
