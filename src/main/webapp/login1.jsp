<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Login Page</title>
  <link rel="stylesheet" type="text/css" href="login1.css">
</head>
<body>
  <div class="container">
  <form action="Login">
    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>
  
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
  
    <button type="submit">Login</button>
    </form>
  </div>
</body>
</html>