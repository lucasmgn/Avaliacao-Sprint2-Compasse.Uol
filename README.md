1 - Crie uma entidade produto, com os seguintes atributos:
            • id
            • nome
            • descrição
            • quantidade
            • preço

Sua aplicação deve oferecer no método main 3 opções no console usando a classe
Scanner:

A primeira opção deve cadastrar produtos e ao selecionar ela deve cadastrar
automaticamente 3 produtos na base.

A segunda opção deve atualizar o primeiro produto cadastrado na opção 1.

A terceira opção deve excluir o segundo produto cadastrado.

Obs.: Tudo deve ser feito de forma automática apenas selecionando as opções ao
selecionar uma ação, deve ser mantida as opções apenas sinalizando no console que
ação foi realizada. Para finalizar a aplicação deve ser selecionado a opção 0.


RESPOSTA: Programa com funcionamento bem simples, terá um layout com 4 opcoes, 1. Cadastro de Produtos, 2. Atualiza o primeiro produto, 3. Exclui o  segundo produto e 0. Finaliza o programa. Caso não exista Produto para ser atualizado ou excluido, será lançado uma exception.


<h2>Entrando com a opção 1 (cadastrando produtos)</h2>

<h3>Imagem do código</h3>

![Captura de Tela (33)](https://user-images.githubusercontent.com/81782608/198433992-c642d845-8806-4cdf-9600-6fa84b899a20.png)


<h3>Imagem do BD</h3>

![Captura de Tela (40)](https://user-images.githubusercontent.com/81782608/198434365-51762061-c341-42d6-8580-5392a6e594b8.png)



<h2>Entrando com a opção 2 (atualizando o primeiro produto)</h2>

<h3>Imagem do código</h3>

![Captura de Tela (41)](https://user-images.githubusercontent.com/81782608/198435710-69fd9278-8524-407b-85c7-7116f77c7c2b.png)

<h3>Imagem do BD</h3>

![Captura de Tela (42)](https://user-images.githubusercontent.com/81782608/198435766-e44e214a-5cda-4f29-a20d-83a7b60c9e33.png)


<h2>Entrando com a opção 3 (excluindo o segundo produto)</h2>

<h3>Imagem do código</h3>

![Captura de Tela (43)](https://user-images.githubusercontent.com/81782608/198436278-35922d88-c23f-4d25-9c44-3a77dd114b7c.png)

<h3>Imagem do BD</h3>

![Captura de Tela (45)](https://user-images.githubusercontent.com/81782608/198436354-b801e869-da6f-4f45-85ec-795085b3de0e.png)

<br><br><br><br><br>

2 - Crie uma entidade filme, com os seguintes atributos:
• id
• nome
• descrição
• ano
Cadastre 20 filmes e simule a lógica de uma paginação. Use a classe Scanner para
perguntar ao usuário o número de quantos filmes ele deseja filtrar e em qual página
ele quer acessar. Por exemplo: Desejo ver 5 filmes da página 2 ou Desejo ver 10
filmes da página 1.

RESPOSTA: A entrada válida são números inteiros, representando a quantidades de filmes que você deseja ver e qual página, assim que iniciar a aplicação, ela fará um TRUNCATE na tabela filme através de um método, e logo após isso um insert dos 20 filmes.


<h2>Iniciando a aplicação</h2>

<h3>Imagem do código</h3>

![Captura de Tela (47)](https://user-images.githubusercontent.com/81782608/198492917-cc0a743a-2e4f-428a-b4ae-3b9494fa71de.png)

<h3>Imagem do BD</h3>

![Captura de Tela (48)](https://user-images.githubusercontent.com/81782608/198493444-7e65e9b3-bd36-458c-95e3-26f6b0e4b527.png)
