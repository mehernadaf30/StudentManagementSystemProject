package net.studentmanagementsystem.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.sql.*;
import java.io.*;
import java.sql.DriverManager;

import net.studentmanagementsystem.model.Message;

/**
 * Servlet implementation class changePassword_Servlet
 */
@WebServlet("/changePassword_Servlet")
public class changePassword_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public changePassword_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try
	       {
	        String currentPassword=request.getParameter("old_psw");
			String Newpass=request.getParameter("new_psw");
			String conpass=request.getParameter("confirm_new_psw");
			String connurl = "jdbc:mysql://localhost/test1";
			Connection con=null;
			String pass="";
			int id=0;
			//Message msg = new Message();
			String msg;
			//PrintWriter out = response.getWriter();

	        if (Newpass.equals("") || conpass.equals(""))

	            {
	                    
						msg = "New Password and Comfirm password , both are required. Click FORGOT PASSWORD BUTTON and try changing password again.....";
						 //request.setAttribute("reg", msg);
						 
						 HttpSession session = request.getSession();
				         session.setAttribute("reg", msg);
				         request.setAttribute("reg", msg);
				 
				         request.getRequestDispatcher("changePassword_Success.jsp").forward(request, response);
							
				         return;

	            }	else if (!Newpass.equals(conpass))	{
						
						msg = "Your New password and confirm password does not match.. Click FORGOT PASSWORD BUTTON and try changing password again.....";
						 //request.setAttribute("reg", msg);
						 
						 HttpSession session = request.getSession();
				         session.setAttribute("reg", msg);
				         request.setAttribute("reg", msg);
				 
				         request.getRequestDispatcher("changePassword_Success.jsp").forward(request, response);
							
				         return;
	                }
	        try
	        {    
	            Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(connurl, "root", "");

	                try
	                {
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
						
							//PreparedStatement ps=con.prepareStatement("update stud_registration set password= ? where loginid=? and password= ?");
																	
							 if(i>0)
							 {
								 msg = "Your password Change Successfully….";
								 //request.setAttribute("reg", msg);
								 
								 HttpSession session = request.getSession();
						         session.setAttribute("reg", msg);
						         request.setAttribute("reg", msg);
						 
						         request.getRequestDispatcher("changePassword_Success.jsp").forward(request, response);
									
						         return;
								 
							 }
							else
							{

								msg = "Password doesnot Change..Try Again… Click FORGOT PASSWORD BUTTON and try changing password again.....";
								 //request.setAttribute("reg", msg);
								 
								 HttpSession session = request.getSession();
						         session.setAttribute("reg", msg);
						         request.setAttribute("reg", msg);
						 
						         request.getRequestDispatcher("changePassword_Success.jsp").forward(request, response);
									
						         return;
							}
	                }
	                }
	                finally
	                {
	                    con.close();
	                }   
	            }
	        catch(Exception e)
	        {
	            e.getMessage();
	        }
	       }
	    catch(Exception e)
	    {
	        e.getMessage();
	    }
	   }
}
