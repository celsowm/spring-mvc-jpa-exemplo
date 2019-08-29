<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/template/header/"></c:import>
<h3>Login Page</h3>
${mensagem}
<form method="post"
      action="${pageContext.request.contextPath}/login/login">
    <table border="0" cellpadding="2" cellspacing="2">
        <tr>
            <td>Username</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td><input type="submit" value="Login"></td>
        </tr>
    </table>
</form>
<c:import url="/template/footer/"></c:import>