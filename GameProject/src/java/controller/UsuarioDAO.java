package controller;

import model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements IUsuarioDAO {

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public String getNomeUsuario(String login, String senha) throws Exception{
        
        try(Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost/coursera", "postgres", "postgres")){
            String QUERY = "SELECT nome FROM USUARIO WHERE login = ? AND senha = ?";
            PreparedStatement ps = c.prepareStatement(QUERY);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getString("nome");
            }
            throw new Exception("Não foi possível autenticar o usuário de login " + login);
        } catch (SQLException e){
            throw new RuntimeException("Ocorreu o seguinte erro ao tentar estabeler a conexao!", e);
        } 
    }

    @Override
    public void inserir(Usuario u) {
        try (Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost/coursera", "postgres", "postgres")){

            String sql = "INSERT INTO usuario(login, email, nome, senha, pontos) VALUES (?, ?, ?, ?, ?);";

            PreparedStatement stm = c.prepareStatement(sql);
            stm.setString(1, u.getLogin());
            stm.setString(2, u.getEmail());
            stm.setString(3, u.getNome());
            stm.setString(4, u.getSenha());
            stm.setInt(5, u.getPontos());

            stm.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("Ocorreu o seguinte erro ao tentar criar um usuario: ", e);
        }
    }

    @Override
    public Usuario recuperar(String login) {
        Usuario u = new Usuario();
        try (Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost/coursera", "postgres", "postgres")){

            String sql = "SELECT * FROM usuario WHERE login = ?;";

            PreparedStatement stm = c.prepareStatement(sql);
            stm.setString(1, login);
            ResultSet rs = stm.executeQuery();

            while(rs.next()) {
                u = new Usuario(
                        rs.getString("login"),
                        rs.getString("email"),
                        rs.getString("nome"),
                        rs.getString("senha"),
                        rs.getInt("pontos"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("Ocorreu o seguinte erro ao tentar estabeler a conexao!", e);
        }

        return u;
    }

    public List<Usuario> recuperarUsuarios() {
        List<Usuario> usuarios = new ArrayList<Usuario>();

        try (Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost/coursera", "postgres", "postgres")){

            String sql = "SELECT * FROM usuario;";

            PreparedStatement stm = c.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();


            while(rs.next()) {
                 Usuario u = new Usuario(
                        rs.getString("login"),
                        rs.getString("email"),
                        rs.getString("nome"),
                        rs.getString("senha"),
                        rs.getInt("pontos"));

                 usuarios.add(u);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("Ocorreu o seguinte erro ao tentar estabeler a conexao!", e);
        }

        return usuarios;
    }

    @Override
    public void adicionarPontos(String login, int pontos) {
        try (Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost/coursera", "postgres", "postgres")){

            String sql = "UPDATE usuario SET pontos = pontos + ? WHERE login = ?;";

            PreparedStatement stm = c.prepareStatement(sql);
            stm.setInt(1, pontos);
            stm.setString(2, login);

            stm.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("Ocorreu o seguinte erro ao tentar estabeler a conexao!", e);
        }

    }

    @Override
    public List<Usuario> ranking() {
        List<Usuario> rank = new ArrayList<Usuario>();
        try (Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost/coursera", "postgres", "postgres")){

            String sql = "SELECT * FROM usuario ORDER BY pontos DESC;";

            PreparedStatement stm = c.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()){
                Usuario u = new Usuario(
                        rs.getString("login"),
                        rs.getString("email"),
                        rs.getString("nome"),
                        rs.getString("senha"),
                        rs.getInt("pontos"));

                rank.add(u);
            }

            return rank;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("Ocorreu o seguinte erro ao tentar estabeler a conexao!", e);
        }
    }
}
