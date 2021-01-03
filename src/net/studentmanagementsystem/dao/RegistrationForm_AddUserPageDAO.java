package net.studentmanagementsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import net.javaguides.usermanagement.model.User;
import net.studentmanagementsystem.model.RegistrationForm_AddUserPage; 		//calling SMS-Model file

/**
 * AbstractDAO.java This DAO class provides CRUD database operations for the
 * table users in the database.
 */
public class RegistrationForm_AddUserPageDAO {
	//localhost:port_number/database_name
	
	private String jdbcURL = "jdbc:mysql://localhost/test1";
	private String jdbcUsername = "root";
	private String jdbcPassword = "";

	private static final String INSERT_USERS_SQL = "INSERT INTO stud_registration" + "  (\n" + 
			"firstname, lastname, loginid, password, confirmpwd, schoolname, coursename, telephone, gender, dob, emailid, address1, address2, country, state, city, roleid) VALUES "
			+ " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

	public RegistrationForm_AddUserPageDAO() {
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

	public void insertUser(RegistrationForm_AddUserPage user) throws SQLException {
		System.out.println(INSERT_USERS_SQL);
		System.out.println("Inside regis form");
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
					preparedStatement.setString(1, user.getFirstname());
					preparedStatement.setString(2, user.getLastname());
					preparedStatement.setString(3, user.getLoginid());
					preparedStatement.setString(4, user.getPassword());
					preparedStatement.setString(5, user.getConfirmpwd());
					preparedStatement.setString(6, user.getSchoolname());
					preparedStatement.setString(7, user.getCoursename());
					preparedStatement.setString(8, user.getTelephone());
					preparedStatement.setString(9, user.getGender());
					preparedStatement.setString(10, user.getDob());
					preparedStatement.setString(11, user.getEmailid());
					preparedStatement.setString(12, user.getAddress1());
					preparedStatement.setString(13, user.getAddress2());
					preparedStatement.setString(14, user.getCountry());
					preparedStatement.setString(15, user.getState());
					preparedStatement.setString(16, user.getCity());
					preparedStatement.setInt(17, user.getRoleid());
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
