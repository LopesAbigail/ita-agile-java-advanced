package com.abi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 @WebServlet(name = "HallooServlet",
        description = "This is my first annotated servlet",
        urlPatterns = {"/Hallo"})
public class HalloServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        if(nome == null) nome = "camarada";
        response.getWriter().print("<html><h1>Hallo, " + nome + ", mein Freund!</h1></html>");
    }

}
