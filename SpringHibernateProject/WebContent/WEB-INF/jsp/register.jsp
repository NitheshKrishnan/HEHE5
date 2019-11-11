<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="signup" modelAttribute="employee">

	<form:input path="empId" placeholder="Enter Emp Id"/><br>
	<form:input path="password" placeholder="Enter Password"/><br>
	<form:input path="firstName" placeholder="Enter First Name"/><br>
	<form:input path="lastName" placeholder="Enter Last Name"/><br>
	<form:input path="gender" placeholder="Enter Gender"/><br>
	<form:input path="salary" placeholder="Enter Salary"/><br>
	<form:input path="experience" placeholder="Enter Experience"/><br>
	<input type="submit" value="SignUp">
	
</form:form>

</body>
</html>