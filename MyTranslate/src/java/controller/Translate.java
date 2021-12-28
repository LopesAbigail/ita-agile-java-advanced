package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.FileRepository;

/**
 *
 * @author conta
 */
@WebServlet(name = "translate", urlPatterns = {"/translate"})
public class Translate extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        FileRepository fileRepository = new FileRepository();
        String word = request.getParameter("palavra");
        String translate = fileRepository.seachWordInFile(word);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<h1>" + translate + "</h1>");
    }
    

}
