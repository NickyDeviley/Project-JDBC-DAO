# Project-JDBC-DAO - Implementação do padrão DAO em Java puro com integração ao banco de dados MariaDB via JDBC.

# Descrição:

Este projeto foi desenvolvido durante o acompanhamento do curso completo e profissional de Java do instrutor Nélio Alves. O objetivo principal é consolidar os fundamentos de persistência de dados em aplicações orientadas a objetos, aplicando manualmente o padrão arquitetural DAO (Data Access Object). O projeto resolve o desafio de desacoplar as regras de negócio da camada de acesso aos dados, utilizando a API JDBC nativa para executar comandos SQL diretamente e gerenciar conexões, transações e mapeamento manual de entidades sem o auxílio de frameworks ORM (como JPA/Hibernate).

# Pré-requisitos:

    Linguagem: Java (JDK 11 ou superior).

    Banco de Dados: MariaDB (ou MySQL) instalado e em execução.

    Driver: Driver JDBC do MySQL/MariaDB (gerenciado via Maven ou adicionado ao Build Path).

    IDE: Eclipse IDE, IntelliJ IDEA ou Visual Studio Code.

    Gerenciador de Dependências: Maven (recomendado).

# Instalação/Uso:

    Clone este repositório em sua máquina local:
    Bash

    git clone https://github.com/seu-usuario/Project-JDBC-DAO.git

    Configure o banco de dados no MariaDB, criando o schema necessário conforme os scripts ou orientações presentes no projeto.

    Insira as credenciais de acesso (URL do banco, usuário e senha) no arquivo de propriedades de conexão (db.properties).

    Abra o projeto na sua IDE de preferência.

    Certifique-se de que as dependências do driver JDBC estão configuradas corretamente.

    Localize a classe principal contendo o método main e execute a aplicação para testar as operações de CRUD integradas ao banco de dados.

# Tecnologias:

    Java (Lógica principal e Orientação a Objetos)

    JDBC API (Comunicação nativa com o banco de dados)

    Padrão DAO (Arquitetura de persistência de dados)

    MariaDB (Banco de dados relacional)

    Maven (Gerenciamento de dependências e build)

# Licença:

MIT License
