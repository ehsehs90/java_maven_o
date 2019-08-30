<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>파일 업로드 완료</h2>
	<a href="${pageContext.request.contextPath}/index.jsp">Home</a>
	<img src="${pageContext.request.contextPath}/upload/${imgName}">
	<input type="submit" value="delete">
</body>
</html>