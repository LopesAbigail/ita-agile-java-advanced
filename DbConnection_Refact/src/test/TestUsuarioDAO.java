package test;

import com.abi.controller.UsuarioDAO;
import com.abi.model.Usuario;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.util.fileloader.FlatXmlDataFileLoader;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class TestUsuarioDAO {

    JdbcDatabaseTester jdt;
    UsuarioDAO dao = new UsuarioDAO();

    String login = "havena.jirayao123456";
    String email = "havena.jirayao123456@mail.com";
    String nome = "Havena Hire Jirayao123456";
    String senha = "HYURIEOPS21yoa132465";
    int pontos = 19;

    @BeforeEach
    void setUp() throws Exception {
        jdt = new JdbcDatabaseTester("org.postgresql.Driver", "jdbc:postgresql://localhost/coursera", "postgres", "postgres");
        FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
        jdt.setDataSet(loader.load("/init.xml"));

        jdt.onSetup();
    }

    @Test
    public void inserirUsuario() {

        dao.inserir(new Usuario(login, email, nome, senha, pontos));

        List<Usuario> usuarios = dao.recuperarUsuarios();

        Assertions.assertNotNull(usuarios);
        Assertions.assertEquals(12, usuarios.size());
    }

    @Test
    public void RecuperarUsuario() {
        Usuario usuario = dao.recuperar(login);

        Assertions.assertNotNull(usuario);
        Assertions.assertEquals(login, usuario.getLogin());
        Assertions.assertEquals(nome, usuario.getNome());
        Assertions.assertEquals(email, usuario.getEmail());
        Assertions.assertEquals(senha, usuario.getSenha());
        Assertions.assertEquals(pontos, usuario.getPontos());
    }

    @Test
    public void AdicionarPontos() {
        dao.adicionarPontos(login, 4);
        Usuario usuario = dao.recuperar(login);

        Assertions.assertNotNull(usuario);
        Assertions.assertEquals(login, usuario.getLogin());
        Assertions.assertEquals(nome, usuario.getNome());
        Assertions.assertEquals(23, usuario.getPontos());
    }

    @Test
    public void ranking() {
        List<Usuario> rank = dao.ranking();

        Assertions.assertNotNull(rank);
    }

}
