<%--
  Created by IntelliJ IDEA.
  User: joaopedro
  Date: 13/04/2021
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nova Conta</title>
</head>
<body>
<form action="/jotabank/novaConta" method="post">

    Nome Completo: <input type="text" name="nome">

    CPF: <input type="text" name="cpf">

    Telefone: <input type="text" name="telefone">

    <input type="submit">

</form>
</body>
</html>
