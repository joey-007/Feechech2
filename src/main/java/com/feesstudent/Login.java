package com.feesstudent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		
		HttpSession session=request.getSession();
		session.setAttribute("suname", uname);
		session.setAttribute("spass",pass);
		if(uname.equals("admin") && pass.equals("320126511089")) {
			response.sendRedirect("admin.jsp");
		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joey", "root", "707709@");
		    Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery("select * from feesjoey where uname='"+uname+"' and pass='"+pass+"'");
		    if(rs.next()) {
		    	session.setAttribute("tfee", rs.getInt(3));
		    	session.setAttribute("hfee", rs.getInt(4));
		    	session.setAttribute("bfee", rs.getInt(5));
		    	response.sendRedirect("welcome.jsp");
		    	rs.close();
				st.close();
				con.close();
		    }
		    
		    else {
		    	response.sendRedirect("login1.jsp");
		    }
		       }
			catch(Exception e) {
				e.printStackTrace();
			}
		
		
		
	}

	

}
