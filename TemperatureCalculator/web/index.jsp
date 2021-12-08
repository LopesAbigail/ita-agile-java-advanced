<%-- 
    Document   : index
    Created on : 7 de dez de 2021, 20:08:23
    Author     : Abi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Temperature converter</title>
        <style>
            body {background-color: powderblue;}
            h1   {color: cadetblue;}
            p    {color: buttontext;}
        </style>
    </head>
    <body>
        <div>
            <div>
                <h1>Temperature converter</h1>
                <form action="converter">
                    <div>
                        <input name="value" type="text" placeholder="value">
                        <label for="from"> from: </label>
                        <select id="origin" name="origin">
                          <option value="fahrenheit" selected>Fahrenheit</option>
                          <option value="celsius">Celsius</option>
                        </select>
                        <label for="to"> to: </label>
                        <select id="goal" name="goal">
                          <option value="fahrenheit">Fahrenheit</option>
                          <option value="celsius" selected>Celsius</option>
                        </select>
                        <input style="color: grey; background-color: powderblue" type="submit" value="Convert">
                    </div>
                </form>
            </div>
        
        </div>
    </body>
</html>
