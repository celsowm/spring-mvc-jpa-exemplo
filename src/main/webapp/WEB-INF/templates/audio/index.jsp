<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/template/header/"></c:import>
<c:forEach items="${audios}" var="audio">
    ${audio.getTitulo()}<br/>
</c:forEach>
<c:import url="/template/footer/"></c:import>
