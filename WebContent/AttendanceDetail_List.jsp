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

<%-- <form action="<%=request.getContextPath()%>/attendanceDetailPage_Servlet"  method="get"> --%>
<!-- <form action="attendanceDetailPage_Servlet"  method="post"> -->
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">Attendance List</h3>
			<hr>
			<div class="container text-left">

				<!-- Add Search Button here -->
				<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">
				<hr>
				
				<%-- <a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add New User</a> --%>
				<%-- <a href="<%=request.getContextPath()%>/attendanceDetailPage_Servlet/new" class="btn btn-success">Add New User</a> --%>
				<!-- <a href="AttendanceDetailPage_Servlet/new" class="btn btn-success">Add New User</a> -->
				<%-- <a href="<%=request.getContextPath()%>/attendanceDetailPage_Servlet/new" class="btn btn-success">Add New User</a> --%>
				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add New User</a>
				
				
					
				<!-- Added here list button instead header section -->
				<%-- <a href="<%=request.getContextPath()%>/list" class="btn btn-success">ATTENDANCE LIST</a> --%>
				<%-- <a href="<%=request.getContextPath()%>/attendanceDetailPage_Servlet/list" class="btn btn-success">ATTENDANCE LIST</a> --%>
				<%-- <a href="<%=request.getContextPath()%>/attendanceDetailPage_Servlet/list" class="btn btn-success">ATTENDANCE LIST</a> --%>
				<a href="<%=request.getContextPath()%>/list" class="btn btn-success">ATTENDANCE LIST</a>
				
						
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>STUDENT NAME</th>
						<th>SUBJECT NAME</th>
						<th>LECTURE NAME</th>
						<th>DOB</th>
						<th>STATUS</th>
						<th>MODIFY OPERATIONS</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="user" items="${listUser}">

						<tr>
							<td><c:out value="${user.id}" /></td>
							<td><c:out value="${user.stud_name}" /></td>
							<td><c:out value="${user.sub_name}" /></td>
							<td><c:out value="${user.lec_name}" /></td>
							<td><c:out value="${user.dob}" /></td>
							<td><c:out value="${user.status}" /></td>
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
	<!-- </form> -->
<!-- </form> -->
	
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
