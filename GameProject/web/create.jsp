<%-- 
    Document   : create
    Created on : 1 de fev de 2022, 20:50:49
    Author     : conta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Criar conta</title>
    </head>
    <body>
        <h1>Olah! Crie aqui a sua conta: </h1>
        <div>
            <form method="POST" action="create">
                <div> Nome: <input type="text" name="nome" placeholder="insira seu nome completo" size="40"/></div>
                <div> Login: <input type="text" name="login" placeholder="insira no formato nome.sobrenome" size="40"/></div>
                <div> Senha: <input type="password" name="senha" placeholder="insira uma senha"size="40"/></div><br/>
                <div> <input type="submit" value="Criar conta"/></div>
            </form>
        </div>
    </body>
</html>
