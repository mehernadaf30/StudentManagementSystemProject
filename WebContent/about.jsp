<%-- <%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="net.studentmanagementsystem.dao.LoginPage_DAO" %>
<%@ page import="net.studentmanagementsystem.model.LoginPage_User" %>
<%@ page import="java.io.IOException" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="javax.servlet.ServletException"  %>
<%@ page import="java.sql.SQLException"  %>
<%@ page import="javax.servlet.RequestDispatcher"  %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT MANAGEMENT SYSTEM</title>
</head>
    	
<body>
	
	<h1 style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif;"><b>STUDENT MANAGEMENT SYSTEM</b></h1>
	
	<div>
		<h3>
			It acts as a management information system, whereby the large chunk of information related to students, parents, and teachers are stored in a single place. Furthermore, it is known by many names. Some of which includes, school database management system, student information management system, student ERP system, and more.
		</h3>
		
		<h3>	
			Application can be logged in as Admin, Faculty and Student.
		</h3>
		
		<h3>
			Admin can perform different operation including admissions, storing result data and other information.
		</h3>
		
		<h3>
			Faculty can manage records for adding subject, result and attendance, maintaining marksheets.
		</h3>
		
		<h3>
			Student can have access to marksheet, subject wise marks, result, etc.
		</h3>
		
		<h3>	
			Admin and Faculty have rights to modify records and update to backends.
		</h3>
	</div>
	
	<div>
		<input type=button value="Back" class="btn btn-success" onclick="goBack()" style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif; width: 100px; height: 30px;">
	</div>
</body>

<script>
function goBack() {
	try
    {
        if((request.getSession(false).getAttribute("Admin")== null))
        {
            request.getRequestDispatcher("Admin.jsp").forward(request, response);
        }
        else if((request.getSession(false).getAttribute("Faculty")== null))
        {
            request.getRequestDispatcher("Faculty.jsp").forward(request, response);
        }
        else if((request.getSession(false).getAttribute("Student")== null))
        {
            request.getRequestDispatcher("Student.jsp").forward(request, response);
        }
        else
        {
            request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
	//window.history.back();
}
</script>

</html>