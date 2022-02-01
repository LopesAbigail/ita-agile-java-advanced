package controller;

import model.Usuario;

import java.util.List;

public interface IUsuarioDAO {

    //insere um novo usuário no banco de dados
    void inserir(Usuario u);

    //recupera o usuário pelo seu login
    Usuario recuperar(String login);

    //adiciona os pontos para o usuário no banco
    void adicionarPontos(String login, int pontos);

    //retorna a lista de usuários ordenada por pontos (maior primeiro)
    List<Usuario> ranking();

}
