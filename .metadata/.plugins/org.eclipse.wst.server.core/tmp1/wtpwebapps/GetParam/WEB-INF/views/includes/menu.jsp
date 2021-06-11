<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
<br/>
<!-- css는 정적파일 : resource에 넣어라 -->
<a href="/test1?a=100&b=200&c=300">Get Test1 </a> &nbsp;&nbsp;
<a href="/test2?a=1&b=200&c=300&c=400&c=500">Get Test2 </a> &nbsp;&nbsp;
<a href="/test3?a=0915&b=0116&b=1219&c=0428&d=0825">Get Test3</a> &nbsp;&nbsp;
<a href="/test4">test4 Post</a>&nbsp;&nbsp;
<a href="/test5/1000/2000/3000">@PathVariable</a> &nbsp;&nbsp; <!-- 폴더가 아니라 나는 값으로 보내고 싶어 => PathVariable 사용-->
<!-- 이러한 URL 방식은 semantic URL -->
<a href="/test6?a=100&b=200&c=300&c=400&c=500">@RequestParam</a> &nbsp;&nbsp; 
<a href="/test6?a=100&b=200&c=300&c=400&c=500">Object</a> &nbsp;&nbsp; 
</body>
</html>