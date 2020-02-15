<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Home</title>
	</head>
	<body>
		<p>Welcome Aboard</p>
		<p>Your username is ${person.firstName}-${person.lastName}</p>
		<p>Register Number ${person.registerNumber}</p>
		<p>Age: ${person.age}</p>
		<p>Country: ${person.country} </p>
		<p>Post Code: ${person.postCode}</p>
		<p>Gender : ${person.gender}</p>
		<p>Skills:</p>
		<ul>
			<c:forEach var="temp" items="${person.skills}">
				<li>${temp}</li>
			</c:forEach> 
		</ul>
	</body>
</html>