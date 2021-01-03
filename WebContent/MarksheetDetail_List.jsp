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
	
<style>
	#myInput {
	  background-image: url('https://tse4.mm.bing.net/th?id=OIP.m0WFnkOcl4uQrPwU636sggHaHa&pid=Api&P=0&w=300&h=300');
	  background-position: 10px 10px;
	  background-repeat: no-repeat;
	  width: 100%;
	  font-size: 16px;
	  padding: 12px 20px 12px 40px;
	  border: 1px solid #ddd;
	  margin-bottom: 12px;
	  background-size: cover;
	  background-size: 2% 50%;
	}
</style>	
</head>
<body>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<!-- <h3 class="text-center">MARKSHEET LIST</h3> -->
			<h1 class="text-center" style="background-color: lightgreen; color: black; font-family: Arial, Helvetica, sans-serif;"><b>MARKSHEET LIST</b></h1>
			<hr>
			<div class="container text-left">
				<!-- Add Search Button here -->
				<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">
				<hr>

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add New User</a>
					
				<!-- Added here list button instead header section -->
				<a href="<%=request.getContextPath()%>/list" class="btn btn-success">MARKSHEET DETAIL LIST</a>
						
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>INDEX NO</th>
						<th>DEPT/STREAM NAME</th>
						<th>DIVISION</th>
						<th>ROLL NO</th>
						<th>YEAR</th>
						<th>STUDENT NAME</th>
						
						<th>SUBJECT-1 CODE</th>
						<th>SUBJECT-1 NAME</th>
						<th>SUBJECT-1 MAX MARKS</th>
						<th>SUBJECT-1 MIN MARKS</th>
						<th>SUBJECT-1 MARKS OBTAINED</th>
						<th>SUBJECT-1 MARKS IN WORDS</th>
						
						<th>SUBJECT-2 CODE</th>
						<th>SUBJECT-2 NAME</th>
						<th>SUBJECT-2 MAX MARKS</th>
						<th>SUBJECT-2 MIN MARKS</th>
						<th>SUBJECT-2 MARKS OBTAINED</th>
						<th>SUBJECT-2 MARKS IN WORDS</th>
						
						<th>SUBJECT-3 CODE</th>
						<th>SUBJECT-3 NAME</th>
						<th>SUBJECT-3 MAX MARKS</th>
						<th>SUBJECT-3 MIN MARKS</th>
						<th>SUBJECT-3 MARKS OBTAINED</th>
						<th>SUBJECT-3 MARKS IN WORDS</th>
						
						<th>SUBJECT-4 CODE</th>
						<th>SUBJECT-4 NAME</th>
						<th>SUBJECT-4 MAX MARKS</th>
						<th>SUBJECT-4 MIN MARKS</th>
						<th>SUBJECT-4 MARKS OBTAINED</th>
						<th>SUBJECT-4 MARKS IN WORDS</th>
						
						<th>SUBJECT-5 CODE</th>
						<th>SUBJECT-5 NAME</th>
						<th>SUBJECT-5 MAX MARKS</th>
						<th>SUBJECT-5 MIN MARKS</th>
						<th>SUBJECT-5 MARKS OBTAINED</th>
						<th>SUBJECT-5 MARKS IN WORDS</th>
						
						<th>OTHER SUBJECT-1 CODE</th>
						<th>OTHER SUBJECT-1 NAME</th>
						<th>OTHER SUBJECT-1 GRADES</th>
						
						<th>OTHER SUBJECT-2 CODE</th>
						<th>OTHER SUBJECT-2 NAME</th>
						<th>OTHER SUBJECT-2 GRADES</th>
						
						<th>TOTAL MARKS</th>
						<th>TOTAL MIN MARKS</th>
						<th>TOTAL MARKS OBTAINED</th>
						<th>TOTAL MARKS OBTAINED IN WORDS</th>
						<th>RESULT</th>
						<th>PERCENTAGE</th>
						
						<th>MODIFY OPERATIONS</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="user" items="${listUser}">

						<tr>
						
							<td><c:out value="${user.id}" /></td>
							<td><c:out value="${user.index_no}" /></td>
							<td><c:out value="${user.dept_name}" /></td>
							<td><c:out value="${user.division}" /></td>
							<td><c:out value="${user.rollno}" /></td>
							<td><c:out value="${user.year}" /></td>
							<td><c:out value="${user.stud_name}" /></td>
							
							<td><c:out value="${user.sub1_code}" /></td>
							<td><c:out value="${user.sub1_name}" /></td>
							<td><c:out value="${user.sub1_max_marks}" /></td>
							<td><c:out value="${user.sub1_min_marks}" /></td>
							<td><c:out value="${user.sub1_marks_obtained}" /></td>
							<td><c:out value="${user.sub1_marks_in_words}" /></td>
					
							<td><c:out value="${user.sub2_code}" /></td>
							<td><c:out value="${user.sub2_name}" /></td>
							<td><c:out value="${user.sub2_max_marks}" /></td>
							<td><c:out value="${user.sub2_min_marks}" /></td>
							<td><c:out value="${user.sub2_marks_obtained}" /></td>
							<td><c:out value="${user.sub2_marks_in_words}" /></td>
							
							<td><c:out value="${user.sub3_code}" /></td>
							<td><c:out value="${user.sub3_name}" /></td>
							<td><c:out value="${user.sub3_max_marks}" /></td>
							<td><c:out value="${user.sub3_min_marks}" /></td>
							<td><c:out value="${user.sub3_marks_obtained}" /></td>
							<td><c:out value="${user.sub3_marks_in_words}" /></td>
							
							<td><c:out value="${user.sub4_code}" /></td>
							<td><c:out value="${user.sub4_name}" /></td>
							<td><c:out value="${user.sub4_max_marks}" /></td>
							<td><c:out value="${user.sub4_min_marks}" /></td>
							<td><c:out value="${user.sub4_marks_obtained}" /></td>
							<td><c:out value="${user.sub4_marks_in_words}" /></td>
							
							<td><c:out value="${user.sub5_code}" /></td>
							<td><c:out value="${user.sub5_name}" /></td>
							<td><c:out value="${user.sub5_max_marks}" /></td>
							<td><c:out value="${user.sub5_min_marks}" /></td>
							<td><c:out value="${user.sub5_marks_obtained}" /></td>
							<td><c:out value="${user.sub5_marks_in_words}" /></td>
							
							<td><c:out value="${user.other_sub1_code}" /></td>
							<td><c:out value="${user.other_sub1_name}" /></td>
							<td><c:out value="${user.other_sub1_grades}" /></td>
					
							<td><c:out value="${user.other_sub2_code}" /></td>
							<td><c:out value="${user.other_sub2_name}" /></td>
							<td><c:out value="${user.other_sub2_grades}" /></td>
					
							<td><c:out value="${user.total_marks}" /></td>
							<td><c:out value="${user.total_min_marks}" /></td>
							<td><c:out value="${user.total_marks_obtained}" /></td>
							<td><c:out value="${user.total_marks_obtained_in_words}" /></td>
							<td><c:out value="${user.final_result}" /></td>
							<td><c:out value="${user.percentage}" /></td>
							
							<td><a href="edit?id=<c:out value='${user.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${user.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
	
<script>
	//Search code
	function myFunction() {
		var input, filter, table, tr, td, i, txtValue;
		input = document.getElementById("myInput");
		filter = input.value.toUpperCase();
		table = document.getElementById("myTable");
		tr = table.getElementsByTagName("tr");
		for (i = 0; i < tr.length; i++) {
			td = tr[i].getElementsByTagName("td")[1];
			if (td) {
				txtValue = td.textContent || td.innerText;
				if (txtValue.toUpperCase().indexOf(filter) > -1) {
					tr[i].style.display = "";
				} else {
					tr[i].style.display = "none";
				}
			}       
		}			
	}
</script>	
</body>
</html>					
