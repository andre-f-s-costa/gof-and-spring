# Projeto de Padrões de Projeto: GoF e Spring

Este repositório é o resultado de um desafio prático focado na exploração e implementação de Padrões de Projeto (Design Patterns). A solução está dividida em duas partes principais:

- Padrões de Projeto GoF (Gang of Four):
  - Uma coleção de implementações dos padrões de projeto clássicos utilizando Java puro, para focar nos conceitos fundamentais.
- Padrões de Projeto com Spring:
  - Uma aplicação web simples usando Spring MVC e Spring Boot para demonstrar como o framework aplica e facilita o uso desses padrões de forma abstrata e poderosa.

## Estrutura do projeto

O projeto é organizado em dois diretórios principais para separar as duas abordagens.

### 1. Padrões de projeto GoF (Java puro)

Nesta seção, você encontrará implementações de alguns dos padrões de projeto mais conhecidos do Gang of Four. Cada padrão é implementado de forma isolada para facilitar o estudo e a compreensão de sua estrutura e propósito.

Padrões implementados:

- Singleton:
  - Garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a ela
- Strategy:
  - Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis.
- Facade:
  - Fornece uma interface unificada para um conjunto de interfaces em um subsistema, tornando o subsistema mais fácil de usar.

O foco aqui foi o código limpo e a clareza conceitual, sem as abstrações de frameworks.

### 2. Padrões de projeto com Spring Framework

Esta parte do projeto consiste em uma API REST simples desenvolvida com Spring Boot. O objetivo é demonstrar como o Spring utiliza padrões de projeto de forma implícita e como podemos usá-los para construir aplicações robustas e escaláveis.

Funcionalidades da API:

- Um CRUD (Create, Read, Update, Delete) simples para uma entidade de usuário.
- Injeção de Dependência para desacoplar componentes.
- Os próprios Beans do Spring, que por padrão são Singleton.
- Arquitetura em camadas (models, repositories, services, controllers).

Esta aplicação mostra como um framework moderno pode simplificar a implementação, permitindo que o desenvolvedor foque mais na regra de negócio.

## Tecnologias utilizadas

- Java 17+
- Maven (para gerenciamento de dependências do projeto Spring)
- Spring Boot
- Spring Boot DevTools
- Lombok (para redução de boilerplate)
- Spring Data JPA (para persistência de dados)
- H2 Database (banco de dados em memória)

## Como executar os projetos

Antes de mais nada **clone o repositório!**

### Executando os exemplos GoF (Java Puro)

- Navegue até o diretório dos padrões GoF
- Compile e execute a classe principal de cada padrão. Por exemplo, para o padrão Strategy.

### Executando o projeto spring

- Navegue até o diretório do projeto Spring
- Execute a aplicação usando o botão de "play" da sua IDE.
- Após a inicialização, a aplicação estará disponível em http://localhost:8080. Você pode usar uma ferramenta como o Postman ou o Insomnia para interagir com os endpoints da API.
