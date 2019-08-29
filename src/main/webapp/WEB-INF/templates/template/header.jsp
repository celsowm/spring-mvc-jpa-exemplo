<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Minha App</title>
        <script>
        function remover(mensagem, url){
            if(confirm(mensagem)){
                window.location = url;
            }
        }    
        </script>
    </head>
    <body>
        <c:import url="/template/menu"></c:import>
        <h2>${mensagem}</h2>
        
