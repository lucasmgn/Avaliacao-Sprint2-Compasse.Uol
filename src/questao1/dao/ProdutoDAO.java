package questao1.dao.jdbc;

import questao1.model.Produto;


public interface ProdutoDAO {

    void adicionarProdutos(Produto produto);

    void excluindoProduto();
}
