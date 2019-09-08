<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/template/header/"></c:import>
    <h1>Pessoas</h1>
    <a href="/pessoa/inserir">Incluir nova pessoa</a>
    <br />
    <br />
    <table border>
        <tr><th>Nome</th><th>Idade</th><th>Habilitação</th><th>Veículos</th><th>Ações</th></tr>
            <c:forEach items="${pessoas}" var="pessoa">
        <tr>
            <td>${pessoa.getNome()}</td>
            <td>${pessoa.getIdade()}</td>
            <td>
                ${(pessoa.getHabilitacao() != null) 
                  ? pessoa.getHabilitacao().getNumero() 
                  : "-"}
            </td>
            <td>
                <a href="/veiculo/inserir/${pessoa.getId()}">Veículos</a>
            </td>
            <td> 
                <a href="/pessoa/alterar/${pessoa.getId()}">Alterar</a>
                &nbsp;
                <a href="#" 
                   onclick="remover('Deseja remover?', 'pessoa/remover/${pessoa.getId()}')">Remover</a>
            </td>
        </tr>
    </c:forEach>  
</table>
<c:import url="/template/footer/"></c:import>
