package questao1.model;

import java.math.BigDecimal;

public class Produto {

//    private int id;
    private String nome;
    private String descricao;
    private int quantidade;
    private BigDecimal preco;

    public Produto(String nome, String descricao, int quantidade, BigDecimal preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

//    public Produto() {
//    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

}
