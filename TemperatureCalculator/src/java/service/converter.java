/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package service;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abi
 */
@WebServlet(name = "converter", urlPatterns = {"/converter"})
public class Converter extends HttpServlet {
    
    private int convert(String type, int value)
    {
        switch(type)
        {
            case "fahrenheit":
                return ((value - 32) * 5) / 9;
            case "celsius":
                return ((value * 9) / 5) + 32;
            default:
                return 0;
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String originType = request.getParameter("origin");
        String goalType = request.getParameter("goal");
        
        int originValue = Integer.parseInt(request.getParameter("value"));
        int result = (originType.equals(goalType)) ? originValue : convert(originType, originValue);
        
        try 
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Result</title>");
            out.println("<style>\n" +
                "            body {background-color: powderblue;}\n" +
                "            h1   {color: cadetblue;}\n" +
                "            p    {color: buttontext;}\n" +
                "        </style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Result: </h1>");
            out.println("<p> Converting " + originValue + " degrees " + originType + " to " +
                    goalType + " we get the value: " + result + "</p>");
            out.println("</body>");
            out.println("</html>");
        } 
        finally 
        {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
