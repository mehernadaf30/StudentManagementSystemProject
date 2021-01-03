<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Student Management System Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
<script>
	/* Add script code here. */
</script>	
</head>
<body>

	<%-- <header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: lightgreen">
			<div>
				<a href="https://www.javaguides.net" class="navbar-brand"> Student Management System App </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Add User</a></li>
			</ul>
		</nav>
	</header>
	<br> --%>
	<div class="container col-md-5">
	<h1 style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif;"><b>REGISTRATION FORM</b></h1>
    <p><b>Please fill in this form to create an account.</b></p>
    <hr>
		<div class="card">
			<div class="card-body">
			<form action="<%= request.getContextPath() %>/registerUser" method="post">										<!-- Added form tag here -->

				<fieldset class="form-group">
					<label><b>Select User Role ID</b></label> <select id="roleid"
						class="form-control"
						name="roleid">
							<option value="default">-- Select User Role ID --</option>
							<option value="1">Administrator-1</option>
    					    <option value="2">Faculty-2</option>
    					    <option value="3">Student-3</option>
						</select>
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>First Name</b></label> <input type="text"
						class="form-control"
						name="firstname" placeholder="Enter First Name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label><b>Last Name</b></label> <input type="text"
						class="form-control"
						name="lastname" placeholder="Enter Last Name">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Login ID</b></label> <input type="text"
						class="form-control"
						name="loginid" placeholder="Enter Login ID for registration">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Password</b></label> <input type="password"
						class="form-control"
						name="password" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Confirm Password</b></label> <input type="password"
						class="form-control"
						name="confirmpwd">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>School Name</b></label> <input type="text"
						class="form-control"
						name="schoolname" placeholder="Enter School Name">
				</fieldset>

				<fieldset class="form-group">
					<label><b>Course Name</b></label> <input type="text"
						class="form-control"
						name="coursename" placeholder="Enter Course Name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label><b>Telephone</b></label> <input type="text"
						class="form-control"
						name="telephone">
				</fieldset>

				<fieldset class="form-group">
					<label for="gender"><b>Gender</b></label> <%-- <input type="text"
						value="<c:out value='${user.gender}' />" class="form-control"
						name="gender"> --%>
						<input type="radio" name="gender" id="gender" value="female"> Female
    				    <input type="radio" name="gender" id="gender" value="male"> Male
				</fieldset>
				
				<fieldset class="form-group">
					<label for="dob"><b>Date of Birth</b></label> <input type="date"
						class="form-control"
						name="dob" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label><b>Email ID</b></label> <input type="text"
						class="form-control"
						name="emailid" placeholder="Enter Personal Email ID">
				</fieldset>

				<fieldset class="form-group">
					<label><b>Address1 [Present Address]</b></label> <input type="text"
						class="form-control"
						name="address1">
				</fieldset>

				<fieldset class="form-group">
					<label><b>Address2 [Permanent Address]</b></label> <input type="text"
						class="form-control"
						name="address2" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label><b>Country</b></label> <input type="text"
						class="form-control"
						name="country">
				</fieldset>

				<fieldset class="form-group">
					<label><b>State</b></label> <input type="text"
						class="form-control"
						name="state">
				</fieldset>

				<fieldset class="form-group">
					<label><b>City</b></label> <input type="text"
						class="form-control"
						name="city" required="required">
				</fieldset>

				<button type="submit" class="btn btn-success" style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif; width: 100px; height: 30px;">Save</button>
				<!-- <button type="submit" class="btn btn-success">Back</button> -->
				<input type=button value="Back" class="btn btn-success" onclick="goBack()" style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif; width: 100px; height: 30px;">
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
	/* window.history.forward();
	window.history.go(-2); */
	window.history.back();
}
</script>

</html>
