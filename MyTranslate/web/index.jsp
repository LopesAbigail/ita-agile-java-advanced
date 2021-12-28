<%-- 
    Document   : index
    Created on : 23 de dez de 2021, 15:36:43
    Author     : conta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Translate</title>
        <style>
            body {background-color: powderblue;}
            h1   {color: cadetblue;}
            p    {color: buttontext;}
        </style>
    </head>
    <body>
        <h1>Traduza aqui a sua palavra!</h1>
        <div>
            <form action="translate">
                <div>
                    <label for="word"> Palavra: </label>
                    <input name="palavra" type="text" placeholder="palavra">
                    <input style="color: grey; background-color: powderblue" type="submit" value="Traduzir">
                </div>
            </form>
        </div>
    </body>
</html>
