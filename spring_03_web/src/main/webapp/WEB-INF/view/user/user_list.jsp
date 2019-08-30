<%@ page   contentType="text/html; charset=utf-8"  isELIgnored="false"   %>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- <link type="text/css" rel="stylesheet" href="../css/table.css"> -->
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/table.css">

<title>user_list.jsp(사용자 관리)</title> 
<h4>사용자 목록</h4>
로그인정보 : ${User.username}
<a href="${pageContext.request.contextPath}/index.jsp">Home</a>
<a href="${pageContext.request.contextPath}/logout.do">로그아웃</a>


<h3>회원검색</h3>
<form action="${pageContext.request.contextPath}/user/search.do" method="post">	
	<table>
		<tr>
			<td>
				<select name="searchCondition">
					<option value="userid">아이디</option>
					<option value="username">이름</option>
					<option value="eamil">이메일</option>
				</select>
			</td>
			<td>
				<input type="text" name="searchKeyword">
			</td>
			<td>
				<input type="submit" name="search">
			</td>
		</tr>
	</table>
</form>
<hr>
<table border=1>
  <tr>
    <th>userid</th>
    <th>username</th>
    <th>email</th>
    <th>address</th>
	<th>phone</th>
  </tr>
  

<form name="f" method="get" action="${pageContext.request.contextPath}/user/add.do">
<!--${pageContext.request.contextPath} : 요청이 들어온 경로를 반환하는 EL문  -->

	<!-- 사용자 리스트를 클라이언트에게 보여주기 위하여 출력. -->
 	<c:forEach var="user" items="${users}" >
	  	<tr>
		<td >${user.userid}	</td>
		<td >
			<a href="${pageContext.request.contextPath}/user/view.do?userid=${user.userid}">
				${user.username}
			</a>
		</td>
		<td >${user.email}</td>
		<td >${user.address}</td>
		<td >${user.phone}</td>
		
		</tr>
 	 </c:forEach>
</table>
<table>
	<tr>
		<td><input type="submit" value="사용자 추가"/>	</td>
	</tr>
</table>		
</form>
