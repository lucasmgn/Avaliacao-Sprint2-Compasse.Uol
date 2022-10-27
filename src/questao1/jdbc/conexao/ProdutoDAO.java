package questao1.jdbc.conexao;

import questao1.model.Produto;


public interface ProdutoDAO {

    void adicionarProdutos(Produto produto);

    void excluindoProduto();
}
