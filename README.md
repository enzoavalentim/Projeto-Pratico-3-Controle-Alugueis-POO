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
- 

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
  
# Interface

- Tela De Login
  A tela de login é a primeira interface que os usuários encontram ao acessar o sistema. Ela garante a segurança do sistema, exigindo que os usuários insiram suas credenciais (nome de usuário e senha) para acessar as funcionalidades, garantindo que apenas usuários autorizados possam acessar o sistema.

- Tela Menu Principal
    Após o login, os usuários são direcionados para a tela principal, que serve como o hub central do sistema. Nessa tela, os usuários podem acessar as principais funcionalidades através de botões ou ícones. O menu de navegação permite fácil acesso às demais funcionalidades, como cadastro de clientes, equipamentos, e relatórios.

- Tela de Cadastro de Clientes
    A tela de cadastro de clientes permite que novos clientes sejam registrados no sistema. Esta tela é organizada em campos de entrada claros, com validações para garantir a precisão dos dados. O objetivo é facilitar o processo de adição de novos clientes, garantindo que todas as informações essenciais estejam registradas corretamente.

- Tela de Cadastro de Equipamentos
    Nesta tela, os usuários podem adicionar novos equipamentos ao sistema. A interface é projetada para ser intuitiva, com campos de entrada e menus suspensos que facilitam o preenchimento de dados, além de evitar erros de cadastro.

- Tela de Aluguel de Equipamentos
  A tela de aluguel de equipamentos permite que os usuários registrem novas transações de aluguel de maneira rápida e eficiente. O processo envolve a seleção do cliente, a escolha do equipamento, e a definição das datas de início e término do aluguel. O sistema calcula automaticamente o valor total do aluguel, exibindo todas as informações de forma clara antes de concluir a transação. A interface foi projetada para minimizar o tempo necessário para completar um aluguel e garantir que todos os detalhes estejam corretos.

- 



# Desenvolvimento e Investimento de Horas

Durante o desenvolvimento do software, foram investidas 36 horas distribuídas entre diferentes etapas do projeto. A refatoração do Projeto 01 consumiu 10 horas, com foco na melhoria do código existente e na preparação para as novas implementações. O planejamento e design da interface gráfica demandaram 8 horas, garantindo que a solução fosse intuitiva e alinhada com as necessidades do usuário final. A implementação das funcionalidades, que incluiu a adaptação das operações anteriores para a nova interface e a adição de novas capacidades, foi a etapa mais extensa, totalizando 12 horas de trabalho. Os testes e correções foram realizados em 4 horas, assegurando a qualidade e o bom funcionamento do sistema. Finalmente, 2 horas foram dedicadas à documentação e entrega do projeto, consolidando todas as informações necessárias para o uso e manutenção do software.

- Refatoração do Projeto 1 :10h
- Planejamento e Design da Interface:   08h
- Implementação das Funcionalidades:   12h
- Testes e Correções:   04h
- Documentação e Entrega:   02h
- Total:   24h
