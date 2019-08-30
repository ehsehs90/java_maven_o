<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>404 error</title>
</head>
<body>
	<% response.setStatus(200); %>
	<h3>unexpected path</h3>
	<p><%= exception %></P>
</body>
</html>