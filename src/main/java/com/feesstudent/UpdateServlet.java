package com.feesstudent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpSession session=request.getSession();
		String name=request.getParameter("username");
		String amt=request.getParameter("amount");
		//String fee=request.getParameter("fees");
		if(request.getParameter("fees").equals("tutionfee")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joey", "root", "707709@");
			    PreparedStatement fetchStmt = con.prepareStatement("select * from feesjoey where uname = ?");
			    fetchStmt.setString(1, name);
			    ResultSet rs = fetchStmt.executeQuery();{
			    	if(rs.next()) {
			    		PreparedStatement smt = con.prepareStatement("update feesjoey set tutionfee=? where uname=?");
			    		//smt.setString(1, fee);
			    		smt.setInt(1, rs.getInt(3)-Integer.valueOf(amt));
			    		smt.setString(2, name);
			    		smt.executeUpdate();
			    		
			    		smt.close();
			    	}
			    }
			    fetchStmt.close();
			    rs.close();
			    con.close();
			    response.sendRedirect("update.jsp");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(request.getParameter("fees").equals("hostelfee")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joey", "root", "707709@");
			    PreparedStatement fetchStmt = con.prepareStatement("select * from feesjoey where uname = ?");
			    fetchStmt.setString(1, name);
			    ResultSet rs = fetchStmt.executeQuery();{
			    	if(rs.next()) {
			    		PreparedStatement smt = con.prepareStatement("update feesjoey set hostelfee=? where uname=?");
			    		//smt.setString(1, fee);
			    		smt.setInt(1, rs.getInt(4)-Integer.valueOf(amt));
			    		smt.setString(2, name);
			    		smt.executeUpdate();
			    		
			    		smt.close();
			    	}
			    }
			    fetchStmt.close();
			    rs.close();
			    con.close();
			    response.sendRedirect("update.jsp");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(request.getParameter("fees").equals("busfee")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joey", "root", "707709@");
			    PreparedStatement fetchStmt = con.prepareStatement("select * from feesjoey where uname = ?");
			    fetchStmt.setString(1, name);
			    ResultSet rs = fetchStmt.executeQuery();{
			    	if(rs.next()) {
			    		PreparedStatement smt = con.prepareStatement("update feesjoey set busfee=? where uname=?");
			    		//smt.setString(1, fee);
			    		smt.setInt(1, rs.getInt(5)-Integer.valueOf(amt));
			    		smt.setString(2, name);
			    		smt.executeUpdate();
			    		
			    		smt.close();
			    	}
			    }
			    fetchStmt.close();
			    rs.close();
			    con.close();
			    response.sendRedirect("update.jsp");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		//doGet(request, response);
		
		}
	}

	


