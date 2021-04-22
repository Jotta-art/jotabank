<%--
  Created by IntelliJ IDEA.
  User: joaopedro
  Date: 15/04/2021
  Time: 08:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>

    <c:forEach items="${contas}" var="conta">
        <li> Nome: " ${conta.nomeDoTitular} CPF: " ${conta.cpf}
            Telefone: ${conta.telefone}</li>
    </c:forEach> for (Conta conta : lista) {

</ul>

</body>
</html>
