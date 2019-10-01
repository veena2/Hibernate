<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<%@ include file="header.html" %>

<form action="checkuser" method="get">
<p>username: <input type="text" name="username" placeholder="Enter username"></p>
<p>Password: <input type="password" name="passwd" placeholder="Enter Password"></p>
<p><input type="submit" value="Sign In"></p>

</form>
<%@ include file="footer.html" %>



</body>
</html>