<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin</title>
<link rel="stylesheet" type="text/css" href="admin.css">
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(session.getAttribute("suname")==null){
	response.sendRedirect("login1.jsp");
}
%>


<form>
    <button id="button1" name="action" value="action1" formaction="update.jsp">Update Fees of the Student</button>
    <button id="button2" name="action" value="action2" formaction="check.jsp">Check Fees of the Student</button>
    <button id="button3" name="action" value="action3" formaction="ListServlet">List of Unpaid</button>
  </form>
</body>
</html>