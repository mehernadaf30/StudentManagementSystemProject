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
	<h1 style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif;"><b>SUBJECT</b></h1>
    <p><b>Add Subject Details</b></p>
    <hr>
		<div class="card">
			<div class="card-body">
			<form action="<%= request.getContextPath() %>/addSubject" method="post">										<!-- Added form tag here -->
								
				<fieldset class="form-group">
					<label><b>Subject Name</b></label> <input type="text"
						class="form-control"
						name="subject_name" placeholder="Enter Subejct Name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label><b>Subject Description</b></label> <input type="text"
						class="form-control"
						name="subject_desc" placeholder="Enter Subject Description">
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
