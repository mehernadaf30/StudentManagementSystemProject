package net.studentmanagementsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.studentmanagementsystem.model.MarksheetDetailPage_User;

/**
 * AbstractDAO.java This DAO class provides CRUD database operations for the
 * table users in the database.
 */
public class MarksheetDetailPage_DAO {
	//localhost:port_number/database_name
	
	private String jdbcURL = "jdbc:mysql://localhost/test1";
	private String jdbcUsername = "root";
	private String jdbcPassword = "";

	private static final String INSERT_USERS_SQL = "INSERT INTO  stud_addmarksheet" + "  (\n" + 
			"index_no ,dept_name ,division ,rollno ,year ,stud_name, sub1_code ,sub1_name ,sub1_max_marks ,sub1_min_marks ,sub1_marks_obtained ,sub1_marks_in_words ,sub2_code,sub2_name ,sub2_max_marks ,sub2_min_marks ,sub2_marks_obtained ,sub2_marks_in_words ,sub3_code ,sub3_name ,sub3_max_marks ,sub3_min_marks ,sub3_marks_obtained,sub3_marks_in_words ,sub4_code ,sub4_name ,sub4_max_marks ,sub4_min_marks ,sub4_marks_obtained ,sub4_marks_in_words ,sub5_code ,sub5_name ,sub5_max_marks,sub5_min_marks ,sub5_marks_obtained ,sub5_marks_in_words ,other_sub1_code ,other_sub1_name ,other_sub1_grades ,other_sub2_code ,other_sub2_name ,other_sub2_grades,total_marks ,total_min_marks ,total_marks_obtained ,total_marks_obtained_in_words ,final_result ,percentage) VALUES "
			+ " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

	private static final String SELECT_USER_BY_ID = "select id, index_no ,dept_name ,division ,rollno ,year ,stud_name, sub1_code ,sub1_name ,sub1_max_marks ,sub1_min_marks ,sub1_marks_obtained ,sub1_marks_in_words ,sub2_code,sub2_name ,sub2_max_marks ,sub2_min_marks ,sub2_marks_obtained ,sub2_marks_in_words ,sub3_code ,sub3_name ,sub3_max_marks ,sub3_min_marks ,sub3_marks_obtained,sub3_marks_in_words ,sub4_code ,sub4_name ,sub4_max_marks ,sub4_min_marks ,sub4_marks_obtained ,sub4_marks_in_words ,sub5_code ,sub5_name ,sub5_max_marks,sub5_min_marks ,sub5_marks_obtained ,sub5_marks_in_words ,other_sub1_code ,other_sub1_name ,other_sub1_grades ,other_sub2_code ,other_sub2_name ,other_sub2_grades,total_marks ,total_min_marks ,total_marks_obtained ,total_marks_obtained_in_words ,final_result ,percentage from stud_addmarksheet where id =?";
	private static final String SELECT_ALL_USERS = "select * from stud_addmarksheet";
	private static final String DELETE_USERS_SQL = "delete from stud_addmarksheet where id = ?;";
	private static final String UPDATE_USERS_SQL = "update stud_addmarksheet set index_no = ? ,dept_name = ? ,division = ? ,rollno = ? ,year = ? ,stud_name = ?, sub1_code = ? ,sub1_name = ? ,sub1_max_marks = ? ,sub1_min_marks = ? ,sub1_marks_obtained = ? ,sub1_marks_in_words = ? ,sub2_code = ? ,sub2_name = ? ,sub2_max_marks = ? ,sub2_min_marks = ? ,sub2_marks_obtained = ? ,sub2_marks_in_words = ? ,sub3_code = ? ,sub3_name = ? ,sub3_max_marks = ? ,sub3_min_marks = ? ,sub3_marks_obtained = ? ,sub3_marks_in_words = ? ,sub4_code = ? ,sub4_name = ? ,sub4_max_marks = ? ,sub4_min_marks = ? ,sub4_marks_obtained = ? ,sub4_marks_in_words = ? ,sub5_code = ? ,sub5_name = ? ,sub5_max_marks = ? ,sub5_min_marks = ? ,sub5_marks_obtained = ? ,sub5_marks_in_words = ? ,other_sub1_code = ? ,other_sub1_name = ? ,other_sub1_grades = ? ,other_sub2_code = ? ,other_sub2_name = ? ,other_sub2_grades = ? ,total_marks = ? ,total_min_marks = ? ,total_marks_obtained = ? ,total_marks_obtained_in_words = ? ,final_result = ? ,percentage = ?  where id = ?;";
	

