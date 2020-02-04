<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Person</title>
	</head>
	<body>
		<form:form action="home" modelAttribute="person">
			First Name: <form:input type="text" path="firstName" />
			Last Name: <form:input type="text" path="lastName" />
			<form:select path="country">
				<form:option value="India" label="IND"/>
				<form:option value="United States of America" label="USA"/>
				<form:option value="Australia" label="AUS"/>
				<form:option value="New Zealand" label="NZ"/>
			</form:select>
			
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