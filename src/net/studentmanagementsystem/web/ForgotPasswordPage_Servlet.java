package net.studentmanagementsystem.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.sql.*;
import java.io.*;
import java.sql.DriverManager;

import net.studentmanagementsystem.model.Message;

//added here
import net.studentmanagementsystem.web.LoginPage_Servlet;

/*@WebServlet("/ForgotPasswordPage_Servlet")*/
public class ForgotPasswordPage_Servlet extends HttpServlet {
	   private static final long serialVersionUID = 1L;
	   public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	   {
	        doPost(req,res);
	   }

  public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        try
       {
        String url = "jdbc:mysql://localhost:8080/test1";
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String pass = "";

        HttpSession session=req.getSession();

        String pasword=(String)session.getAttribute("uname");  
        String username=(String)session.getAttribute("psw");
		
		//added here
		String userName = req.getParameter("uname");
	    String password = req.getParameter("psw");
	    
	    String emailid = req.getParameter("emailid");

        String oldpwd=req.getParameter("old_psw");

        String newpswd=req.getParameter("new_psw");

        String cpswd=req.getParameter("confirm_new_psw");

        Message msg=new Message();

        if (newpswd.equals("") || cpswd.equals(""))

            {
                    msg.setMessage("New Password and Comfirm password , both are required.");
                    req.setAttribute("reg", msg);
					getServletContext().getRequestDispatcher("ForgotPasswordPage.jsp").forward(req,res);
					return;    

            }	else if (!newpswd.equals(cpswd))	{
					msg.setMessage("Your New password and confirm password does not match.");
                    req.setAttribute("reg", msg);
					getServletContext().getRequestDispatcher("ForgotPasswordPage.jsp").forward(req,res);
					return;
                }
        try
        {    
            Class.forName(driver).newInstance();
            Connection con=DriverManager.getConnection(url,user,pass);

                try
                {
                    PreparedStatement ps=con.prepareStatement("update stud_registration set password= ? where loginid=? and password= ?");
																
                    try
                    {
                        ps.setString(1,newpswd);
                        ps.setString(2, emailid);
						ps.setString(3, oldpwd);
                        int i= ps.executeUpdate();

						 if(i>0)
						 {
							msg.setMessage("Password doesnot Change..Try Again…");
							req.setAttribute("reg", msg);
							getServletContext().getRequestDispatcher("ForgotPasswordPage.jsp").forward(req,res);
							return;
						 }
						else
						{
							msg.setMessage("Your password Change Successfully….");
							req.setAttribute("reg", msg);
							/*getServletContext().getRequestDispatcher("ForgotPasswordPage.jsp").forward(req,res);*/
							getServletContext().getRequestDispatcher("LoginPage.jsp").forward(req,res);
							return;
						}
                    }
                    finally
                    {
                        ps.close();
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