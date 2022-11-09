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

import questao3.service.OperacaoService;
import questao3.service.ValidaEntradaService;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n=========================== Bem-vindo Usuário a questão 3 da Sprint2 ============================\n");

        ValidaEntradaService entrada = new ValidaEntradaService();
        OperacaoService.operacao(entrada);

        System.out.println("\n=================================================================================================");
    }
}
