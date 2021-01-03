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
import net.studentmanagementsystem.dao.AddMarksheet_UserPageDAO;
import net.studentmanagementsystem.model.AddMarksheet_UserPage;

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * 
 */

/*@WebServlet(value = "/RegistrationForm_AddUserPage")*/
/*@WebServlet("/")*/
@WebServlet("/addMarksheet")
public class AddMarksheet_UserPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AddMarksheet_UserPageDAO userDAO;
	
	public void init() {
		userDAO = new AddMarksheet_UserPageDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NumberFormatException {
		//doGet(request, response);
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
		
		
		//Model Page object- which holds all getters and setters
		AddMarksheet_UserPage newUser = new AddMarksheet_UserPage();
		newUser.setIndex_no(index_no);
		newUser.setDept_name(dept_name);
		newUser.setDivision(division);
		newUser.setRollno(rollno);
		newUser.setYear(year);
		newUser.setStud_name(stud_name);
		
		newUser.setSub1_code(sub1_code);
		newUser.setSub1_name(sub1_name);
		newUser.setSub1_max_marks(sub1_max_marks);
		newUser.setSub1_min_marks(sub1_min_marks);
		newUser.setSub1_marks_obtained(sub1_marks_obtained);
		newUser.setSub1_marks_in_words(sub1_marks_in_words);
		
		newUser.setSub2_code(sub2_code);
		newUser.setSub2_name(sub2_name);
		newUser.setSub2_max_marks(sub2_max_marks);
		newUser.setSub2_min_marks(sub2_min_marks);
		newUser.setSub2_marks_obtained(sub2_marks_obtained);
		newUser.setSub2_marks_in_words(sub2_marks_in_words);
		
		newUser.setSub3_code(sub3_code);
		newUser.setSub3_name(sub3_name);
		newUser.setSub3_code(sub3_code);
		newUser.setSub3_max_marks(sub3_max_marks);
		newUser.setSub3_min_marks(sub3_min_marks);
		newUser.setSub3_marks_obtained(sub3_marks_obtained);
		newUser.setSub3_marks_in_words(sub3_marks_in_words);
		
		newUser.setSub4_code(sub4_code);
		newUser.setSub4_name(sub4_name);
		newUser.setSub4_max_marks(sub4_max_marks);
		newUser.setSub4_min_marks(sub4_min_marks);
		newUser.setSub4_marks_obtained(sub4_marks_obtained);
		newUser.setSub4_marks_in_words(sub4_marks_in_words);
		
		newUser.setSub5_code(sub5_code);
		newUser.setSub5_name(sub5_name);
		newUser.setSub5_max_marks(sub5_max_marks);
		newUser.setSub5_min_marks(sub5_min_marks);
		newUser.setSub5_marks_obtained(sub5_marks_obtained);
		newUser.setSub5_marks_in_words(sub5_marks_in_words);
		
		newUser.setOther_sub1_code(other_sub1_code);
		newUser.setOther_sub1_name(other_sub1_name);
		newUser.setOther_sub1_grades(other_sub1_grades);
		
		newUser.setOther_sub2_code(other_sub2_code);
		newUser.setOther_sub2_name(other_sub2_name);
		newUser.setOther_sub2_grades(other_sub2_grades);
		
		newUser.setTotal_marks(total_marks);
		newUser.setTotal_min_marks(total_min_marks);
		newUser.setTotal_marks_obtained(total_marks_obtained);
		newUser.setTotal_marks_obtained_in_words(total_marks_obtained_in_words);
		newUser.setFinal_result(final_result);
		newUser.setPercentage(percentage);
		
		try {
			userDAO.insertUser(newUser);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("AddMarksheetSuccessPage.jsp");
		
	}

}
