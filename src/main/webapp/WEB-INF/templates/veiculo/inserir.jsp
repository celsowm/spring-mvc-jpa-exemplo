<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/template/header/"></c:import>

<h1>Novo Veículo</h1>

<form:form action="/veiculo/inserirAction/" method="post" modelAttribute="audio">
    <label for="placa">Placa</label>
    <form:input path="placa"/>
    <label for="ano">Ano</label>
    <form:input path="ano"/>
    <form:hidden path="proprietario.id"/>
    <form:button>Cadastrar</form:button>
</form:form>
<c:import url="/template/footer/"></c:import>