<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Student Confirmation</title>
	</head>
	
	<body>
		The student is confirmed: ${student.firstName} ${student.lastName}
		<br/> <br/>
		Department: ${student.department} - ${selectedDepartment }
		<br/> <br/>
		Country: ${student.country}  -  ${student.countryOptions.get(student.country)} 		
		<br/> <br/>
		Favorite Language: ${student.favoriteLanguage } 
		<br/> <br/>
		Operating Systems:
		<c:forEach var="temp" items="${student.operatingSystems }">
			<li> ${temp } </li>
		</c:forEach>
	</body>
</html>