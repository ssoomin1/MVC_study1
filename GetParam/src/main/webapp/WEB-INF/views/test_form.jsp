<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 아까는 GET 방식이고 지금은 POST방식이라 달라도 상관없다.  -->
	<form method="post" action="/test4">
		아이디 : <input type="text" name="uid">
		비밀번호 : <input type="password" name="upw" >
		<button type="submit">Login</button>
	</form>
</body>
</html>