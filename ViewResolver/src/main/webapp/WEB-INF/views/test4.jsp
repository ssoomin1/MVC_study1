<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 모든 정보는 request 영역에 자동저장된다. 영역이 session도 있고 그렇기 때문에 영역을 보기 위해서
requestScope으로 생략하지 않기도 한다.  -->
	<h1>Model2</h1>
	<h3>a: ${requestScope.a}</h3>
	<h3>b: ${requestScope.b}</h3>
</body>
</html>