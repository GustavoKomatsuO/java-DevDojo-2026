
# Java DevDojo 2026 

Repositório dedicado ao **estudo prático de Java**, acompanhando a **Maratona Java — Virado no Jiraya (DevDojo)** e um roteiro de evolução até **Spring Boot**.

> **Objetivo:** construir uma base sólida em Java para desenvolver o backend de um **sistema de streaming de música**. Este repositório registra o aprendizado; **não é a aplicação de streaming pronta**.

##  Objetivo para este estudo de Java

O objetivo vai além dos exercícios da linguagem: aplicar os conceitos em uma **API REST para streaming musical**, responsável por funcionalidades como:

- Cadastro e consulta de **artistas, álbuns e músicas**;
- Gerenciamento de **usuários e playlists**;
- **Autenticação e autorização** de acesso;
- Persistência de dados em **MySQL**;
- **Upload, armazenamento e reprodução de áudio** via servidor;
- Integração futura com **painel administrativo em PHP**, aplicação web e aplicativo Android.

A reprodução **offline no Android**, com download local e sincronização, faz parte da evolução posterior do sistema.

O estudo de classes, objetos e métodos ajuda a modelar músicas e artistas; encapsulamento e validações protegem as regras do domínio; coleções organizam catálogos e playlists; e Spring Boot permitirá disponibilizar esses recursos por uma API.

##  Conteúdo do repositório

Exercícios e experimentos em Java, organizados em `src/modulos/`:

| Diretório | Conteúdo |
| --- | --- |
| [`introducaoBasicoExercicios`](src/modulos/introducaoBasicoExercicios) | Condicionais, laços e exercícios de lógica |
| [`introducaoClasses`](src/modulos/introducaoClasses) | Classes, objetos, atributos e instanciação |
| [`introducaoMetodos`](src/modulos/introducaoMetodos) | Métodos, parâmetros, retorno, `this`, arrays, varargs e encapsulamento |
| [`sobrecargaMetodos`](src/modulos/sobrecargaMetodos) | Sobrecarga de métodos e reutilização da inicialização com diferentes parâmetros |
| [`construtores`](src/modulos/construtores) | Inicialização de objetos, sobrecarga de construtores e encadeamento com `this(...)` |
| [`blocosDeInicializacao`](src/modulos/blocosDeInicializacao) | Blocos de inicialização de instância e preparação de atributos antes do corpo do construtor |
| [`modificadorEstatico`](src/modulos/modificadorEstatico) | Atributos e métodos `static`, estado compartilhado entre instâncias e blocos estáticos |

Nos exercícios de métodos há exemplos com `Calculadora`, `Estudante`, `Pessoa` e `Funcionario`, incluindo passagem de argumentos, getters/setters e cálculo de média salarial.

Os módulos de sobrecarga, construtores e inicialização utilizam a classe `Anime`. O módulo de modificadores estáticos também inclui `Carro`, demonstrando a diferença entre atributos de cada objeto e valores compartilhados pela classe.

obs: Depois vou atualizando enquanto o estudo progride.

##  Roteiro de estudos

O planejamento de **5 semanas (12/10 a 14/11/2026)** prevê **30 dias de 3 horas**, totalizando **90 horas** entre estudo e prática.

| Semana | Foco | Aplicação prevista |
| --- | --- | --- |
| **1** | POO: classes, métodos, encapsulamento, associações e herança | Primeiros modelos do catálogo musical |
| **2** | Interfaces, polimorfismo, exceções e coleções | Organização de faixas, playlists e armazenamento |
| **3** | Generics, lambdas, Streams, testes e início do Spring | Projeto integrador de POO e introdução à injeção de dependência |
| **4** | API REST, JPA, MySQL, migrations e testes | CRUD de artistas, álbuns e músicas |
| **5** | Spring Security, autenticação, upload e streaming | Login, playlists protegidas e reprodução de áudio |

**Meta do roteiro:** chegar a uma primeira **API local** com catálogo, login, playlists e ao menos uma faixa reproduzível. A implementação completa, especialmente o offline, exige continuidade após essas cinco semanas.

##  Ferramentas de estudo

**Em uso nesta etapa de estudos**
- Java
- IntelliJ IDEA
- Git e GitHub

**Previstas para o desenvolvimento do streaming**
- Java 17;
- Spring Boot 4, Spring Web, Spring Data JPA e Spring Security;
- Maven, MySQL, e JUnit;
- API REST para integração com PHP, web e Android.


##  Como executar os exercícios

1. Clone o repositório:
   ```bash
   git clone https://github.com/GustavoKomatsuO/java-DevDojo-2026.git
   ```
2. Abra a pasta no **IntelliJ IDEA** com um JDK configurado.
3. Acesse `src/modulos/` e escolha um exemplo com método `main` (por exemplo, `introducaoMetodos/test/Calculadora/CalculadoraMain.java`).
4. Execute a classe pelo botão **Run** da IDE.

Cada exercício é independente; ainda não há uma aplicação Spring Boot executável neste repositório.

##  Organização e evolução

O histórico de commits e as branches documentam a evolução dos estudos, com exemplos práticos e pequenas melhorias no código. Novos assuntos serão acrescentados conforme o avanço no roteiro.

**Projeto de referência para a aplicação final:** [Streaming de Música](https://github.com/KusKusDosKlan/streaming_de_musica).

---

**Finalidade:** estudar Java com prática contínua, consolidar Programação Orientada a Objetos e adquirir a base necessária para implementar um backend de streaming musical com Spring Boot.
