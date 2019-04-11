<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<i>Fill out the form. Asterisk (*) means required.</i>
	<br>
	<br>
	<form:form action="processForm" modelAttribute="customer">
   First Name: <form:input path="firstName" />
		<br>
		<br>
   Last Name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br><br>
		Free Passes: <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error"/>
		<br>
		<br>
		
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>