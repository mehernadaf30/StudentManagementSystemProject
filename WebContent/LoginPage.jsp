<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

img {
  border-radius: 8px;
}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}

h1 {
	font-family: Arial, Helvetica, sans-serif;
	background-color: LightGray;
	color: green;
}

</style>
</head>
<body>

<h1>Login Form</h1>

<!-- <form action="/action_page.php" method="post"> -->
<form name="form" action="<%=request.getContextPath()%>/LoginServlet" method="post">
  <div class="imgcontainer">
    <img src="https://3.imimg.com/data3/MU/DM/MY-9763253/student-management-system-500x500.png" alt="Avatar" width="130" height="150">
  </div>

  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" id="uname" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="psw" required>
        
    <button type="submit">LOGIN</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="ForgotPasswordPage.jsp">password?</a></span>
  </div>
  <div class="container" style="background-color:#f1f1f1">
  	<span class="newUser">New User? <a href="RegistrationForm_AddUserPage.jsp">Create an account.</a></span>
  </div>
  
</form>

</body>
</html>