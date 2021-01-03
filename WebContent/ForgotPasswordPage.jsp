<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <jsp:include page="changePassword.jsp"/> --%>
<%-- <jsp:useBean id="msg" class="net.studentmanagementsystem.model.Message" scope="session"/> --%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

/* Full-width input fields */
input[type=text], input[type=password], input[type=email], input[type=tel] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus, input[type=email]:focus, input[type=tel]:focus {
  background-color: #ddd;
  outline: none;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}

h1, p {
	font-family: Arial, Helvetica, sans-serif;
	background-color: LightGray;
	color: green;
}

.container .box {
	width:540px; 
    margin:50px; 
    display:table; 
}

.container .box .box-row {
	display:table-row;
}

.container .box .box-cell {
	display:table-cell; 
    width:50%; 
    padding:10px; 
}

.container .box .box-cell .box1 {
	background:green; 
    color:white; 
    text-align:justify; 
}

.container .box .box-cell .box2 { 
    background:lightgreen; 
    text-align:justify 
}

.container .box .box-cell .box3 { 
    background:lightgreen; 
    text-align:justify 
}

/* Set a style for the save button */
.savebtn, .backbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.savebtn:hover, .backbtn:hover {
  opacity: 1;
}

</style>
</head>
<body>

<h1>Reset Password Page</h1>

<!-- <form action="ForgotPasswordPage_Servlet" method="post"> -->
<%-- <form name="form" action="<%=request.getContextPath()%>/ForgotPasswordPage_Servlet" method="post"> --%>
<!-- <form action="changePassword.jsp" method="post"> -->
<form name="form" action="<%=request.getContextPath()%>/changePassword_Servlet" method="post">
  
  <!-- Added here -->
  <%-- <h2><%=request.getAttribute("reg") %></h2> --%>
  
  <%-- <h2><% m.getMessage() %></h2> --%>
  <%-- <% net.studentmanagementsystem.model.Message m = new net.studentmanagementsystem.model.Message(); %>
  Name:<% m.getMessage(); %> --%>
  
  <%-- <h2><span id="msg"> <%= request.getAttribute("results") %></span></h2> --%>
  <%-- <h2><%= request.getAttribute("reg") %></h2> --%>
  
  <%-- <h2><%= request.getAttribute("reg") %></h2> --%>
  <%-- <h2><%= "${reg.msg}" %></h2> --%>
  
  <%-- <span name="msgName"><%= request.getAttribute("reg") %></span> --%>
  
  <div class="container">
  	<div class="box">
  		<!-- <div class="box-row">
  			<label for="emailid"><b>Enter Email ID</b></label>
    		<input type="email" placeholder="Enter Email ID" name="emailid" required>
  		</div> -->
  		<div class="box-row">
  			<label for="old_psw"><b>Enter Old Password</b></label>
    		<input type="password" placeholder="Enter Old Password" name="old_psw" required>
  		</div>
  		<div class="box-row">
  			<label for="new_psw"><b>Enter New Password</b></label>
    		<input type="password" placeholder="Enter New Password" name="new_psw" required>
  		</div>
  		<div class="box-row">
  			<label for="confirm_new_psw"><b>Confirm New Password</b></label>
    		<input type="password" placeholder="Re-enter New Password to confirm" name="confirm_new_psw" required>
  		</div>
  	</div>
  	
  	<div class="container">
		<div class="box">
			<div class="box-row">
				<div class="box-cell box1">
					<button type="submit" class="savebtn">Submit</button>
				</div>
				<div class="box-cell box2">
					<a href="LoginPage.jsp"><button type="button" class="backbtn">BACK</button></a>
				</div>
			</div>
		</div>
	</div>
  	
  </div>
  
</form>
			<!-- Added here -->
		   <%-- <table>
               <tr>
                <h3><jsp:getProperty name=”reg” property=”msg” /></h3></br>    
            </tr>
          </table> --%>

</body>
</html>   