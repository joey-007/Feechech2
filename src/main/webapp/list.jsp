<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Unpaid List</title>
<link rel="stylesheet" type="text/css" href="list.css">
</head>
<body>
    <h1><b>Names List</b></h1>
    <div class="center-container">
        <ul>
            <% 
            ArrayList<String> myList = (ArrayList<String>) request.getAttribute("myList");
            if (myList != null) {
                for (String name : myList) { %>
                    <li><%= name %></li>
            <%   }
            } else { %>
                <li>No names found.</li>
            <% } %>
        </ul>
    </div>
</body>
</html>