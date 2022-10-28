package questao2;

import questao2.dao.jdbc.JdbcFilmeDAO;
import questao2.model.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();

        int quantidade;
        int paginas;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\n=========================== Bem-vindo a questão 2 da Sprint2 ============================\n");
            System.out.print("Olá usuário, quantos filmes você deseja filtrar ? ");
            quantidade = input.nextInt();


            System.out.print("Qual página você deseja ver? (Começa da página 0) ");
            paginas = input.nextInt();

            System.out.println("\n==================================================================================");

            excluirFilmes();
            adicionandoFilmes(filmes);
            listarFilmes(quantidade, paginas);

        } catch (Exception e) {
            throw new RuntimeException("Entrada inválida!");
        }
    }

    private static void adicionandoFilmes(List<Filme> filmes) {

        Filme filme1 = new Filme("A Bela e a Fera", "Filme animado da Bela e a fera. Duração 145 minutos", 2017);
        Filme filme2 = new Filme("Harry Potter e a Pedra Filosofal", "Primeiro filme da saga Harry Potter. Duração 152 minutos", 2001);
        Filme filme3 = new Filme("Harry Potter ea Câmara Secreta", "Segundo filme da saga Harry Potter. Duração 161 minutos", 2002);
        Filme filme4 = new Filme("Harry Potter e o prisioneiro de azkaban", "Terceiro filme da saga Harry Potter. Duração 142 minutos", 2004);
        Filme filme5 = new Filme("Harry Potter e o Cálice de Fogo", "Quarto filme da saga Harry Potter. Duração 157 minutos", 2005);
        Filme filme6 = new Filme("Harry Potter e a Ordem da Fênix", "Quinto filme da saga Harry Potter. Duração 138 minutos", 2007);
        Filme filme7 = new Filme("Harry Potter e o Príncipe Mestiço", "Sexto filme da saga Harry Potter. Duração 153 minutos", 2009);
        Filme filme8 = new Filme("Harry Potter e as Relíquias da Morte: Parte 1", "Setimo filme da saga Harry Potter. Duração 146 minutos", 2010);
        Filme filme9 = new Filme("Harry Potter e as Relíquias da Morte II", "Oitavo filme da saga Harry Potter. Duração 130 minutos", 2011);
        Filme filme10 = new Filme("As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa", "Primeiro filme do universo Nárnia. Duração 150 minutos", 2005);
        Filme filme11 = new Filme("As Crônicas de Nárnia: Príncipe Caspian", "Segundo filme do universo Nárnia. Duração 150 minutos", 2008);
        Filme filme12 = new Filme("As Crônicas de Nárnia: A Viagem do Peregrino da Alvorada", "Terceiro filme do universo Nárnia. Duração 115 minutos", 2010);
        Filme filme13 = new Filme("Shrek", "Primeiro longa do universo Shrek. Duração 89 minutos", 2001);
        Filme filme14 = new Filme("Shrek 2", "Segundo longa do universo Shrek. Duração 93 minutos", 2004);
        Filme filme15 = new Filme("Shrek Terceiro", "Terceiro longa do universo Shrek. Duração 93 minutos", 2007);
        Filme filme16 = new Filme("Shrek Para Sempre", "Quarto longa do universo Shrek. Duração 93 minutos", 2010);
        Filme filme17 = new Filme("Era do Gelo", "Filme animado de uma jornada pré-historica. Duração 81 minutos", 2002);
        Filme filme18 = new Filme("A Era do Gelo: O Desastre", "Segundo filme da saga A era do gelo. Duração 91 minutos", 2006);
        Filme filme19 = new Filme("Era do Gelo: A Origem dos Dinossauros", "Terceiro filme da saga A era do gelo. Duração 94 minutos", 2009);
        Filme filme20 = new Filme("Era do Gelo: Deriva Continental", "Quarto filme da saga A era do gelo. Duração 88 minutos", 2012);

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);
        filmes.add(filme4);
        filmes.add(filme5);
        filmes.add(filme6);
        filmes.add(filme7);
        filmes.add(filme8);
        filmes.add(filme9);
        filmes.add(filme10);
        filmes.add(filme11);
        filmes.add(filme12);
        filmes.add(filme13);
        filmes.add(filme14);
        filmes.add(filme15);
        filmes.add(filme16);
        filmes.add(filme17);
        filmes.add(filme18);
        filmes.add(filme19);
        filmes.add(filme20);

        JdbcFilmeDAO jdbcFilmeDAO = new JdbcFilmeDAO();
        jdbcFilmeDAO.adicionarFilmes(filmes);
    }

    private static void listarFilmes(int quantidade, int paginas) {
        JdbcFilmeDAO jdbcFilmeDAO = new JdbcFilmeDAO();
        List<Filme> filmes = jdbcFilmeDAO.listarFilmes(quantidade, paginas);

        for(Filme filme : filmes){
            System.out.println("\nNome: " + filme.getNome());
            System.out.println("Descrição: " + filme.getDescricao());
            System.out.println("Ano: " + filme.getAno() + "\n");
        }
    }

    private static void excluirFilmes() {
        JdbcFilmeDAO jdbcFilmeDAO = new JdbcFilmeDAO();
        jdbcFilmeDAO.excluirFilmes();
    }
}
