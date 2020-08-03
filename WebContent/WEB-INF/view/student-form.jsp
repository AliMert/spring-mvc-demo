<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Student Registration Form</title>
	</head>
	
	
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName" />
			<br> <br>
			
			Last Name: <form:input path="lastName"	/>
			<br> <br>
		
			Department: 
			<form:select path="department" >
				<form:options items="${ departmentOptions }"/>	
			</form:select>
			
			<br> <br>	
			Country: 
			<form:select path="country">
				<form:options items="${ student.countryOptions }"/>
			</form:select>
			
			<br> <br>
			Favorite Language:
			<form:radiobuttons path="favoriteLanguage" items="${ favoriteLanguageOptions }"/>
			
			<%-- 			
			<form:radiobutton path="favoriteLanguage" label="Java" value="Java" />
			<form:radiobutton path="favoriteLanguage" label="C#" value="C#" />
			<form:radiobutton path="favoriteLanguage" label="PHP" value="PHP" />
			<form:radiobutton path="favoriteLanguage" label="Ruby" value="Ruby" /> 
			--%>
			<br> <br>
			
			Operating Systems:
			<form:checkbox path="operatingSystems" label="Linux" value="Linux"/>
			<form:checkbox path="operatingSystems" label="Mac OS" value="Mac OS"/>
			<form:checkbox path="operatingSystems" label="MS Window" value="MS Window"/>
			<br> <br>
			<input type="submit" value="submit" />
		</form:form>	
	</body>
</html>