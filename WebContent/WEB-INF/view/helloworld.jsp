<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		Hello World of Spring!
		
		<br /> <br />
		
		Student name : ${param.studentName}
		
		<br /> <br />
		
		The message: ${message}

		<hr>
		<a href="/spring-mvc-demo">go to homepage...</a>

	</body>
</html>