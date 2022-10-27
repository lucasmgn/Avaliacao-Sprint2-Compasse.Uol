package questao1.dao;

import questao1.model.Produto;


public interface ProdutoDAO {

    void adicionarProdutos(Produto produto);

    void excluindoProduto();

    Boolean buscarProduto(int id);

    void atualizandoProduto();
}
