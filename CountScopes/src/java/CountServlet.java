/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author conta
 */
@WebServlet(urlPatterns = {"/Count"})
public class CountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // request
        if(request.getAttribute("count") == null){
            request.setAttribute("count", new Count("Count request scope"));
        }
        ((Count) request.getAttribute("count")).toCount();
        
        // session
        if(request.getSession().getAttribute("count") == null){
            request.getSession().setAttribute("count", new Count("Count session scope"));
        }
        ((Count) request.getSession().getAttribute("count")).toCount();
        
        // application
        if(getServletContext().getAttribute("count") == null){
            getServletContext().setAttribute("count", new Count("Count application scope"));
        }
        ((Count) getServletContext().getAttribute("count")).toCount();
        
        PrintWriter pw = response.getWriter();
        pw.append("<html>");
        pw.append("<h1>" + request.getAttribute("count") + "</h1>");
        pw.append("<h1>" + request.getSession().getAttribute("count") + "</h1>");
        pw.append("<h1>" + getServletContext().getAttribute("count") + "</h1>");
        pw.append("</html>");
    }

}
