<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Student Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	
	<div class="container col-md-5">
	<h1 style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif;"><b>ADD FEE DETAILS</b></h1>
    <hr>
    
		<div class="card">
			<div class="card-body">
			<%-- <form action="<%= request.getContextPath() %>/studentDetails" method="post"> --%>
			<%-- <form action="<%= request.getContextPath() %>/list" method="post"> --%>
			<%-- <form action="<%= request.getContextPath() %>" method="post"> --%>
				<c:if test="${user != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${user == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${user != null}">
            			Edit User
            		</c:if>
						<c:if test="${user == null}">
            			Add New User
            		</c:if>
					</h2>
				</caption>

				<c:if test="${user != null}">
					<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label><b>Student Name</b></label> <input type="text"
						class="form-control"
						name="stud_name" placeholder="Enter Student Name" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Email ID</b></label> <input type="email"
						class="form-control"
						name="emailid" placeholder="Enter Email ID" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>School Name</b></label> <input type="text"
						class="form-control"
						name="school_name" placeholder="Enter School Name" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Course</b></label> <input type="text"
						class="form-control"
						name="course" placeholder="Enter Course">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Month</b></label> <input type="text"
						class="form-control"
						name="month" placeholder="Enter Month">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Total Fee</b></label> <input type="text"
						class="form-control"
						name="totalfee" placeholder="Enter Total Fee">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Paid Fee</b></label> <input type="text"
						class="form-control"
						name="paidfee" placeholder="Enter Paid Fee">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Remaining Fee</b></label> <input type="text"
						class="form-control"
						name="remfee" placeholder="Enter Remaining Fee">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Date</b></label> <input type="date"
						class="form-control"
						name="date" placeholder="Enter Date">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				<button type="submit" class="btn btn-success">Back</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
