package questao3.view;

import questao3.service.OperacaoService;
import questao3.service.ValidaEntradaService;

public class Visualizacao {

    public void chamada(){
        System.out.println("\n=========================== Bem-vindo Usuário a questão 3 da Sprint2 ============================\n");

        ValidaEntradaService entrada = new ValidaEntradaService();
        OperacaoService.operacao(entrada);

        System.out.println("\n=================================================================================================");
    }
}
