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
 * Servlet implementation class CheckServlet
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String name=request.getParameter("username");
	        HttpSession session=request.getSession();
			session.setAttribute("suname", name);
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joey", "root", "707709@");
			    Statement st=con.createStatement();
			    ResultSet rs=st.executeQuery("select * from feesjoey where uname='"+name+"' ");
			    if(rs.next()) {
			    	session.setAttribute("tfee", rs.getInt(3));
			    	session.setAttribute("hfee", rs.getInt(4));
			    	session.setAttribute("bfee", rs.getInt(5));
			    	
			    	rs.close();
					st.close();
					con.close();
					response.sendRedirect("checked.jsp");
			    }
			    
			    else {
			    	response.sendRedirect("check.jsp");
			    }
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
	}

}
