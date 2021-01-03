package net.studentmanagementsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import net.javaguides.usermanagement.model.User;
import net.studentmanagementsystem.model.AddMarksheet_UserPage; 		//calling SMS-Model file

/**
 * AbstractDAO.java This DAO class provides CRUD database operations for the
 * table users in the database.
 */
public class AddMarksheet_UserPageDAO {
	//localhost:port_number/database_name
	
	private String jdbcURL = "jdbc:mysql://localhost/test1";
	private String jdbcUsername = "root";
	private String jdbcPassword = "";

	private static final String INSERT_USERS_SQL = "INSERT INTO  stud_addmarksheet" + "  (\n" + 
			"index_no ,dept_name ,division ,rollno ,year ,stud_name, sub1_code ,sub1_name ,sub1_max_marks ,sub1_min_marks ,sub1_marks_obtained ,sub1_marks_in_words ,sub2_code,sub2_name ,sub2_max_marks ,sub2_min_marks ,sub2_marks_obtained ,sub2_marks_in_words ,sub3_code ,sub3_name ,sub3_max_marks ,sub3_min_marks ,sub3_marks_obtained,sub3_marks_in_words ,sub4_code ,sub4_name ,sub4_max_marks ,sub4_min_marks ,sub4_marks_obtained ,sub4_marks_in_words ,sub5_code ,sub5_name ,sub5_max_marks,sub5_min_marks ,sub5_marks_obtained ,sub5_marks_in_words ,other_sub1_code ,other_sub1_name ,other_sub1_grades ,other_sub2_code ,other_sub2_name ,other_sub2_grades,total_marks ,total_min_marks ,total_marks_obtained ,total_marks_obtained_in_words ,final_result ,percentage) VALUES "
			+ " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			

	public AddMarksheet_UserPageDAO() {
	}

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public void insertUser(AddMarksheet_UserPage user) throws SQLException {
		System.out.println(INSERT_USERS_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
					
					preparedStatement.setString(1, user.getIndex_no());
					preparedStatement.setString(2, user.getDept_name());
					preparedStatement.setString(3, user.getDivision());
					preparedStatement.setInt(4, user.getRollno());
					preparedStatement.setString(5, user.getYear());
					preparedStatement.setString(6, user.getStud_name());
					preparedStatement.setString(7, user.getSub1_code());
					preparedStatement.setString(8, user.getSub1_name());
					preparedStatement.setInt(9, user.getSub1_max_marks());
					preparedStatement.setInt(10, user.getSub1_min_marks());
					preparedStatement.setInt(11, user.getSub1_marks_obtained());
					preparedStatement.setString(12, user.getSub1_marks_in_words());
					preparedStatement.setString(13, user.getSub2_code());
					preparedStatement.setString(14, user.getSub2_name());
					preparedStatement.setInt(15, user.getSub2_max_marks());
					preparedStatement.setInt(16, user.getSub2_min_marks());
					preparedStatement.setInt(17, user.getSub2_marks_obtained());
					preparedStatement.setString(18, user.getSub2_marks_in_words());
					preparedStatement.setString(19, user.getSub3_code());
					preparedStatement.setString(20, user.getSub3_name());
					preparedStatement.setInt(21, user.getSub3_max_marks());
					preparedStatement.setInt(22, user.getSub3_min_marks());
					preparedStatement.setInt(23, user.getSub3_marks_obtained());
					preparedStatement.setString(24, user.getSub3_marks_in_words());
					preparedStatement.setString(25, user.getSub4_code());
					preparedStatement.setString(26, user.getSub4_name());
					preparedStatement.setInt(27, user.getSub4_max_marks());
					preparedStatement.setInt(28, user.getSub4_min_marks());
					preparedStatement.setInt(29, user.getSub4_marks_obtained());
					preparedStatement.setString(30, user.getSub4_marks_in_words());
					preparedStatement.setString(31, user.getSub5_code());
					preparedStatement.setString(32, user.getSub5_name());
					preparedStatement.setInt(33, user.getSub5_max_marks());
					preparedStatement.setInt(34, user.getSub5_min_marks());
					preparedStatement.setInt(35, user.getSub5_marks_obtained());
					preparedStatement.setString(36, user.getSub5_marks_in_words());
					preparedStatement.setString(37, user.getOther_sub1_code());
					preparedStatement.setString(38, user.getOther_sub1_name());
					preparedStatement.setString(39, user.getOther_sub1_grades());
					preparedStatement.setString(40, user.getOther_sub2_code());
					preparedStatement.setString(41, user.getOther_sub2_name());
					preparedStatement.setString(42, user.getOther_sub2_grades());
					preparedStatement.setInt(43, user.getTotal_marks());
					preparedStatement.setInt(44, user.getTotal_min_marks());
					preparedStatement.setInt(45, user.getTotal_marks_obtained());
					preparedStatement.setString(46, user.getTotal_marks_obtained_in_words());
					preparedStatement.setString(47, user.getFinal_result());
					preparedStatement.setString(48, user.getPercentage());
					
					System.out.println(preparedStatement);
					preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}

}
