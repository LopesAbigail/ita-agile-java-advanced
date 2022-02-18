package controller;

import model.Topico;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TopicoDAO {

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public String getTopicoByLogin(String login) throws Exception{
        
        try(Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost/coursera", "postgres", "postgres")){
            String QUERY = "SELECT nome FROM TOPICO WHERE login = ?;";
            PreparedStatement ps = c.prepareStatement(QUERY);
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getString("titulo");
            }
            throw new Exception("Não foi possível recuperar o topico para o login " + login);
        } catch (SQLException e){
            throw new RuntimeException("Ocorreu o seguinte erro ao tentar estabeler a conexao!", e);
        } 
    }

    public void inserir(Topico  t) {
        try (Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost/coursera", "postgres", "postgres")){

            String sql = "INSERT INTO Topico (titulo, conteudo, login) VALUES (?, ?, ?);";

            PreparedStatement stm = c.prepareStatement(sql);
            stm.setString(1, t.getTitulo());
            stm.setString(2, t.getConteudo());
            stm.setString(3, t.getLogin());

            stm.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("Ocorreu o seguinte erro ao tentar criar um topico para o usuario: ", e);
        }
    }

}
