# **Sistema de Coleta e Análise de Dados de Produção (Sistema IoT)**

**Contexto:**

Imagine uma fábrica de produção de peças para automóveis. O processo de produção envolve diversas etapas, desde o recebimento da matéria-prima até a embalagem do produto. Para garantir a qualidade e a eficiência da produção, a fábrica precisa monitorar em tempo real dados como:

- Tempo de ciclo: Tempo necessário para completar cada etapa do processo.
- Quantidade de peças produzidas: Quantidade de peças produzidas em um determinado período.
- Taxa de defeitos: Porcentagem de peças defeituosas em relação à produção total.
- Consumo de energia: Consumo de energia em cada etapa da produção.

Atualmente, a fábrica utiliza um sistema manual para coletar esses dados, o que é ineficiente, sujeito a erros e dificulta a análise da performance da produção.

A necessidade: desenvolver um sistema de coleta e análise de dados de produção automatizado, conectado a sensores instalados na linha de produção, que permita a visualização em tempo real e a geração de relatórios para tomada de decisões estratégicas.

**Requisitos:**

- Linguagem de programação: Java
- IDE: IntelliJ IDEA
- Banco de dados: SQLite (ou outro banco de dados leve, caso necessário)
- Sensores: Simulados (ex: gerar dados de tempo de ciclo, produção, defeitos, consumo de energia de forma aleatória para testes) ou reais, caso a instituição possua acesso a equipamentos de simulação.
- **Interface: Dashboard web com gráficos e tabelas para visualização em tempo real dos dados coletados.**
- **Relatórios: Possibilidade de gerar relatórios personalizados (ex: relatórios de produção diária, relatórios de performance por etapa, relatórios de consumo energético).**
- **Funcionalidades:**
    - Coleta de Dados: Integrar o sistema com os sensores da linha de produção (simulados ou reais) para coletar dados em tempo real.
    - Armazenamento de Dados: Armazenar os dados coletados em um banco de dados de forma organizada e eficiente.
    - Visualização em Tempo Real: Exibir os dados coletados em um dashboard web com gráficos e tabelas, permitindo a visualização da performance da produção em tempo real.
    - Geração de Relatórios: Permitir a geração de relatórios personalizados com base nos dados coletados, facilitando a análise da produção e a tomada de decisões.

**Entregas Esperadas:**

- Documentação do projeto: Escreva um documento explicando a arquitetura do sistema, o código desenvolvido, as tecnologias utilizadas, os testes realizados e as funcionalidades implementadas.
- **Código fonte: Entregue o código fonte completo do projeto, devidamente comentado.**
- **Dashboard Web: Apresente o dashboard web com a visualização dos dados em tempo real.**
- **Relatórios: Crie exemplos de relatórios personalizados que podem ser gerados pelo sistema (ex: relatório de produção diária, relatório de performance por etapa, relatório de consumo energético).**
- Apresentação: Apresente o projeto para a turma, explicando os principais aspectos do desenvolvimento, as funcionalidades implementadas e os desafios superados.

**Etapas do projeto:**

1. Planejamento e Design:
    - Definição da arquitetura do sistema (camadas, classes, interfaces, etc.)
    - Escolha de tecnologias para coleta de dados (APIs, protocolos, etc.)
    - Definição do banco de dados e do modelo de dados.
    - **Criação do design do dashboard e dos relatórios.**
    - Planejamento dos Testes:
        - Definição dos Casos de Teste: Identificar os casos de teste para cada módulo do sistema, considerando testes unitários e integrados.
        - Elaboração de Testes Unitários: Criar testes unitários para cada função e método do código, garantindo que as unidades individuais do código estejam funcionando corretamente.
        - Elaboração de Testes Integrados: Desenvolver testes integrados para verificar a interação entre diferentes módulos do sistema, garantindo que as diferentes partes do código estejam funcionando em conjunto como esperado.
2. Implementação:
    - Codificação do sistema seguindo os paradigmas de programação escolhidos (orientação a objetos, etc.).
    - Implementação da coleta de dados de sensores (simulados ou reais).
    - Integração do sistema com o banco de dados.
    - **Desenvolvimento da interface web do dashboard e dos relatórios.**
    - Implementação dos Testes:
        - Implementação dos Testes Unitários: Criar testes unitários para cada classe e método do sistema, utilizando frameworks de testes unitários.
        - Implementação dos Testes Integrados: Desenvolver testes integrados para verificar a integração entre diferentes módulos do sistema, utilizando frameworks de testes integrados.
3. Testes e Validação:
    - Execução dos Testes Unitários e Integrados: Executar os testes unitários e integrados para identificar e corrigir erros no código.
    - Análise dos Resultados dos Testes: Analisar os resultados dos testes para identificar áreas que precisam de melhorias.
    - Ajustes no Código: Corrigir erros e implementar as melhorias necessárias com base nos resultados dos testes.
    - Reexecução dos Testes: Reexecutar os testes unitários e integrados para garantir que as correções implementadas resolveram os problemas.
4. Integração e Entrega Contínua (CI/CD):
    - Configurar um pipeline CI/CD (ex: Jenkins, Travis CI) para automatizar o processo de build, teste e deploy do sistema.
    - Integração de Testes com CI/CD: Integrar os testes unitários e integrados com o pipeline CI/CD, garantindo que os testes sejam executados automaticamente em cada build.
5. Documentação e Apresentação:
    - Documentação completa do projeto, incluindo a arquitetura do sistema, o código desenvolvido, as tecnologias utilizadas, os testes realizados e as funcionalidades implementadas.
    - Apresentação do projeto para a turma, explicando os principais aspectos do desenvolvimento, as funcionalidades implementadas e os desafios superados.

**Dicas para o desenvolvimento do projeto:**

- Contextualização: É importante que os alunos escolham um projeto que seja relevante para a indústria local e que possa ser aplicado em um contexto real.
- Divisão de Tarefas: Incentive os alunos a trabalharem em equipe, dividindo as tarefas de forma organizada.
- Ferramentas de CI/CD: Utilize ferramentas de CI/CD para automatizar os testes e a entrega do sistema, mostrando aos alunos a importância da integração contínua.
- Banco de dados: Utilize o SQLite para armazenamento de dados, facilitando a instalação e o gerenciamento do projeto.
- Sensores Simulados: Caso não haja sensores reais, desenvolva código para simular os dados de produção para testar o sistema.
- Interface Web: Utilize um framework web leve como Spring Boot ou Spring MVC para a construção do dashboard.
- Visualização de dados: Utilizar bibliotecas de gráficos (ex: Chart.js) para criar dashboards interativos.