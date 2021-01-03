package net.studentmanagementsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.studentmanagementsystem.model.AttendanceDetailPage_User;

/**
 * AbstractDAO.java This DAO class provides CRUD database operations for the
 * table users in the database.
 */
public class AttendanceDetailPage_DAO {
	//localhost:port_number/database_name
	
	private String jdbcURL = "jdbc:mysql://localhost/test1";
	private String jdbcUsername = "root";
	private String jdbcPassword = "";

	private static final String INSERT_USERS_SQL = "INSERT INTO stud_attdetails" + "  (stud_name, sub_name, lec_name, dob, status) VALUES "
			+ " (?, ?, ?, ?, ?);";

	private static final String SELECT_USER_BY_ID = "select id, stud_name, sub_name, lec_name, dob, status from stud_attdetails where id =?";
	private static final String SELECT_ALL_USERS = "select * from stud_attdetails";
	private static final String DELETE_USERS_SQL = "delete from stud_attdetails where id = ?;";
	private static final String UPDATE_USERS_SQL = "update stud_attdetails set stud_name = ?, sub_name= ?, lec_name =?, dob =?, status =?  where id = ?;";
	
	public AttendanceDetailPage_DAO() {
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

	public void insertUser(AttendanceDetailPage_User user) throws SQLException {
		System.out.println(INSERT_USERS_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, user.getStud_name());
			preparedStatement.setString(2, user.getSub_name());
			preparedStatement.setString(3, user.getLec_name());
			preparedStatement.setString(4, user.getDob());
			preparedStatement.setString(5, user.getStatus());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	public AttendanceDetailPage_User selectUser(int id) {
		AttendanceDetailPage_User user = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String stud_name = rs.getString("stud_name");
				String sub_name = rs.getString("sub_name");
				String lec_name = rs.getString("lec_name");
				String dob = rs.getString("dob");
				String status = rs.getString("status");
							
				user = new AttendanceDetailPage_User(id, stud_name, sub_name, lec_name, dob, status);
								
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return user;
	}

	public List<AttendanceDetailPage_User> selectAllUsers() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<AttendanceDetailPage_User> users = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String stud_name = rs.getString("stud_name");
				String sub_name = rs.getString("sub_name");
				String lec_name = rs.getString("lec_name");
				String dob = rs.getString("dob");
				String status = rs.getString("status");
				users.add(new AttendanceDetailPage_User(id, stud_name, sub_name, lec_name, dob, status));
							
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return users;
	}

	public boolean deleteUser(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	public boolean updateUser(AttendanceDetailPage_User user) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
			statement.setString(1, user.getStud_name());
			statement.setString(2, user.getSub_name());
			statement.setString(3, user.getLec_name());
			statement.setString(4, user.getDob());
			statement.setString(5, user.getStatus());
			statement.setInt(6, user.getId());
						
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
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
