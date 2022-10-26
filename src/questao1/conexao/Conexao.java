package questao1.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

//fazendo a conexão com o BD
public class Conexao {

    private String url = "jdbc:mysql://localhost/produtoscompass?useTimezone=true&serverTimezone=UTC";
    private String usuario = "root";
    private String senha = "#Ilmpls260202#";

    public Connection getConnection() throws Exception {

        //Indicando o drive jdbc e abaixo, retornando a conexão com o bd
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao;
    }
}
