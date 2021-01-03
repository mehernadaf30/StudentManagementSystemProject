<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {margin:0;font-family:Arial}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.active {
  background-color: #4CAF50;
  color: white;
}

.topnav .icon {
  display: none;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 17px;    
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.topnav a:hover, .dropdown:hover .dropbtn {
  background-color: #555;
  color: white;
}

.dropdown-content a:hover {
  background-color: #ddd;
  color: black;
}

.dropdown:hover .dropdown-content {
  display: block;
}

@media screen and (max-width: 600px) {
  .topnav a:not(:first-child), .dropdown .dropbtn {
    display: none;
  }
  .topnav a.icon {
    float: right;
    display: block;
  }
}

@media screen and (max-width: 600px) {
  .topnav.responsive {position: relative;}
  .topnav.responsive .icon {
    position: absolute;
    right: 0;
    top: 0;
  }
  .topnav.responsive a {
    float: none;
    display: block;
    text-align: left;
  }
  .topnav.responsive .dropdown {float: none;}
  .topnav.responsive .dropdown-content {position: relative;}
  .topnav.responsive .dropdown .dropbtn {
    display: block;
    width: 100%;
    text-align: left;
  }
}

h1, p {
	font-family: Arial, Helvetica, sans-serif;
	background-color: LightGray;
	color: green;
}

</style>
</head>

	<% //In case, if Editor session is not set, redirect to Login page
	if((request.getSession(false).getAttribute("Faculty")== null) )
	{
	%>
	<jsp:forward page="LoginPage.jsp"></jsp:forward>
	<%} %>

<body>

<div style="padding-left:16px; text-align:center; background-color:LightGray">
  <h1>STUDENT MANAGEMENT SYSTEM - FACULTY'S LOGIN</h1>
</div>

<div class="topnav" id="myTopnav">
  <a href="Admin.jsp" class="active">HOME</a>
  <a href="GetMarksheet_Input.jsp">GET MARKSHEET</a>
  <div class="dropdown">
    <button class="dropbtn">ADMINISTRATION 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
    	<a href="RegistrationForm_AddUserPage.jsp">ADD USER</a>
      	<a href="AddSubjectPage.jsp">ADD SUBJECT</a>
      	<a href="AddAttendance_UserPage.jsp">ADD ATTENDANCE</a>
      	<a href="AddMarksheet_UserPage.jsp">ADD MARKSHEET</a>
      	<a href="AddFee_UserPage.jsp">ADD FEE</a>
    </div>
  </div>
  <div class="dropdown">
    <button class="dropbtn">DETAILS 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="StudentDetail_List.jsp">STUDENT DETAIL</a>
      <a href="AttendanceDetail_List.jsp">ATTENDANCE DETAIL</a>
      <a href="SubjectDetail_List.jsp">SUBJECT DETAIL</a>
      <a href="MarksheetDetail_List.jsp">RESULT DETAIL</a>
      <a href="FeeDetail_List.jsp">FEE DETAIL</a>
    </div>
  </div>
  <!-- <a href="#news">MY ACCOUNT</a> -->
  <a href="LoginPage.jsp">LOGOUT</a>  
  <a href="about.jsp">ABOUT</a>
  <a href="javascript:void(0);" style="font-size:15px;" class="icon" onclick="myFunction()">&#9776;</a>
</div>

<div style="padding-left:16px; text-align:center; padding-top: 200px">
  <h2><%=request.getAttribute("fullname") %>, Welcome to Student Management System</h2>
</div>

<script>
function myFunction() {
  var x = document.getElementById("myTopnav");
  if (x.className === "topnav") {
    x.className += " responsive";
  } else {
    x.className = "topnav";
  }
}

/* function setCookie("Faculty",cvalue,exdays) {
	  var d = new Date();
	  d.setTime(d.getTime() + (exdays*24*60*60*1000));
	  var expires = "expires=" + d.toGMTString();
	  document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
	} */

</script>

</body>
</html>