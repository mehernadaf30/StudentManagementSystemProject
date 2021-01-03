<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ page contentType="text/html; charset=UTF-8" %> --%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%-- <jsp:useBean id="msg" class="net.studentmanagementsystem.model.Message" scope="session"/> --%>

<%
	net.studentmanagementsystem.model.Message m = new net.studentmanagementsystem.model.Message();
	String currentPassword=request.getParameter("old_psw");
	String Newpass=request.getParameter("new_psw");
	String conpass=request.getParameter("confirm_new_psw");
	String connurl = "jdbc:mysql://localhost/test1";
	Connection con=null;
	String pass="";
	int id=0;
	String message;
	
	try{
	if (Newpass.equals("") || conpass.equals(""))    {
            
			message = "New Password and Comfirm password , both are required.";
			request.setAttribute("results", message);
			request.getRequestDispatcher("ForgotPasswordPage.jsp").forward(request, response);
			
			return;    

    }	else if (!Newpass.equals(conpass))	{
			
			message = "Your New password and confirm password does not match.";
			request.setAttribute("results", message);
			response.sendRedirect("ForgotPasswordPage.jsp");
			return;
    }
	
	//try{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(connurl, "root", "");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from stud_registration where password='"+currentPassword+"'");
		while(rs.next()){
			id=rs.getInt("id");
			pass=rs.getString("password");
		} 
		System.out.println(id+ " "+pass);
		if(pass.equals(currentPassword)){
			Statement st1=con.createStatement();
			int i=st1.executeUpdate("update stud_registration set password='"+Newpass+"', confirmpwd='"+Newpass+"'  where id='"+id+"'");
			
			if (i>0) {
				message = "Password changed successfully";
				//m.setMessage(message);
				request.setAttribute("results", message);
				out.println("Password changed successfully");
			}
		st1.close();
		con.close();	
	}
	else{
		message = "Invalid Current Password";
		//m.setMessage(message);
		request.setAttribute("results", message);
		out.println("Invalid Current Password");
	}
	}
	catch(Exception e){
	out.println(e);
	}
%>

