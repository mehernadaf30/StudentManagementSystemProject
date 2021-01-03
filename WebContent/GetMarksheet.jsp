<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>

<%-- <jsp:useBean id="demo" class="net.studentmanagementsystem.model.MarksheetDetailPage_User" scope="session"/> --%>

<%
	/* Get Marksheet Fields */
	//net.studentmanagementsystem.model.MarksheetDetailPage_User marksheetValues = new net.studentmanagementsystem.model.MarksheetDetailPage_User();

	/* Get user from user through input box */
	int getuser_rollno = Integer.valueOf(request.getParameter("rollno"));
	
	String driver = "com.mysql.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost/";
	String database = "test1";
	String userid = "root";
	String password = "";
	
	try {
	Class.forName(driver);
	} catch (ClassNotFoundException e) {
	e.printStackTrace();
	}
	Connection connection = null;
	//Statement statement = null;
	ResultSet resultSet = null;
	PreparedStatement st = null;
%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>GET MARKSHEET</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:useBean id="now" class="java.util.Date"/>

<%
	try{
		connection = DriverManager.getConnection(connectionUrl+database, userid, password);
		//statement=connection.createStatement();
		//String sql ="select * from demo where name = ?";
		//statement.setString(1, "name"); 
		
		st = connection.prepareStatement("select * from stud_addmarksheet where rollno = ?");
		//PreparedStatement st = con.prepareStatement("select * from demo");
		
		st.setInt(1, getuser_rollno); 
		
		resultSet = st.executeQuery();
		
		while(resultSet.next()){
%>

<div class="container-fluid">
  <div class="row" style="background-color:lavender;">
    <div class="col-xs-2 col-md-2">
    	<h5><center><b>Index No.<span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b>Stream<span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b>Division<span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b>Roll No.<span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b>Year<span class="label label-default"></span></b></center></h5>
    </div>
  </div>
  
  <div class="row" style="background-color:lavenderblush;">
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%=resultSet.getString("index_no") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%=resultSet.getString("dept_name") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%=resultSet.getString("division") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%=resultSet.getInt("rollno") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%=resultSet.getString("year") %> <span class="label label-default"></span></b></center></h5>
    </div>
  </div>
  <hr>
  
  <h4><center><b>CANDIDATE'S FULL NAME (SURNAME FIRST)</b></center></h4>
  <h5><center><b> <%=resultSet.getString("stud_name") %> </b></center></h5>
  <hr>

   <div class="row" style="background-color:lavender;">
    <div class="col-xs-2 col-md-2">
    	<h5><center><b>Subject Code<span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b>Subject Name<span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b>Max. Marks<span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b>Min. Marks<span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b>Marks Obtained<span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b>In Words<span class="label label-default"></span></b></center></h5>
    </div>
  </div>
    
   <div class="row" style="background-color:lavenderblush;">
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub1_code") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub1_name") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub1_max_marks") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub1_min_marks") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub1_marks_obtained") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub1_marks_in_words") %> <span class="label label-default"></span></b></center></h5>
    </div>
  </div>	
  
  <div class="row" style="background-color:lavenderblush;">
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub2_code") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub2_name") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub2_max_marks") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub2_min_marks") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub2_marks_obtained") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub2_marks_in_words") %> <span class="label label-default"></span></b></center></h5>
    </div>
  </div>
  
  <div class="row" style="background-color:lavenderblush;">
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub3_code") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub3_name") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub3_max_marks") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub3_min_marks") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub3_marks_obtained") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub3_marks_in_words") %> <span class="label label-default"></span></b></center></h5>
    </div>
  </div>
  
  <div class="row" style="background-color:lavenderblush;">
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub4_code") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub4_name") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub4_max_marks") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub4_min_marks") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub4_marks_obtained") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub4_marks_in_words") %> <span class="label label-default"></span></b></center></h5>
    </div>
  </div>
  
  <div class="row" style="background-color:lavenderblush;">
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub5_code") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub5_name") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub5_max_marks") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub5_min_marks") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("sub5_marks_obtained") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("sub5_marks_in_words") %> <span class="label label-default"></span></b></center></h5>
    </div>
  </div>
  
  <!--Other Sub1-->
  <div class="row" style="background-color:lavenderblush;">
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("other_sub1_code") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("other_sub1_name") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> GRADE <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b><span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("other_sub1_grades") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b><span class="label label-default"></span></b></center></h5>
    </div>
  </div>
  
  <!--Other Sub2-->
  <div class="row" style="background-color:lavenderblush;">
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("other_sub2_code") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("other_sub2_name") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> GRADE <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b><span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("other_sub2_grades") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b><span class="label label-default"></span></b></center></h5>
    </div>
  </div>
  
  
  <!--Total marks-->
  <div class="row" style="background-color:lightcyan;">
    <div class="col-xs-2 col-md-2">
    	<h5><center><b><span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b><span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b>Total Marks  <%= resultSet.getInt("total_marks") %>  <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("total_min_marks") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getInt("total_marks_obtained") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("total_marks_obtained_in_words") %> <span class="label label-default"></span></b></center></h5>
    </div>
  </div>


  <!--Final Result Status-->
  <div class="row" style="background-color:lightcyan;">
    <div class="col-xs-8 col-md-8">
    	<h5><center><b> Result: <%= resultSet.getString("final_result") %> <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b>Percentage <span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-2 col-md-2">
    	<h5><center><b> <%= resultSet.getString("percentage") %> <span class="label label-default"></span></b></center></h5>
    </div>
  </div>
  <hr>
  <hr>
	
  <!-- Stamp Section-->  
  <div class="row" style="background-color:lightgrey;">
    <div class="col-xs-3  col-md-3">
    	<h5><center><b>Date: <%= now %><span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-3  col-md-3">
    	<h5><center><b>Class Teacher<span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-3  col-md-3">
    	<h5><center><b>Convenor Exam Committe<span class="label label-default"></span></b></center></h5>
    </div>
    <div class="col-xs-3  col-md-3">
    	<h5><center><b>Vice Principal<span class="label label-default"></span></b></center></h5>
    </div>
  </div>
  <hr> <hr>
  
  <a href="GetMarksheet_Input.jsp"><button type="submit" class="btn btn-success" value="submit" style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif; width: 100px; height: 30px;">BACK</button></a>
  
 </div>

 
 <%
		}
	
	connection.close();
	} catch (Exception e) {
	e.printStackTrace();
	}
%>
 
</body>
</html>