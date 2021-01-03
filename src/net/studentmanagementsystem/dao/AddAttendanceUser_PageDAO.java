package net.studentmanagementsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import net.javaguides.usermanagement.model.User;
import net.studentmanagementsystem.model.AddAttendance_UserPage; 		//calling SMS-Model file

/**
 * AbstractDAO.java This DAO class provides CRUD database operations for the
 * table users in the database.
 */
public class AddAttendanceUser_PageDAO {
	//localhost:port_number/database_name
	
	private String jdbcURL = "jdbc:mysql://localhost/test1";
	private String jdbcUsername = "root";
	private String jdbcPassword = "";

	private static final String INSERT_USERS_SQL = "INSERT INTO stud_addattendance" + "  (\n" + 
			"stud_name, subject_name, status, lecture_title, date) VALUES "
			+ " (?, ?, ?, ?, ?);";

	public AddAttendanceUser_PageDAO() {
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

	public void insertUser(AddAttendance_UserPage user) throws SQLException {
		System.out.println(INSERT_USERS_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
					preparedStatement.setString(1, user.getStud_name());
					preparedStatement.setString(2, user.getSubject_name());
					preparedStatement.setString(3, user.getStatus());
					preparedStatement.setString(4, user.getLecture_title());
					preparedStatement.setString(5, user.getDate());
					
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
