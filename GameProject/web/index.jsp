<%-- 
    Document   : index
    Created on : 25 de jan de 2022, 13:00:44
    Author     : conta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>
        <h1>Realize seu login entrando com as informacoes necessarias: </h1>
        <div>
            <form method="POST" action="login">
                Login: <input type="text" name="login" placeholder="insira seu login"/>
                Senha: <input type="password" name="senha" placeholder="insira sua senha"/>
                <input type="submit" value="Realizar login"/>
            </form>
        </div>
        <h1>Ou crie uma conta abaixo: </h1>
        <div>
            <form method="GET" action="login">
                <input type="submit" value="Criar uma conta"/>
            </form>
        </div>
    </body>
</html>
