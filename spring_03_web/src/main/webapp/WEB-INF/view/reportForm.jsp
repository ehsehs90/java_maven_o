<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>report Form</h2>
	<form action="report.do" method="post" enctype="multipart/form-data">
		과제 파일 : <input type="file" name="file"><br>
		<input type="submit" value="업로드">
	</form>
</body>
</html>