/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import controller.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 *
 * @author conta
 */
@WebServlet(urlPatterns = {"/create"})
public class CreateLoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsuarioDAO auth = new UsuarioDAO();
        
        String nome = request.getParameter("nome");
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        
        String email = usuario + "@mail.com";
        
        try {
            auth.inserir(new Usuario(usuario, email, nome, senha, 0));
        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        }
    }

}
