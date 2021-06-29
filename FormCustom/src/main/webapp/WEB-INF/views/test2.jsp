<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="loiginDTO" action="/test2" />
	이름:<form:input path="user_name" /><br/>
	아이디: <form:input path="user_id"/> <br>
	비밀번호: <form:input path="user_pw" /> <br>
	우편번호: <form:input path="user_postcode" />  <br>
	주소: <form:input path="user_addr1" />  <br>
	상세주소: <form:input path="user_addr2"/> <br>
</body>
</html>