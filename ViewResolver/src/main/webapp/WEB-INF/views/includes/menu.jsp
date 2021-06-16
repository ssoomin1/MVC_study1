<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/test2?a=1000&b=2000">param으로 받기</a><br>
	<a href="/test2">Model로 받기</a> <br>
	<a href="/test3">@ModelAttribute & Model</a> <br>
	<a href="/test4">Model로 받기2</a> <br>
	<!-- ModelAndView : 값을 세팅하는(Model)기능 + view 이름을 지정(view) -->
	<a href="/test5">ModelAndView 로 받기</a>
	<br><a href="/test6?data1=100&data2=200&data3=300">Model</a>
</body>
</html>