<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>

	<h3>P�gina de Sucesso</h3>
	Bem vindo ${sessionScope.username} !
	<br>
	<a href="${pageContext.request.contextPath}/login/logout">Logout</a>

</body>
</html>