	public MarksheetDetailPage_DAO() {
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

	public void insertUser(MarksheetDetailPage_User user) throws SQLException {
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

	public MarksheetDetailPage_User selectUser(int id) {
		MarksheetDetailPage_User user = null;
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
	
				 String index_no = rs.getString("index_no");
				 String dept_name = rs.getString("dept_name");
				 String division = rs.getString("division");
				 int rollno = rs.getInt("rollno");
				 String year = rs.getString("year");
				 String stud_name = rs.getString("stud_name");
				 String sub1_code = rs.getString("sub1_code");
				 String sub1_name = rs.getString("sub1_name");
				 int sub1_max_marks = rs.getInt("sub1_max_marks");
				 int sub1_min_marks = rs.getInt("sub1_min_marks");
				 int sub1_marks_obtained = rs.getInt("sub1_marks_obtained");
				 String sub1_marks_in_words = rs.getString("sub1_marks_in_words");
				 String sub2_code = rs.getString("sub2_code");
				 String sub2_name = rs.getString("sub2_name");
				 int sub2_max_marks = rs.getInt("sub2_max_marks");
				 int sub2_min_marks = rs.getInt("sub2_min_marks");
				 int sub2_marks_obtained = rs.getInt("sub2_marks_obtained");
				 String sub2_marks_in_words = rs.getString("sub2_marks_in_words");
				 String sub3_code = rs.getString("sub3_code");
				 String sub3_name = rs.getString("sub3_name");
				 int sub3_max_marks = rs.getInt("sub3_max_marks");
				 int sub3_min_marks = rs.getInt("sub3_min_marks");
				 int sub3_marks_obtained = rs.getInt("sub3_marks_obtained");
				 String sub3_marks_in_words = rs.getString("sub3_marks_in_words");
				 String sub4_code = rs.getString("sub4_code");
				 String sub4_name = rs.getString("sub4_name");
				 int sub4_max_marks = rs.getInt("sub4_max_marks");
				 int sub4_min_marks = rs.getInt("sub4_min_marks");
				 int sub4_marks_obtained = rs.getInt("sub4_marks_obtained");
				 String sub4_marks_in_words = rs.getString("sub4_marks_in_words");
				 String sub5_code = rs.getString("sub5_code");
				 String sub5_name = rs.getString("sub5_name");
				 int sub5_max_marks = rs.getInt("sub5_max_marks");
				 int sub5_min_marks = rs.getInt("sub5_min_marks");
				 int sub5_marks_obtained = rs.getInt("sub5_marks_obtained");
				 String sub5_marks_in_words = rs.getString("sub5_marks_in_words");
				 String other_sub1_code = rs.getString("other_sub1_code");
				 String other_sub1_name = rs.getString("other_sub1_name");
				 String other_sub1_grades = rs.getString("other_sub1_grades");
				 String other_sub2_code = rs.getString("other_sub2_code");
				 String other_sub2_name = rs.getString("other_sub2_name");
				 String other_sub2_grades = rs.getString("other_sub2_grades");
				 int total_marks = rs.getInt("total_marks");
				 int total_min_marks = rs.getInt("total_min_marks");
				 int total_marks_obtained = rs.getInt("total_marks_obtained");
				 String total_marks_obtained_in_words = rs.getString("total_marks_obtained_in_words");
				 String final_result = rs.getString("final_result");
				 String percentage = rs.getString("percentage");
						
				user = new MarksheetDetailPage_User(id, index_no ,dept_name ,division ,rollno ,year ,stud_name ,sub1_code ,sub1_name ,sub1_max_marks ,sub1_min_marks ,sub1_marks_obtained ,sub1_marks_in_words ,sub2_code,sub2_name ,sub2_max_marks ,sub2_min_marks ,sub2_marks_obtained ,sub2_marks_in_words ,sub3_code ,sub3_name ,sub3_max_marks ,sub3_min_marks ,sub3_marks_obtained,sub3_marks_in_words ,sub4_code ,sub4_name ,sub4_max_marks ,sub4_min_marks ,sub4_marks_obtained ,sub4_marks_in_words ,sub5_code ,sub5_name ,sub5_max_marks,sub5_min_marks ,sub5_marks_obtained ,sub5_marks_in_words ,other_sub1_code ,other_sub1_name ,other_sub1_grades ,other_sub2_code ,other_sub2_name ,other_sub2_grades,total_marks ,total_min_marks ,total_marks_obtained ,total_marks_obtained_in_words ,final_result ,percentage);
								
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return user;
	}

	public List<MarksheetDetailPage_User> selectAllUsers() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<MarksheetDetailPage_User> users = new ArrayList<>();
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
				 String index_no = rs.getString("index_no");
				 String dept_name = rs.getString("dept_name");
				 String division = rs.getString("division");
				 int rollno = rs.getInt("rollno");
				 String year = rs.getString("year");
				 String stud_name = rs.getString("stud_name");
				 String sub1_code = rs.getString("sub1_code");
				 String sub1_name = rs.getString("sub1_name");
				 int sub1_max_marks = rs.getInt("sub1_max_marks");
				 int sub1_min_marks = rs.getInt("sub1_min_marks");
				 int sub1_marks_obtained = rs.getInt("sub1_marks_obtained");
				 String sub1_marks_in_words = rs.getString("sub1_marks_in_words");
				 String sub2_code = rs.getString("sub2_code");
				 String sub2_name = rs.getString("sub2_name");
				 int sub2_max_marks = rs.getInt("sub2_max_marks");
				 int sub2_min_marks = rs.getInt("sub2_min_marks");
				 int sub2_marks_obtained = rs.getInt("sub2_marks_obtained");
				 String sub2_marks_in_words = rs.getString("sub2_marks_in_words");
				 String sub3_code = rs.getString("sub3_code");
				 String sub3_name = rs.getString("sub3_name");
				 int sub3_max_marks = rs.getInt("sub3_max_marks");
				 int sub3_min_marks = rs.getInt("sub3_min_marks");
				 int sub3_marks_obtained = rs.getInt("sub3_marks_obtained");
				 String sub3_marks_in_words = rs.getString("sub3_marks_in_words");
				 String sub4_code = rs.getString("sub4_code");
				 String sub4_name = rs.getString("sub4_name");
				 int sub4_max_marks = rs.getInt("sub4_max_marks");
				 int sub4_min_marks = rs.getInt("sub4_min_marks");
				 int sub4_marks_obtained = rs.getInt("sub4_marks_obtained");
				 String sub4_marks_in_words = rs.getString("sub4_marks_in_words");
				 String sub5_code = rs.getString("sub5_code");
				 String sub5_name = rs.getString("sub5_name");
				 int sub5_max_marks = rs.getInt("sub5_max_marks");
				 int sub5_min_marks = rs.getInt("sub5_min_marks");
				 int sub5_marks_obtained = rs.getInt("sub5_marks_obtained");
				 String sub5_marks_in_words = rs.getString("sub5_marks_in_words");
				 String other_sub1_code = rs.getString("other_sub1_code");
				 String other_sub1_name = rs.getString("other_sub1_name");
				 String other_sub1_grades = rs.getString("other_sub1_grades");
				 String other_sub2_code = rs.getString("other_sub2_code");
				 String other_sub2_name = rs.getString("other_sub2_name");
				 String other_sub2_grades = rs.getString("other_sub2_grades");
				 int total_marks = rs.getInt("total_marks");
				 int total_min_marks = rs.getInt("total_min_marks");
				 int total_marks_obtained = rs.getInt("total_marks_obtained");
				 String total_marks_obtained_in_words = rs.getString("total_marks_obtained_in_words");
				 String final_result = rs.getString("final_result");
				 String percentage = rs.getString("percentage");
				
				users.add(new MarksheetDetailPage_User(id, index_no ,dept_name ,division ,rollno ,year ,stud_name ,sub1_code ,sub1_name ,sub1_max_marks ,sub1_min_marks ,sub1_marks_obtained ,sub1_marks_in_words ,sub2_code,sub2_name ,sub2_max_marks ,sub2_min_marks ,sub2_marks_obtained ,sub2_marks_in_words ,sub3_code ,sub3_name ,sub3_max_marks ,sub3_min_marks ,sub3_marks_obtained,sub3_marks_in_words ,sub4_code ,sub4_name ,sub4_max_marks ,sub4_min_marks ,sub4_marks_obtained ,sub4_marks_in_words ,sub5_code ,sub5_name ,sub5_max_marks,sub5_min_marks ,sub5_marks_obtained ,sub5_marks_in_words ,other_sub1_code ,other_sub1_name ,other_sub1_grades ,other_sub2_code ,other_sub2_name ,other_sub2_grades,total_marks ,total_min_marks ,total_marks_obtained ,total_marks_obtained_in_words ,final_result ,percentage));
							
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

	public boolean updateUser(MarksheetDetailPage_User user) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
						
			statement.setString(1, user.getIndex_no());
			statement.setString(2, user.getDept_name());
			statement.setString(3, user.getDivision());
			statement.setInt(4, user.getRollno());
			statement.setString(5, user.getYear());
			statement.setString(6, user.getStud_name());
			statement.setString(7, user.getSub1_code());
			statement.setString(8, user.getSub1_name());
			statement.setInt(9, user.getSub1_max_marks());
			statement.setInt(10, user.getSub1_min_marks());
			statement.setInt(11, user.getSub1_marks_obtained());
			statement.setString(12, user.getSub1_marks_in_words());
			statement.setString(13, user.getSub2_code());
			statement.setString(14, user.getSub2_name());
			statement.setInt(15, user.getSub2_max_marks());
			statement.setInt(16, user.getSub2_min_marks());
			statement.setInt(17, user.getSub2_marks_obtained());
			statement.setString(18, user.getSub2_marks_in_words());
			statement.setString(19, user.getSub3_code());
			statement.setString(20, user.getSub3_name());
			statement.setInt(21, user.getSub3_max_marks());
			statement.setInt(22, user.getSub3_min_marks());
			statement.setInt(23, user.getSub3_marks_obtained());
			statement.setString(24, user.getSub3_marks_in_words());
			statement.setString(25, user.getSub4_code());
			statement.setString(26, user.getSub4_name());
			statement.setInt(27, user.getSub4_max_marks());
			statement.setInt(28, user.getSub4_min_marks());
			statement.setInt(29, user.getSub4_marks_obtained());
			statement.setString(30, user.getSub4_marks_in_words());
			statement.setString(31, user.getSub5_code());
			statement.setString(32, user.getSub5_name());
			statement.setInt(33, user.getSub5_max_marks());
			statement.setInt(34, user.getSub5_min_marks());
			statement.setInt(35, user.getSub5_marks_obtained());
			statement.setString(36, user.getSub5_marks_in_words());
			statement.setString(37, user.getOther_sub1_code());
			statement.setString(38, user.getOther_sub1_name());
			statement.setString(39, user.getOther_sub1_grades());
			statement.setString(40, user.getOther_sub2_code());
			statement.setString(41, user.getOther_sub2_name());
			statement.setString(42, user.getOther_sub2_grades());
			statement.setInt(43, user.getTotal_marks());
			statement.setInt(44, user.getTotal_min_marks());
			statement.setInt(45, user.getTotal_marks_obtained());
			statement.setString(46, user.getTotal_marks_obtained_in_words());
			statement.setString(47, user.getFinal_result());
			statement.setString(48, user.getPercentage());
			statement.setInt(49, user.getId());
						
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
