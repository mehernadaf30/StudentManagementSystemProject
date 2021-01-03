<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Marksheet Input</title>
</head>
<body>
	<div class="container col-md-5">
		<h1 style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif;"><center><b>GET MARKSHEET</b></center></h1>
	
		<div class="card">
			<div class="card-body">
				<form method="post" action="GetMarksheet.jsp">
					<fieldset class="form-group">
						<label><b>Enter Roll No: </b></label> 
						<input type="text" class="form-control" name="rollno" id="rollno" required>
					</fieldset>
					<br><br>
					
					<button type="submit" class="btn btn-success" value="submit" style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif; width: 100px; height: 30px;">SUBMIT</button>
					
					<input type=button value="Back" onclick="goBack()" style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif; width: 100px; height: 30px;">
					
					<%-- <a href="
					<% //In case, if Admin session is not set, redirect to Login page
					if((request.getSession(true).getAttribute("Admin")) != null)
					{
					%>
						<jsp:forward page="Admin.jsp"></jsp:forward>
					<%	} %>
					
					<% //In case, if Admin session is not set, redirect to Login page
					if((request.getSession(true).getAttribute("Faculty")) != null)
						{
					%>
					<jsp:forward page="Faculty.jsp"></jsp:forward>
					<%	} %>
					
					<% //In case, if Admin session is not set, redirect to Login page
					if((request.getSession(true).getAttribute("Student")) != null)
						{
					%>
						<jsp:forward page="Student.jsp"></jsp:forward>
					<%	} %>
					
					<% //In case, if Admin session is not set, redirect to Login page
					if((request.getSession(false).getAttribute("Admin")== null))
						{
					%>
						<jsp:forward page="LoginPage.jsp"></jsp:forward>
					<%	} %> "></a> <button>BACK</button> --%>
					
					
				</form>
			</div>
		</div>
	</div>
</body>

<script>
function goBack() {
  //window.history.back();
  	//window.history.go(0);
	//window.history.go(-1);
	//window.history.back();
	window.history.forward();
	window.history.go(-2);
	
}
</script>

</html>

<!-- <input type=button value="Back" onCLick="history.back()"> -->

	<%-- <% //In case, if Admin session is not set, redirect to Login page
		if((request.getSession(true).getAttribute("Admin")) != null)
		{
	%>
		<jsp:forward page="Admin.jsp"></jsp:forward>
	<%	} %>
	<% //In case, if Admin session is not set, redirect to Login page
	if((request.getSession(true).getAttribute("Faculty")) != null)
		{
	%>
		<jsp:forward page="Faculty.jsp"></jsp:forward>
	<%	} %>
	<% //In case, if Admin session is not set, redirect to Login page
	if((request.getSession(true).getAttribute("Student")) != null)
		{
	%>
		<jsp:forward page="Student.jsp"></jsp:forward>
	<%	} %>
	<% //In case, if Admin session is not set, redirect to Login page
	if((request.getSession(false).getAttribute("Admin")== null))
		{
	%>
		<jsp:forward page="LoginPage.jsp"></jsp:forward>
	<%	} %> --%>


<%-- <c:choose>
    <c:when test="<%= request.getAttribute("admin") %>">
        <a href="Admin.jsp"><button class="btn btn-success" style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif; width: 100px; height: 30px;">BACK</button></a>
        <br />
    </c:when>
    <c:when test="<%= request.getAttribute("faculty") %>">
        <a href="Faculty.jsp"><button class="btn btn-success" style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif; width: 100px; height: 30px;">BACK</button></a>
        <br />
    </c:when> 
    <c:when test="<%= request.getAttribute("student") %>">
        <a href="Student.jsp"><button class="btn btn-success" style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif; width: 100px; height: 30px;">BACK</button></a>
        <br />
    </c:when>      
    <c:otherwise>
        <a href="LoginPage.jsp"><button class="btn btn-success" style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif; width: 100px; height: 30px;">BACK</button></a>
        <br />
    </c:otherwise>
</c:choose> --%>