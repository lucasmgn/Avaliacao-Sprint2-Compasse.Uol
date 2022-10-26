package questao1.dao;

import questao1.conexao.Conexao;
import questao1.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;

//Calsse criada para as regras de negocio
public class ProdutoDAO {

    public void adicionarProdutos(Produto produto) {
        String sql = "INSERT INTO produto(nome, descricao, quantidade, preco) VALUES (?, ?, ?, ?)";

        Conexao conexao = new Conexao();

        try(Connection ignored = conexao.getConnection();
            PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(sql)) {

            //Adicionando e executando a query com os valores para cada atributo(coluna)
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setInt(3, produto.getQuantidade());
            preparedStatement.setBigDecimal(4, produto.getPreco());
            preparedStatement.execute();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
