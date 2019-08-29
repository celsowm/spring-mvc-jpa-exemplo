<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/template/header/"></c:import>

<h1>Novo Audio</h1>

<form:form action="/audio/inserirAction/" method="post" modelAttribute="audio">
    <label for="titulo">Título</label>
    <form:input path="titulo"/>
    <label for="ano">Ano</label>
    <form:input path="ano"/>
    <label for="duracao">Duração</label>
    <form:input path="duracao"/>
    <label for="duracao">Album</label>
    <form:input path="album"/>
    <form:button>Cadastrar</form:button>
</form:form>
<c:import url="/template/footer/"></c:import>