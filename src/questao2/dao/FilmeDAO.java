package questao2.dao;


import questao2.model.Filme;

import java.util.List;

public interface FilmeDAO {

    void adicionarFilmes(List<Filme> filmes);

    List<Filme> listarFilmes(int quantidade, int pagina);

    void excluirFilmes();
}
