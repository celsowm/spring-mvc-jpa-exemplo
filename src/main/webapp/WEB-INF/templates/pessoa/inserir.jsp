<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <h1>Cadastrar pessoa</h1>
        <form:form action="/pessoa/inserirAction/" method="post" modelAttribute="pessoa">
            <label for="nome">Nome</label>
            <form:input path="nome"/>
            <label for="idade">Idade</label>
            <form:input path="idade"/>
            <fieldset>
                <legend>Habilitação</legend>
                <label>Número</label>
                <form:input path="habilitacao.numero"/>
                <label>Categoria</label>
                <form:input path="habilitacao.categoria"/>
            </fieldset>
            <form:button>Cadastrar</form:button>
        </form:form>
    