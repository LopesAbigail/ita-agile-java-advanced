<%-- 
    Document   : Response
    Created on : 11 de dez de 2021, 11:41:18
    Author     : conta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Response</title>
    </head>
    <body>
        <h1>The best # $(param.product) # producers are: </h1>
        <ul>
            <c:forEach var="item" items="$(products)">
            <li>$(item)</li>
            </c:forEach>
        </ul>
    </body>
</html>
