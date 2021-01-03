package net.studentmanagementsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.studentmanagementsystem.model.SubjectDetailPage_User;

/**
 * AbstractDAO.java This DAO class provides CRUD database operations for the
 * table users in the database.
 */
public class SubjectDetailPage_DAO {
	//localhost:port_number/database_name
	
	private String jdbcURL = "jdbc:mysql://localhost/test1";
	private String jdbcUsername = "root";
	private String jdbcPassword = "";

	private static final String INSERT_USERS_SQL = "INSERT INTO sub_details" + "  (sub_name, sub_code, lecturer_name, lec_time, department) VALUES "
			+ " (?, ?, ?, ?, ?);";

	private static final String SELECT_USER_BY_ID = "select id, sub_name, sub_code, lecturer_name, lec_time, department from sub_details where id =?";
	private static final String SELECT_ALL_USERS = "select * from sub_details";
	private static final String DELETE_USERS_SQL = "delete from sub_details where id = ?;";
	private static final String UPDATE_USERS_SQL = "update sub_details set sub_name = ?, sub_code= ?, lecturer_name =?, lec_time =?, department =?  where id = ?;";
	

	public SubjectDetailPage_DAO() {
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

	public void insertUser(SubjectDetailPage_User user) throws SQLException {
		System.out.println(INSERT_USERS_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, user.getSub_name());
			preparedStatement.setString(2, user.getSub_code());
			preparedStatement.setString(3, user.getLecturer_name());
			preparedStatement.setString(4, user.getLec_time());
			preparedStatement.setString(5, user.getDepartment());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	public SubjectDetailPage_User selectUser(int id) {
		SubjectDetailPage_User user = null;
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
				String sub_name = rs.getString("sub_name");
				String sub_code = rs.getString("sub_code");
				String lecturer_name = rs.getString("lecturer_name");
				String lec_time = rs.getString("lec_time");
				String department = rs.getString("department");
							
				user = new SubjectDetailPage_User(id, sub_name, sub_code, lecturer_name, lec_time, department);
								
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return user;
	}

	public List<SubjectDetailPage_User> selectAllUsers() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<SubjectDetailPage_User> users = new ArrayList<>();
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
				String sub_name = rs.getString("sub_name");
				String sub_code = rs.getString("sub_code");
				String lecturer_name = rs.getString("lecturer_name");
				String lec_time = rs.getString("lec_time");
				String department = rs.getString("department");
				users.add(new SubjectDetailPage_User(id, sub_name, sub_code, lecturer_name, lec_time, department));
							
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

	public boolean updateUser(SubjectDetailPage_User user) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
			statement.setString(1, user.getSub_name());
			statement.setString(2, user.getSub_code());
			statement.setString(3, user.getLecturer_name());
			statement.setString(4, user.getLec_time());
			statement.setString(5, user.getDepartment());
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
