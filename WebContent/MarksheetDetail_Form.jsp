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
	<h1 style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif;"><b>ADD MARKSHEET DETAILS</b></h1>
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
					<label><b>Index No</b></label> <input type="text"
						class="form-control"
						name="index_no" placeholder="Enter Index No" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Select Department</b></label> <select id="dept_name"
						class="form-control"
						name="dept_name">
							<option value="default">-- Select Department --</option>
							<option value="CS">CS ENGINEERING</option>
    					    <option value="IT">IT ENGINEERING</option>
    					    <option value="MECH">MECHANICAL ENGINEERING</option>
    					    <option value="ELECTRICAL">ELECTRICAL ENGINEERING</option>
    					    <option value="CIVIL">CIVIL ENGINEERING</option>
    					    <option value="CHEMICAL">CHEMICAL ENGINEERING</option>
						</select>
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Division</b></label> <input type="text"
						class="form-control"
						name="division" placeholder="Enter Division" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Roll No</b></label> <input type="text"
						class="form-control"
						name="rollno" placeholder="Enter Roll No" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Year</b></label> <input type="text"
						class="form-control"
						name="year" placeholder="Enter Year">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Student Name</b></label> <input type="text"
						class="form-control"
						name="stud_name" placeholder="Enter Student Name">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 1 Code</b></label> <input type="text"
						class="form-control"
						name="sub1_code" placeholder="Enter Subject 1 Code">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 1 Name</b></label> <input type="text"
						class="form-control"
						name="sub1_name" placeholder="Enter Subject 1 Name">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 1 Max Marks</b></label> <input type="text"
						class="form-control"
						name="sub1_max_marks" placeholder="Enter Subject 1 Max Marks">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 1 Min Marks</b></label> <input type="text"
						class="form-control"
						name="sub1_min_marks" placeholder="Enter Subject 1 Min Marks">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 1 Marks Obtained</b></label> <input type="text"
						class="form-control"
						name="sub1_marks_obtained" placeholder="Enter Subject - 1 Marks Obtained">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 1 Marks In Words</b></label> <input type="text"
						class="form-control"
						name="sub1_marks_in_words" placeholder="Enter Subject - 1 Marks In Words">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 2 Code</b></label> <input type="text"
						class="form-control"
						name="sub2_code" placeholder="Enter Subject 2 Code">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 2 Name</b></label> <input type="text"
						class="form-control"
						name="sub2_name" placeholder="Enter Subject 2 Name">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 2 Max Marks</b></label> <input type="text"
						class="form-control"
						name="sub2_max_marks" placeholder="Enter Subject 2 Max Marks">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 2 Min Marks</b></label> <input type="text"
						class="form-control"
						name="sub2_min_marks" placeholder="Enter Subject 2 Min Marks">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 2 Marks Obtained</b></label> <input type="text"
						class="form-control"
						name="sub2_marks_obtained" placeholder="Enter Subject - 2 Marks Obtained">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 2 Marks In Words</b></label> <input type="text"
						class="form-control"
						name="sub2_marks_in_words" placeholder="Enter Subject - 2 Marks In Words">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 3 Code</b></label> <input type="text"
						class="form-control"
						name="sub3_code" placeholder="Enter Subject 3 Code">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 3 Name</b></label> <input type="text"
						class="form-control"
						name="sub3_name" placeholder="Enter Subject 3 Name">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 3 Max Marks</b></label> <input type="text"
						class="form-control"
						name="sub3_max_marks" placeholder="Enter Subject 3 Max Marks">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 3 Min Marks</b></label> <input type="text"
						class="form-control"
						name="sub3_min_marks" placeholder="Enter Subject 3 Min Marks">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 3 Marks Obtained</b></label> <input type="text"
						class="form-control"
						name="sub3_marks_obtained" placeholder="Enter Subject - 3 Marks Obtained">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 3 Marks In Words</b></label> <input type="text"
						class="form-control"
						name="sub3_marks_in_words" placeholder="Enter Subject - 3 Marks In Words">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 4 Code</b></label> <input type="text"
						class="form-control"
						name="sub4_code" placeholder="Enter Subject 4 Code">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 4 Name</b></label> <input type="text"
						class="form-control"
						name="sub4_name" placeholder="Enter Subject 4 Name">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 4 Max Marks</b></label> <input type="text"
						class="form-control"
						name="sub4_max_marks" placeholder="Enter Subject 4 Max Marks">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 4 Min Marks</b></label> <input type="text"
						class="form-control"
						name="sub4_min_marks" placeholder="Enter Subject 4 Min Marks">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 4 Marks Obtained</b></label> <input type="text"
						class="form-control"
						name="sub4_marks_obtained" placeholder="Enter Subject - 4 Marks Obtained">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 4 Marks In Words</b></label> <input type="text"
						class="form-control"
						name="sub4_marks_in_words" placeholder="Enter Subject - 4 Marks In Words">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 5 Code</b></label> <input type="text"
						class="form-control"
						name="sub5_code" placeholder="Enter Subject 5 Code">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 5 Name</b></label> <input type="text"
						class="form-control"
						name="sub5_name" placeholder="Enter Subject 5 Name">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 5 Max Marks</b></label> <input type="text"
						class="form-control"
						name="sub5_max_marks" placeholder="Enter Subject 5 Max Marks">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 5 Min Marks</b></label> <input type="text"
						class="form-control"
						name="sub5_min_marks" placeholder="Enter Subject 5 Min Marks">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 5 Marks Obtained</b></label> <input type="text"
						class="form-control"
						name="sub5_marks_obtained" placeholder="Enter Subject - 5 Marks Obtained">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Subject - 5 Marks In Words</b></label> <input type="text"
						class="form-control"
						name="sub5_marks_in_words" placeholder="Enter Subject - 5 Marks In Words">
				</fieldset>
				
				
				<fieldset class="form-group">
					<label><b>Other Subject - 1 Code</b></label> <input type="text"
						class="form-control"
						name="other_sub1_code" placeholder="Enter Other Subject - 1 Code">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Other Subject - 1 Name</b></label> <input type="text"
						class="form-control"
						name="other_sub1_name" placeholder="Enter Other Subject - 1 Name">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Other Subject - 1 Grade</b></label> <input type="text"
						class="form-control"
						name="other_sub1_grades" placeholder="Enter Other Subject - 1 Grade">
				</fieldset>
				
				
				<fieldset class="form-group">
					<label><b>Other Subject - 2 Code</b></label> <input type="text"
						class="form-control"
						name="other_sub2_code" placeholder="Enter Other Subject - 2 Code">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Other Subject - 2 Name</b></label> <input type="text"
						class="form-control"
						name="other_sub2_name" placeholder="Enter Other Subject - 2 Name">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Other Subject - 2 Grade</b></label> <input type="text"
						class="form-control"
						name="other_sub2_grades" placeholder="Enter Other Subject - 2 Grade">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Total Marks</b></label> <input type="text"
						class="form-control"
						name="total_marks" placeholder="Enter Total Marks">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Total Minimum Marks</b></label> <input type="text"
						class="form-control"
						name="total_min_marks" placeholder="Enter Total Minimum Marks">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Total Marks Obtained</b></label> <input type="text"
						class="form-control"
						name="total_marks_obtained" placeholder="Enter Total Marks Obtained">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Total Marks Obtained In Words</b></label> <input type="text"
						class="form-control"
						name="total_marks_obtained_in_words" placeholder="Enter Total Marks Obtained In Words">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Result</b></label> <input type="text"
						class="form-control"
						name="final_result" placeholder="Enter Result">
				</fieldset>
				
				<fieldset class="form-group">
					<label><b>Percentage</b></label> <input type="text"
						class="form-control"
						name="percentage" placeholder="Enter Percentage">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				<button type="submit" class="btn btn-success">Back</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
