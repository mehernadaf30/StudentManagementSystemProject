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

	<div class="container col-md-5">
	<h1 style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif;"><b>ATTENDANCE</b></h1>
    <p><b>Add Attendance</b></p>
    <hr>
		<div class="card">
			<div class="card-body">
			<form action="<%= request.getContextPath() %>/addAttendance" method="post">										<!-- Added form tag here -->
							
				<fieldset class="form-group">
					<label><b>Student Name</b></label> <input type="text"
						class="form-control"
						name="stud_name" placeholder="Enter Student Name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label><b>Subject Name</b></label> <input type="text"
						class="form-control"
						name="subject_name" placeholder="Enter Subject Name">
				</fieldset>
				
				<fieldset class="form-group">
					<label for="status"><b>Status</b></label> <select id="status" name="status">
						<option value="">--Select Attendance--</option>
						<option value="Present">Present</option>
    					<option value="Absent">Absent</option>
					</select>
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Lecture Title</b></label> <input type="text"
						class="form-control"
						name="lecture_title" placeholder="Enter Lecture Title" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label for="dob"><b>Date</b></label> <input type="date"
						class="form-control"
						name="date" required="required">
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
