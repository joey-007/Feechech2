<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="update.css">
</head>
<body>
<form action="UpdateServlet" method="post">
    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>
  
    <label for="amount"><b>Amount</b></label>
    <input type="text" placeholder="Enter Amount" name="amount" required>
    
    <label for="fees"><b>Choose a Fees type</b></label>
  <select id="fees" name="fees">
    <option value="tutionfee">Tution Fee</option>
    <option value="hostelfee">Hostel Fee</option>
    <option value="busfee">Bus Fee</option>
  </select>
  
    <button type="submit">Update</button>
    </form>
</body>
</html>