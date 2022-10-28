package questao2.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public Connection getConnection() throws Exception {

        //Indicando o drive jdbc e abaixo, retornando a conexão com o bd
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/filmescompass?useTimezone=true&serverTimezone=UTC";
        String usuario = "root";
        String senha = "#Ilmpls260202#";
        return DriverManager.getConnection(url, usuario, senha);
    }
}
