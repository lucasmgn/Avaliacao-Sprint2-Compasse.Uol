package questao1.dao.jdbc;

import questao1.dao.ProdutoDAO;
import questao1.model.Produto;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Calsse criada para as regras de negocio
public class JdbcProdutoDAO implements ProdutoDAO {

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
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public Boolean buscarProduto(int id) {
        String sql = "SELECT id FROM produto WHERE id = " + id;

        Conexao conexao = new Conexao();

        try(Connection ignored = conexao.getConnection();
            PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery()) {

            return resultSet.next();

        } catch (Exception e) {
            e.getStackTrace();
            return true;
        }
    }

    public void atualizandoProduto() {

        String sql = "UPDATE produto SET nome = ?, descricao = ?, quantidade = ?, preco = ? WHERE id = ?";

        Conexao conexao = new Conexao();
        try(Connection ignored = conexao.getConnection();
            PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(sql)) {

            //valores que irão atualizar
            preparedStatement.setString(1, "Fone de ouvido");
            preparedStatement.setString(2, "Fones de ouvido Bluetooth");
            preparedStatement.setInt(3, 4);
            preparedStatement.setBigDecimal(4, new BigDecimal("236.63"));
            preparedStatement.setInt(5, 1);
            preparedStatement.execute();

            System.out.println("\nProduto atualizado com sucesso!\n");

        }catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void excluindoProduto() {

        String sql = "DELETE FROM produto WHERE id = ?";
        Conexao conexao = new Conexao();
        try(Connection ignored = conexao.getConnection();
            PreparedStatement preparedStatement = conexao.getConnection().prepareStatement(sql)) {

            preparedStatement.setInt(1, 2);
            preparedStatement.execute();

            System.out.println("\nProduto excluído com sucesso!\n");
        }catch (Exception e) {
            e.getStackTrace();
        }
    }
}
