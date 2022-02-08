

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import controller.UsuarioDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author conta
 */
@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String LOGIN = request.getParameter("login");
        String SENHA = request.getParameter("senha");
        
        UsuarioDAO auth = new UsuarioDAO();
        try {
            if (auth.getNomeUsuario(LOGIN, SENHA) != null){
                String nomeUsuario = auth.getNomeUsuario(LOGIN, SENHA);
                request.setAttribute("nome", nomeUsuario);
            }
            request.getRequestDispatcher("sucesso.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            request.setAttribute("erro", ex.getMessage());
            request.getRequestDispatcher("erro.jsp").forward(request, response);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        request.getRequestDispatcher("create.jsp").forward(request, response);
    }

}
