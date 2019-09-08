<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/template/header/"></c:import>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body>
            <h1>Veiculos</h1>
            <a href="/veiculo/inserir/${pessoa_id}">Inserir novo Veículo</a>
            <br/>
            <table border>
                <tr><th>Ano</th><th>Placa</th></tr>
                    <c:forEach items="${veiculos}" var="veiculo">
                    <tr>
                        <td>{veiculo.getAno()}</td>
                        <td>{veiculo.getPlaca()}</td>
                    </tr>
            </c:forEach>
        </table>
    </body>
</html>
