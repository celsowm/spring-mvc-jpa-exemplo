<%-- 
    Document   : visualizar
    Created on : 18 de ago de 2019, 17:46:41
    Author     : celso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        ${pessoa.getNome()}
        <br/>
        ${pessoa.getHabilitacao().getCategoria()}
    </body>
</html>
