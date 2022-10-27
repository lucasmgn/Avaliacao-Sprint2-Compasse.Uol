package questao1;

import questao1.dao.jdbc.jdbcProdutoDAO;
import questao1.model.Produto;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

/*
    1 - Crie uma entidade produto, com os seguintes atributos:
            • id
            • nome
            • descrição
            • quantidade
            • preço

    Sua aplicação deve oferecer no método main 3 opções no console usando a classe
    Scanner:

    A primeira opção deve cadastrar produtos e ao selecionar ela deve cadastrar
    automaticamente 3 produtos na base. OK

    A segunda opção deve atualizar o primeiro produto cadastrado na opção 1.OK

    A terceira opção deve excluir o segundo produto cadastrado. OK

    Obs.: Tudo deve ser feito de forma automática apenas selecionando as opções ao
    selecionar uma ação, deve ser mantida as opções apenas sinalizando no console que
    ação foi realizada. Para finalizar a aplicação deve ser selecionado a opção 0.
*/

    public static void main(String[] args) {

        layout();

        try (Scanner input = new Scanner(System.in)) {

            int opcao = 20;

            while (opcao > 0) {
                System.out.print("Opcão:");
                opcao = input.nextInt();

                switch (opcao) {
                    case 1 -> adicionandoProdutos();
                    case 2 -> atualizandoPrimeiroProduto();
                    case 3 -> excluindoSegundoProduto();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Entrada inválida!");
        }
    }

    private static void adicionandoProdutos() {
        Produto produto1 = new Produto("Mouse", "Mouse da Compass",
                10, new BigDecimal("120"));

        Produto produto2 = new Produto("Tag Springuiçados", "Figurinha do melhor time de estágio da Compass",
                15, new BigDecimal("15.25"));

        Produto produto3 = new Produto("Caneca Java", "Caneca Java, 325 ml",
                8, new BigDecimal("32.99"));

        jdbcProdutoDAO produtoDAO = new jdbcProdutoDAO();

        //Verificando se existe um produto no banco, caso não exista será criado novos produtos
        if (produtoDAO.buscarProduto(3)) {
            throw new RuntimeException();
        }
        produtoDAO.adicionarProdutos(produto1);
        produtoDAO.adicionarProdutos(produto2);
        produtoDAO.adicionarProdutos(produto3);
        System.out.println("\nProdutos cadastrados com sucesso!\n");

    }

    private static void atualizandoPrimeiroProduto() {
        jdbcProdutoDAO produtoDAO = new jdbcProdutoDAO();

        // não existir id 1 lançará uma excpetion
        if (!produtoDAO.buscarProduto(1)) {
            throw new RuntimeException();
        }
        produtoDAO.atualizandoProduto();
    }

    private static void excluindoSegundoProduto() {

        jdbcProdutoDAO produtoDAO = new jdbcProdutoDAO();

        // não existir id 2 lançará uma excpetion
        if (!produtoDAO.buscarProduto(2)) {
            throw new RuntimeException();
        }
        produtoDAO.excluindoProduto();
    }

    private static void layout() {
        System.out.println("\n=========================== Bem-vindo a questão 1 da Sprint2 ============================\n");
        System.out.println("Selecione uma das opções abaixo :                                  ");
        System.out.println("           1. Cadastrar Produtos");
        System.out.println("           2. Atualizar Produto");
        System.out.println("           3. Excluir Segundo Produto Cadastrado");
        System.out.println("           0. Sair");
        System.out.println(" ");
        System.out.println("==================================================================================");
    }
}