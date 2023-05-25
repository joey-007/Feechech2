package com.feesstudent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> list=new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joey", "root", "707709@");
		    Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery("select uname from feesjoey where tutionfee>0 or hostelfee>0 or busfee>0");
		    while(rs.next()) {
		    	list.add(rs.getString("uname").toString());
		    }
		    rs.close();
		    st.close();
		    con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("myList",list);
	    RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
	    dispatcher.forward(request, response);
	}


}
