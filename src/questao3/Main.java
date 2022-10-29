package questao3;

/*
     3 - (OBI-2020) Emoticons são símbolos usados para expressar o sentimento de quem
    escreve uma mensagem. Scott Fahlman, um professor de uma universidade
    americana, foi o primeiro a propor o uso das sequências de caracteres :-) e :-(, que
    viraram respectivamente símbolos para “divertido” e “chateado”. Vamos definir o
    sentimento expresso em uma mensagem como sendo:

    a) neutro: se o número de símbolos “divertido” é igual ao número de símbolos
    “chateado”
    b) divertido: se o número de símbolos “divertido” é maior do que número de
    símbolos “chateado”
    c) chateado: se o número de símbolos “chateado” é maior do que número de
    símbolos “divertido”.

    Dada uma mensagem composta por uma cadeia de caracteres, escreva um programa
    para determinar o sentimento expresso na mensagem. O seu programa deve usar a
    classe Scanner para ler uma linha de entrada e a partir dessa linha devolver o
    sentimento expresso. (Atenção: Validações de entrada é um ponto para prestar
    bastante atenção).

    Exemplo:

    Entrada: Espero que esteja tudo bem:-)
    Saída: divertido

    Entrada: Achei o filme muito divertido.
    Saída: neutro

    Entrada: :-):-(:-(:-)
    Saída: neutro

    Entrada: Sonhei com a prova :-( (vou estudar).
    Saída: chateado

* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n=========================== Bem-vindo Usuário a questão 3 da Sprint2 ============================\n");
        System.out.print("Como você está? ");

        try (Scanner input = new Scanner(System.in)) {
            String entradaDoUsuario = input.nextLine();

            validarEntrada(entradaDoUsuario);

        } catch (Exception e) {
            throw new RuntimeException("Entrada inválida!");
        }
        System.out.println("\n=================================================================================================");
    }

    private static void validarEntrada(String entrada) throws Exception {
        verificarEntrada(entrada);

        String entradaFormatada = entrada.replaceAll("\\s+", "");

        char[] arraysEntrada = entradaFormatada.toCharArray();

        int tamanhoDaEntrada = arraysEntrada.length;
        int valida = 3;
        int felicidade = 0;
        int tristeza = 0;

        for (int i = 0; i < tamanhoDaEntrada; i++) {

            String substring = entradaFormatada.substring(i, valida);

            if (substring.contains(":-)")) {
                felicidade++;
            } else if (substring.contains(":-(")) {
                tristeza++;
            }
            if(valida < tamanhoDaEntrada){
                valida++;
            }
        }

        if (felicidade > tristeza) {
            System.out.println("Saída: Divertido");
        } else if (felicidade < tristeza) {
            System.out.println("Saída: Chateado");
        } else {
            System.out.println("Saída: Neutro");
        }
    }

    private static void verificarEntrada(String entrada) throws Exception {
        if (entrada.isEmpty()) {
            throw new Exception("Entrada inválida");
        }
    }
}
