<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Person</title>
		<style>
			.error{	color: red }
		</style>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="person">
			First Name: <form:input type="text" path="firstName" />
			Last Name:(*) <form:input type="text" path="lastName" />
			<form:errors path="lastName" cssClass="error"></form:errors>
			<form:select path="country">
				<form:option value="India" label="IND"/>
				<form:option value="United States of America" label="USA"/>
				<form:option value="Australia" label="AUS"/>
				<form:option value="New Zealand" label="NZ"/>
			</form:select>
			Register Number:<form:input path="registerNumber"/>
			<form:errors path="registerNumber" cssClass="error" />
			Post Code:<form:input type="text" path="postCode" />
			<form:errors path="postCode" cssClass="error"></form:errors>
			Age:<form:input path="age"/>
			<form:errors path="age" cssClass="error"></form:errors>
			Gender:
			<form:radiobutton path="gender" label="Male" value="Male"/>
			<form:radiobutton path="gender" label="Female" value="Female"/>
			
			Java<form:checkbox path="skills" value="Java"/>
			Angular<form:checkbox path="skills" value="Angular"/>
			React<form:checkbox path="skills" value="React"/>
			<input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>