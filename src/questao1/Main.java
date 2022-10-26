package questao1;

import questao1.dao.ProdutoDAO;
import questao1.model.Produto;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("\n=========================== Bem-vindo a questão 1 da Sprint2 ============================\n");

        int opcao = 20;

        while(opcao != 0){

            layout();

            try (Scanner input = new Scanner(System.in)) {
                opcao = input.nextInt();
            } catch (Exception e) {
                throw new RuntimeException("Informe um valor válido");
            }

            switch (opcao) {
                case 1 -> adicionandoProdutos();
            }
        }
    }

    private static void adicionandoProdutos() {
        Produto produto1 = new Produto("Mouse Pad", "Mouse Pad com Logo da Compass",
                10, new BigDecimal("120"));

        Produto produto2 = new Produto("Tag Springuiçados", "Figurinha do melhor time de estágio da Compass",
                15, new BigDecimal("15.25"));

        Produto produto3 = new Produto("Caneca Java", "Caneca Java, 325 ml",
                8, new BigDecimal("32.99"));

        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.adicionarProdutos(produto1);
        produtoDAO.adicionarProdutos(produto2);
        produtoDAO.adicionarProdutos(produto3);

        System.out.println("\nProdutos cadastrados com sucesso!");
    }

    private static void layout() {
        System.out.println("Selecione uma das opções abaixo :                                  ");
        System.out.println("           1. Cadastrar Produtos");
        System.out.println("           2. Atualizar Produto");
        System.out.println("           3. Excluir Segundo Produto Cadastrado");
        System.out.println("           0. Sair");
        System.out.println(" ");
        System.out.println("==================================================================================");
        System.out.print("Opcão:");
    }
}