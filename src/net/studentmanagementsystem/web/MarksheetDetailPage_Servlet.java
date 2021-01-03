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

import net.studentmanagementsystem.dao.MarksheetDetailPage_DAO;
import net.studentmanagementsystem.model.MarksheetDetailPage_User;

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * 
 */

/*@WebServlet("/")*/
public class MarksheetDetailPage_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MarksheetDetailPage_DAO userDAO;
	
	public void init() {
		userDAO = new MarksheetDetailPage_DAO();
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
				RequestDispatcher dispatcher = request.getRequestDispatcher("MarksheetDetail_List.jsp");
				dispatcher.forward(request, response);
				break;	
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<MarksheetDetailPage_User> listUser = userDAO.selectAllUsers();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("MarksheetDetail_List.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("MarksheetDetail_Form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		MarksheetDetailPage_User existingUser = userDAO.selectUser(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("MarksheetDetail_Form.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		
		String index_no = request.getParameter("index_no");
		String dept_name = request.getParameter("dept_name");
		String division = request.getParameter("division");
		int rollno = Integer.valueOf(request.getParameter("rollno"));
		String year = request.getParameter("year");
		String stud_name = request.getParameter("stud_name");
		
		String sub1_code = request.getParameter("sub1_code");
		String sub1_name = request.getParameter("sub1_name");
		int sub1_max_marks = Integer.valueOf(request.getParameter("sub1_max_marks"));
		int sub1_min_marks = Integer.valueOf(request.getParameter("sub1_min_marks"));
		int sub1_marks_obtained = Integer.valueOf(request.getParameter("sub1_marks_obtained"));
		String sub1_marks_in_words = request.getParameter("sub1_marks_in_words");
		
		String sub2_code = request.getParameter("sub2_code");
		String sub2_name = request.getParameter("sub2_name");
		int sub2_max_marks = Integer.valueOf(request.getParameter("sub2_max_marks"));
		int sub2_min_marks = Integer.valueOf(request.getParameter("sub2_min_marks"));
		int sub2_marks_obtained = Integer.valueOf(request.getParameter("sub2_marks_obtained"));
		String sub2_marks_in_words = request.getParameter("sub2_marks_in_words");
		
		String sub3_code = request.getParameter("sub3_code");
		String sub3_name = request.getParameter("sub3_name");
		int sub3_max_marks = Integer.valueOf(request.getParameter("sub3_max_marks"));
		int sub3_min_marks = Integer.valueOf(request.getParameter("sub3_min_marks"));
		int sub3_marks_obtained = Integer.valueOf(request.getParameter("sub3_marks_obtained"));
		String sub3_marks_in_words = request.getParameter("sub3_marks_in_words");
		
		String sub4_code = request.getParameter("sub4_code");
		String sub4_name = request.getParameter("sub4_name");
		int sub4_max_marks = Integer.valueOf(request.getParameter("sub4_max_marks"));
		int sub4_min_marks = Integer.valueOf(request.getParameter("sub4_min_marks"));
		int sub4_marks_obtained = Integer.valueOf(request.getParameter("sub4_marks_obtained"));
		String sub4_marks_in_words = request.getParameter("sub4_marks_in_words");
		
		String sub5_code = request.getParameter("sub5_code");
		String sub5_name = request.getParameter("sub5_name");
		int sub5_max_marks = Integer.valueOf(request.getParameter("sub5_max_marks"));
		int sub5_min_marks = Integer.valueOf(request.getParameter("sub5_min_marks"));
		int sub5_marks_obtained = Integer.valueOf(request.getParameter("sub5_marks_obtained"));
		String sub5_marks_in_words = request.getParameter("sub5_marks_in_words");
		
		String other_sub1_code = request.getParameter("other_sub1_code");	
		String other_sub1_name = request.getParameter("other_sub1_name");		
		String other_sub1_grades = request.getParameter("other_sub1_grades");	
		
		String other_sub2_code = request.getParameter("other_sub2_code");		
		String other_sub2_name = request.getParameter("other_sub2_name");		
		String other_sub2_grades = request.getParameter("other_sub2_grades");
		
		int total_marks = Integer.valueOf(request.getParameter("total_marks"));
		int total_min_marks = Integer.valueOf(request.getParameter("total_min_marks"));
		int total_marks_obtained = Integer.valueOf(request.getParameter("total_marks_obtained"));
		
		String total_marks_obtained_in_words = request.getParameter("total_marks_obtained_in_words");		
		String final_result = request.getParameter("final_result");		
		String percentage = request.getParameter("percentage");
		
		MarksheetDetailPage_User newUser = new MarksheetDetailPage_User(index_no ,dept_name ,division ,rollno ,year ,stud_name ,sub1_code ,sub1_name ,sub1_max_marks ,sub1_min_marks ,sub1_marks_obtained ,sub1_marks_in_words ,sub2_code,sub2_name ,sub2_max_marks ,sub2_min_marks ,sub2_marks_obtained ,sub2_marks_in_words ,sub3_code ,sub3_name ,sub3_max_marks ,sub3_min_marks ,sub3_marks_obtained,sub3_marks_in_words ,sub4_code ,sub4_name ,sub4_max_marks ,sub4_min_marks ,sub4_marks_obtained ,sub4_marks_in_words ,sub5_code ,sub5_name ,sub5_max_marks,sub5_min_marks ,sub5_marks_obtained ,sub5_marks_in_words ,other_sub1_code ,other_sub1_name ,other_sub1_grades ,other_sub2_code ,other_sub2_name ,other_sub2_grades,total_marks ,total_min_marks ,total_marks_obtained ,total_marks_obtained_in_words ,final_result ,percentage);
		userDAO.insertUser(newUser);
		response.sendRedirect("list");		
	}
	
	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		String index_no = request.getParameter("index_no");
		String dept_name = request.getParameter("dept_name");
		String division = request.getParameter("division");
		int rollno = Integer.valueOf(request.getParameter("rollno"));
		String year = request.getParameter("year");
		String stud_name = request.getParameter("stud_name");
		
		String sub1_code = request.getParameter("sub1_code");
		String sub1_name = request.getParameter("sub1_name");
		int sub1_max_marks = Integer.valueOf(request.getParameter("sub1_max_marks"));
		int sub1_min_marks = Integer.valueOf(request.getParameter("sub1_min_marks"));
		int sub1_marks_obtained = Integer.valueOf(request.getParameter("sub1_marks_obtained"));
		String sub1_marks_in_words = request.getParameter("sub1_marks_in_words");
		
		String sub2_code = request.getParameter("sub2_code");
		String sub2_name = request.getParameter("sub2_name");
		int sub2_max_marks = Integer.valueOf(request.getParameter("sub2_max_marks"));
		int sub2_min_marks = Integer.valueOf(request.getParameter("sub2_min_marks"));
		int sub2_marks_obtained = Integer.valueOf(request.getParameter("sub2_marks_obtained"));
		String sub2_marks_in_words = request.getParameter("sub2_marks_in_words");
		
		String sub3_code = request.getParameter("sub3_code");
		String sub3_name = request.getParameter("sub3_name");
		int sub3_max_marks = Integer.valueOf(request.getParameter("sub3_max_marks"));
		int sub3_min_marks = Integer.valueOf(request.getParameter("sub3_min_marks"));
		int sub3_marks_obtained = Integer.valueOf(request.getParameter("sub3_marks_obtained"));
		String sub3_marks_in_words = request.getParameter("sub3_marks_in_words");
		
		String sub4_code = request.getParameter("sub4_code");
		String sub4_name = request.getParameter("sub4_name");
		int sub4_max_marks = Integer.valueOf(request.getParameter("sub4_max_marks"));
		int sub4_min_marks = Integer.valueOf(request.getParameter("sub4_min_marks"));
		int sub4_marks_obtained = Integer.valueOf(request.getParameter("sub4_marks_obtained"));
		String sub4_marks_in_words = request.getParameter("sub4_marks_in_words");
		
		String sub5_code = request.getParameter("sub5_code");
		String sub5_name = request.getParameter("sub5_name");
		int sub5_max_marks = Integer.valueOf(request.getParameter("sub5_max_marks"));
		int sub5_min_marks = Integer.valueOf(request.getParameter("sub5_min_marks"));
		int sub5_marks_obtained = Integer.valueOf(request.getParameter("sub5_marks_obtained"));
		String sub5_marks_in_words = request.getParameter("sub5_marks_in_words");
		
		String other_sub1_code = request.getParameter("other_sub1_code");	
		String other_sub1_name = request.getParameter("other_sub1_name");		
		String other_sub1_grades = request.getParameter("other_sub1_grades");	
		
		String other_sub2_code = request.getParameter("other_sub2_code");		
		String other_sub2_name = request.getParameter("other_sub2_name");		
		String other_sub2_grades = request.getParameter("other_sub2_grades");
		
		int total_marks = Integer.valueOf(request.getParameter("total_marks"));
		int total_min_marks = Integer.valueOf(request.getParameter("total_min_marks"));
		int total_marks_obtained = Integer.valueOf(request.getParameter("total_marks_obtained"));
		
		String total_marks_obtained_in_words = request.getParameter("total_marks_obtained_in_words");		
		String final_result = request.getParameter("final_result");		
		String percentage = request.getParameter("percentage");
		
		MarksheetDetailPage_User book = new MarksheetDetailPage_User(id, index_no ,dept_name ,division ,rollno ,year, stud_name ,sub1_code ,sub1_name ,sub1_max_marks ,sub1_min_marks ,sub1_marks_obtained ,sub1_marks_in_words ,sub2_code,sub2_name ,sub2_max_marks ,sub2_min_marks ,sub2_marks_obtained ,sub2_marks_in_words ,sub3_code ,sub3_name ,sub3_max_marks ,sub3_min_marks ,sub3_marks_obtained,sub3_marks_in_words ,sub4_code ,sub4_name ,sub4_max_marks ,sub4_min_marks ,sub4_marks_obtained ,sub4_marks_in_words ,sub5_code ,sub5_name ,sub5_max_marks,sub5_min_marks ,sub5_marks_obtained ,sub5_marks_in_words ,other_sub1_code ,other_sub1_name ,other_sub1_grades ,other_sub2_code ,other_sub2_name ,other_sub2_grades,total_marks ,total_min_marks ,total_marks_obtained ,total_marks_obtained_in_words ,final_result ,percentage);
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
