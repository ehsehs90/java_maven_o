<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>click the menu</h2>
	<ul>
		<c:if test="${empty User }">
			<li><a href="${pageContext.request.contextPath}/login.do">로그인</a></li>
		</c:if>
		
		<c:if test="${!empty User }">
			<li><a href="${pageContext.request.contextPath}/logout.do">로그아웃</a></li>
			<li><a href="${pageContext.request.contextPath}/report.do">이미지등록</a></li>
			<li><a href="${pageContext.request.contextPath}/user/list.do">유저목록</a></li>
		</c:if>
		
		<li><a href="${pageContext.request.contextPath}/user/add.do">유저등록</a></li>
	</ul>
	
</body>
</html>