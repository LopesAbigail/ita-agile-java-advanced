package com.abi;

import com.abi.controller.UsuarioDAO;
import com.abi.model.Usuario;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Usuario anne = new Usuario(
                "anne.gale", "anne.gale@mail.com", "Anne Pima Gale", "FTERWAJ87HG", 10);

        Usuario robin = new Usuario(
                "robin.gale", "robin.gale@mail.com", "Robin Pima Gale", "FTERWAJ87TY", 9);

        UsuarioDAO dao = new UsuarioDAO();
        dao.inserir(anne);
        dao.inserir(robin);

        List<Usuario> usuarios = dao.ranking();
        usuarios.forEach(u -> System.out.println(u.toString()));
    }
}
