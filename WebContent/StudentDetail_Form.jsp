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

<%-- <form action="<%= request.getContextPath() %>/studentDetailPage_Servlet" method="post"> --%>
<!-- <form action="studentDetailPage_Servlet" method="post"> -->

<!-- <form onsubmit = "return validate();"> -->
	
	<div class="container col-md-5">
	<h1 style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif;"><b>STUDENT LIST</b></h1>
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
					<label>Email ID</label> <input type="email"
						value="<c:out value='${user.emailid}' />" class="form-control"
						name="emailid">
				</fieldset>

				<fieldset class="form-group">
					<label>DOB</label> <input type="date"
						value="<c:out value='${user.dob}' />" class="form-control"
						name="dob">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Contact</label> <input type="text"
						value="<c:out value='${user.contact}' />" class="form-control"
						name="contact">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Address</label> <input type="text"
						value="<c:out value='${user.address}' />" class="form-control"
						name="address">
				</fieldset>
				

				<!-- Added here - 12OCT20 -->
				<button type="submit" class="btn btn-success" name="btn_add" id="btn_add">Save</button>
				<button type="submit" class="btn btn-success">Back</button>
				<!-- <input type="submit" name="btn_add" value="Save"> -->
				</form>
				<!-- </form> -->
			</div>
		</div>
		
		<!-- Added her- 12OCT20 -->
				<%-- <center>
					<h3 style="color:red;">
					
					<%
						if(request.getAttribute("InsertErrorMsg") != null) {
							out.println(request.getAttribute("InsertErrorMsg"));			//get insert record fail error message from Servlet.java file
						}
					%>
					</h3>
					
					<!-- <h1> <a href="StudentDetail_Form.jsp">Back </a></h1> -->
				</center> --%>
		
	</div>
	
	<!-- </form> -->
	
</body>
</html>
