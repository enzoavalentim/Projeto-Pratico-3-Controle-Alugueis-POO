# Nome do Projeto
Controle de Aluguéis de Equipamentos

# Situação Problema
Uma empresa que fornece uma ampla variedade de equipamentos para construção civil, como escavadeiras, betoneiras e andaimes, deseja modernizar seu sistema de controle de aluguéis. Para isso, eles contrataram seus serviços com o objetivo de desenvolver um sistema em Java que permita gerenciar de forma eficiente o aluguel desses equipamentos. Além disso, a empresa solicitou a criação de uma interface gráfica intuitiva para melhorar a usabilidade e a eficácia do software, facilitando a operação do sistema por parte dos usuários.

# Documentação do Código
Este é um sistema desenvolvido em Java para gerenciar o aluguel de equipamentos. Ele permite cadastrar clientes, cadastrar produtos, realizar aluguéis, devoluções e acessar relatórios. 
Execução: Execute o programa e siga as instruções fornecidas no console.
Menu Principal: O sistema apresenta um menu principal com as seguintes opções:

- Cadastar Cliente: Permite cadastrar um novo cliente.

- Cadastrar Produto: Permite cadastrar um novo produto.

- Aluguel de equipamentos: Realiza o aluguel de um equipamento para um cliente

- Devolução de equipamentos: Registra a devolução de um equipamento alugado.
  
- Central de relatórios: Acessa a central de relatórios.

Central de Relatórios: Dentro da central de relatórios, você pode escolher entre várias opções:

- Lista de equipamentos cadastrados: Exibe a lista de todos os equipamentos cadastrados.

- Lista de clientes cadastrados: Exibe a lista de todos os clientes cadastrados.

- Lista de alugueis: Exibe a lista de todos os aluguéis realizados.

- Lista de alugueis por cliente: Exibe a lista de aluguéis realizados por um cliente específico.

- Relatório mensal e faturamento: Calcula e exibe o faturamento total mensal.

# Para o usuário
No menu principal, onde são exibidas as seguintes opções:
- Cadastrar Cliente
  
- Cadastrar Produto
  
- Aluguel de equipamentos
  
- Devolução de equipamentos
  
- Central de relatórios

Escolha da Opção: O usuário escolhe uma das opções digitando o número correspondente e pressionando Enter.
Execução da Opção Escolhida:

- Cadastrar Cliente (Opção 1): O usuário fornece o nome do cliente a ser cadastrado e o sistema gera um ID único para ele.

- Cadastrar Produto (Opção 2): O usuário fornece o tipo do produto, seu valor de locação diária e o sistema gera um ID único para ele.

- Aluguel de Equipamentos (Opção 3): O usuário seleciona um cliente e um equipamento disponível para aluguel.

- Devolução de Equipamentos (Opção 4): O usuário seleciona um cliente que está devolvendo um equipamento alugado.

- Central de Relatórios (Opção 5): O usuário acessa a Central de Relatórios, onde pode escolher entre várias opções de relatórios, como listar equipamentos cadastrados, listar clientes cadastrados, listar aluguéis realizados, listar aluguéis por cliente e gerar um relatório mensal de faturamento.


Caso selecionar a opção 5, o usuário é apresentado a um novo menu com as seguintes opções:

- Lista de equipamentos cadastrados

- Lista de clientes cadastrados

- Lista de aluguéis

- Lista de aluguéis por cliente

- Relatório mensal e faturamento

- Sair

Escolha da Opção de Relatório: O usuário escolhe uma das opções digitando o número correspondente e pressionando Enter.
Execução da Opção Escolhida:

- Lista de Equipamentos Cadastrados (Opção 1): O sistema exibe na tela a lista de todos os equipamentos cadastrados, mostrando o nome, ID, valor da locação diária e status de disponibilidade.

- Lista de Clientes Cadastrados (Opção 2): O sistema exibe na tela a lista de todos os clientes cadastrados, mostrando o nome e o ID de cada cliente.

- Lista de Aluguéis (Opção 3): O sistema exibe na tela a lista de todos os aluguéis realizados, mostrando detalhes como nome do equipamento locado, ID do equipamento, valor do aluguel, nome do locatário, ID do locatário, data de locação e data de devolução.

- Lista de Aluguéis por Cliente (Opção 4): O sistema solicita ao usuário que forneça o nome e o ID do cliente. Em seguida, exibe na tela a lista de aluguéis realizados por esse cliente, mostrando detalhes como nome do equipamento locado, ID do equipamento, data de locação e data de devolução.

- Relatório Mensal e Faturamento (Opção 5): O sistema exibe na tela um relatório do faturamento total mensal, mostrando detalhes como nome do equipamento locado, ID do equipamento, valor do aluguel, nome do locatário, ID do locatário, data de locação e data de devolução. Além disso, exibe o faturamento total acumulado no período.

- Sair (Opção 6): Encerra a execução da Central de Relatórios e retorna ao menu principal.
