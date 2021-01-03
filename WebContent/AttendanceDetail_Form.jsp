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
	<h1 style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif;"><b>ATTENDANCE LIST</b></h1>
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
					<label>Student Name</label> <input type="text"
						value="<c:out value='${user.stud_name}' />" class="form-control"
						name="stud_name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Subject Name</label> <input type="text"
						value="<c:out value='${user.sub_name}' />" class="form-control"
						name="sub_name">
				</fieldset>

				<fieldset class="form-group">
					<label>Lecture Name</label> <input type="text"
						value="<c:out value='${user.lec_name}' />" class="form-control"
						name="lec_name">
				</fieldset>
				
				<fieldset class="form-group">
					<label>DOB</label> <input type="date"
						value="<c:out value='${user.dob}' />" class="form-control"
						name="dob">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Status</label> <input type="text"
						value="<c:out value='${user.status}' />" class="form-control"
						name="status">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				<button type="submit" class="btn btn-success">Back</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
