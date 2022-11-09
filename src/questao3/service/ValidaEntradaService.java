package questao3.service;

import java.util.Scanner;

public class ValidaEntradaService {

    private static void verificarEntrada(String entrada) throws Exception {
        if (entrada.isEmpty()) {
            throw new Exception("Entrada inválida!");
        }
    }

    public static void validarEntrada(String entrada) throws Exception {
        verificarEntrada(entrada);

        String entradaFormatada = entrada.replaceAll("\\s+", "");

        char[] arraysEntrada = entradaFormatada.toCharArray();

        var tamanhoDaEntrada = arraysEntrada.length;
        var valida = 3;
        var felicidade = 0;
        var tristeza = 0;


        for (var i = 0; i < tamanhoDaEntrada; i++) {

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

    public static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
