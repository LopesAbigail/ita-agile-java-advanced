/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Oraculo;

/**
 *
 * @author conta
 */
@WebServlet(name = "OraculoController", urlPatterns = {"/OraculoController"})
public class OraculoController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String productType = request.getParameter("product");
       Oraculo oraculo = new Oraculo();
       List<String> products = oraculo.bestProducts(productType);
       // Disponibilizando a lista para a view
       request.setAttribute("products", products);
       request.getRequestDispatcher("response.jsp").forward(request, response);
    }
    
}
