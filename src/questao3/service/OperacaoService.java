package questao3.service;

import java.util.Scanner;

public class OperacaoService {

    private ValidaEntradaService validaEntradaService;

    public static void operacao(ValidaEntradaService entrada) {
        try (Scanner input = new Scanner(System.in)) {
            var i = 20;
            while (i != 0) {
                System.out.print("Como você está? ");

                var entradaDoUsuario = input.nextLine();

                entrada.validarEntrada(entradaDoUsuario);

                System.out.print("\nDeseja continuar(1.Sim 2.Não) ? ");
                i = input.nextInt();
                entrada.clearBuffer(input);

                if(i == 2){
                    break;
                }
                i++;
            }
        } catch (Exception e) {
            throw new RuntimeException("Entrada inválida!");
        }
        System.out.println("\nObrigado por usar a aplicação!");
    }
}
