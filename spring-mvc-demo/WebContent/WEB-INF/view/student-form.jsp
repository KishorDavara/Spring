<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
   First Name: <form:input path="firstName" />
		<br>
		<br>
   Last Name: <form:input path="lastName" />
		<br>
		<br>
   Country:
   <form:select path="country">
			<%-- <form:option value="Brazil" label="Brazil" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />
			<form:option value="India" label="India" /> --%>
			<%-- <form:options items="${student.countryOptions}"/> --%>
			<form:options items="${theCountryOptions}" />
		</form:select>
		<br>
		<br>
		<label>Favorite Language:</label>
		<%-- <form:radiobutton path="favoriteLanguage" value="Java" />Java 
		<form:radiobutton path="favoriteLanguage" value="C#" />C# 
		<form:radiobutton path="favoriteLanguage" value="Python" />Python 
		<form:radiobutton path="favoriteLanguage" value="Go" />Go --%>
		<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions }"/>
		<br>
		<br>
		<form:checkbox path="operatingSystems" value="Linux" />Linux 
		<form:checkbox path="operatingSystems" value="Mac" />Mac 
		<form:checkbox path="operatingSystems" value="Windows" />Windows
	<br>
	<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>