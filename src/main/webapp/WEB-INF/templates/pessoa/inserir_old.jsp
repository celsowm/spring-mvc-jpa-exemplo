<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastrar pessoa</h1>
        <form:form action="/pessoa/inserirAction/" method="post" modelAttribute="pessoa">
            <label for="nome">Nome</label>
            <form:input path="nome"/>
            <label for="idade">Idade</label>
            <form:input path="idade"/>
            <form:button>Cadastrar</form:button>
        </form:form>
    </body>
</html>
