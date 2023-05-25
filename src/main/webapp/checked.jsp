<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check Fee</title>
<link rel="stylesheet" type="text/css" href="checked.css">
</head>
<body>
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
</body>
</html>