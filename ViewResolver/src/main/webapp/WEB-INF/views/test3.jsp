<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사용자 정보</h1>
	<h3>id: ${requestScope.uid}</h3>
	<h3>pw: ${requestScope.upw}</h3>
</body>
</html>