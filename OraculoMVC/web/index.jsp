<%-- 
    Document   : index
    Created on : 11 de dez de 2021, 11:17:04
    Author     : conta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Oraculo Mineiro</title>
    </head>
    <body>
        <h1>Choose the product: </h1>
        <form action="OraculoController">
            <select name="product">
                <option value="Doce de leite"> Doce de leite </option>
                <option value="Queijo mineiro"> Queijo mineiro </option>
            </select>
            <input type="submit" value="Ask" />
        </form>
    </body>
</html>
