<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fees Section</title>
<link rel="stylesheet" type="text/css" href="welcome.css">
</head>
<body>

<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(session.getAttribute("suname")==null){
	response.sendRedirect("login1.jsp");
}
//if(session.getAttribute("suname").equals("admin") && session.getAttribute("spass").equals("320126511089")){
	//response.sendRedirect("Admin.java");
	//}
%>

<header>
    <div class="username">
      <p>Welcome, <%out.print(session.getAttribute("suname")); %></p> <!-- Replace with the username -->
    </div>
  </header>
  
  <div class="container">
    <table>
      <tr>
        <th>Tution Fee</th>
        <th>Hostel Fee</th>
        <th>Bus Fee</th>
      </tr>
      <tr>
        <td><%out.print(session.getAttribute("tfee"));%></td>
        <td><%out.print(session.getAttribute("hfee"));%></td>
        <td><%out.print(session.getAttribute("bfee"));%></td>
      </tr>
      
    </table>
  </div>
  <div class="logout-button">
  <form action="logout">
    <button>Logout</button>
    </form>
  </div>
</body>
</html>