<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Password changed successfully</title>

<style>
.loginbtn, .forgotpwdbtn {
  background-color : #31B0D5;
  color: white;
  padding: 10px 20px;
  border-radius: 4px;
  border-color: #46b8da;
}

#mybutton {
  position: fixed;
  bottom: -4px;
  right: 10px;
}
</style>


</head>
	<%-- <% //In case, if Editor session is not set, redirect to Login page
	if((request.getSession(false).getAttribute("reg")== null) )
	{
	%>
	<jsp:forward page="ForgotPasswordPage.jsp"></jsp:forward>
	<%} %> --%>
<body>
	<!-- <center><h2>Faculty's Home</h2></center> -->
	 
	<%-- <center> <%=request.getAttribute("reg") %> </center> --%>
	<%-- <script>out.println("alert('<%=request.getAttribute("reg") %>');");</script> --%>
	
	<% 
		String  s1  = (String) session.getAttribute("reg");        
	%>
	<center><h2 style="color:green;"><%= s1 %></h2></center>
    
	<%-- <div style="text-align: right">
		<a href="<%=request.getContextPath()%>/LoginServlet">
			<button type="button" class="loginbtn">Login</button>
		</a>
	</div>
	
	<div style="text-align: right">
		<a href="<%=request.getContextPath()%>/changePassword_Servlet">
			<button type="button" class="forgotpwdbtn">Forgot Password?</button>
		</a>
	</div> --%>
 
 	<!-- <div style="text-align: right">
		<a href="LoginPage.jsp">
			<button type="button" class="loginbtn">Login</button>
		</a>
	</div>
	
	<div style="text-align: right">
		<a href="ForgotPasswordPage.jsp">
			<button type="button" class="forgotpwdbtn">Forgot Password?</button>
		</a>
	</div> -->
	
	<!-- <div class="btn-group" style="position: absolute; right: 0; width:80%;" >
  		<a href="LoginPage.jsp"><button style="width:20%">LOGIN PAGE</button></a>
  		<a href="ForgotPasswordPage.jsp"><button style="width:30%">FORGOT PASSWORD PAGE</button></a>
	</div> -->
	
	<div id="mybutton">
		<a href="LoginPage.jsp"><button class="loginbtn">LOGIN PAGE</button></a>
		<a href="ForgotPasswordPage.jsp"><button class="forgotpwdbtn">FORGOT PASSWORD PAGE</button></a>
	</div>

</body>
</html>