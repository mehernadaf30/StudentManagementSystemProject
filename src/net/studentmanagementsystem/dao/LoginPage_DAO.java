package net.studentmanagementsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.studentmanagementsystem.model.LoginPage_User;
import net.studentmanagementsystem.model.SubjectDetailPage_User;

/**
 * AbstractDAO.java This DAO class provides CRUD database operations for the
 * table users in the database.
 */
public class LoginPage_DAO {
	//localhost:port_number/database_name
	
	private String jdbcURL = "jdbc:mysql://localhost/test1";
	private String jdbcUsername = "root";
	private String jdbcPassword = "";

	/*private static final String INSERT_USERS_SQL = "INSERT INTO stud_registration" + "  (sub_name, sub_code, lecturer_name, lec_time, department) VALUES "
			+ " (?, ?, ?, ?, ?);";*/

	private static final String SELECT_ALL_USERS = "select id, loginid, password, roleid, firstname, lastname from stud_registration;";
	

	public LoginPage_DAO() {
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

	
	public String authenticateUser(LoginPage_User loginBean)
	{
	    String userName = loginBean.getLoginid();
	    String password = loginBean.getPassword();
	    int roleId = loginBean.getRoleid();
	    String firstname = loginBean.getFirstname();
	    String lastname = loginBean.getLastname();
	 
	    String userNameDB = "";
	    String passwordDB = "";
	    int roleDB;
	    String firstnameDB = "";
	    String lastnameDB = "";
	 
	    try (Connection connection = getConnection();

			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
	    	
	    	System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				userNameDB = resultSet.getString("loginid");
	            passwordDB = resultSet.getString("password");
	            roleDB = resultSet.getInt("roleid");
	            firstnameDB = resultSet.getString("firstname");
	            lastnameDB = resultSet.getString("lastname");
	    
	            if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB == 1)
		            return "Admin_Role";
		        else if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB == 2)
		            return "Faculty_Role";
		        else if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB == 3)
		            return "Student_Role";
			} 	
	    	
	    } catch(SQLException e)
	    {
	        e.printStackTrace();
	    }
	    return "Invalid user credentials";
	  
}
}
