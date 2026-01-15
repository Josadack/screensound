# ScreenSound

Projeto desenvolvido como **desafio da Alura**, realizado após a conclusão do conteúdo **Java: Persistência de Dados e Consultas com Spring Data JPA**.

Este projeto demonstra a integração de uma aplicação Java com o **Google Gemini AI** utilizando a biblioteca **LangChain4j**, permitindo a consulta de informações sobre artistas de forma dinâmica.

---

## 📌 Objetivo do Projeto

O projeto **ScreenSound** é uma aplicação Java com Spring Boot executada em modo **console**, cujo objetivo é gerenciar artistas e músicas, utilizando **Spring Data JPA** para persistência de dados e integrando **IA generativa (Google Gemini)** para enriquecimento das informações.

Ele foi desenvolvido como **desafio da Alura**, após a conclusão do conteúdo *Java: Persistência de Dados e Consultas com Spring Data JPA*.

---

## 🧠 Funcionalidades

A aplicação funciona por meio de um **menu interativo no terminal**, permitindo ao usuário:

1. Cadastrar artistas (SOLO, DUPLA, BANDA ou ORQUESTRA)
2. Cadastrar músicas vinculadas a um artista
3. Listar todas as músicas cadastradas
4. Buscar músicas por artista (consulta JPQL)
5. Pesquisar dados sobre um artista utilizando **Google Gemini AI**

---

## 🧩 Integração com Google Gemini (ConsultaGemini)

A classe **ConsultaGemini** é responsável por integrar a aplicação com o modelo **Google Gemini**, utilizando a biblioteca **LangChain4j**.

Ela recebe o nome de um artista e retorna informações geradas por IA, enriquecendo a experiência do usuário.

### Configuração do modelo:

* **Model:** gemini-1.5-flash
* **Temperature:** 0.7
* **Max tokens:** 1000
* **API Key:** variável de ambiente

---

## 🔐 Variável de Ambiente

Antes de executar o projeto, é necessário configurar a variável de ambiente:

```
GEMINI_APIKEY=SUA_CHAVE_DE_API_AQUI
```

Essa abordagem garante mais segurança e evita expor a chave diretamente no código.

---

## 📂 Estrutura do Projeto

```
📦 src/main/java
 └── br/com/alura/screensound
     ├── ScreensoundApplication.java   # Classe principal (Spring Boot + CommandLineRunner)
     ├── principal
     │   └── Principal.java            # Menu interativo e regras de negócio
     ├── model
     │   ├── Artista.java              # Entidade Artista
     │   ├── Musica.java               # Entidade Música
     │   └── TipoArtista.java          # Enum de tipos de artista
     ├── repository
     │   └── ArtistaRepository.java    # Repositório JPA + JPQL
     └── service
         └── ConsultaGemini.java       # Integração com Google Gemini
```

---

## 🛠️ Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven
* Banco de Dados Relacional
* LangChain4j
* Google Gemini AI

---

## 🚀 Como Executar o Projeto

1. Clone o repositório
2. Configure a variável de ambiente `GEMINI_APIKEY`
3. Execute a aplicação via Spring Boot
4. Utilize a funcionalidade que dispara a consulta ao Gemini

---

## 📚 Aprendizados

* Consumo de IA generativa em Java
* Uso de APIs externas com tratamento de erros
* Boas práticas de organização de serviços
* Segurança no uso de chaves de API

---

## ✍️ Autor

Projeto desenvolvido como parte da formação Java da **Alura**.
