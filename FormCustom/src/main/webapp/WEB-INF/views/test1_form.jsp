<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/test3" method="post">
	<h1>TEST_FORM</h1>
	이름: <input type="text" name="user_name"> <br>
	아이디: <input type="text" name="user_id"> <br>
	비밀번호 <input type="password" name="user_pw"> <br>
	우편번호 <input type="text" name="user_postcode">  <br>
	주소: <input type="text" name="user_addr1">  <br>
	상세주소: <input type="text" name="user_addr2"> <br>
	<button type="submit" name="loginBtn">입력</button>
	</form>
</body>
</html>