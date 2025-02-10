# School Data Base

API simples de um banco de dados em PostgreSQL.

A API visa servir de estudo para integração com bancos de dados relacionais SQL.  
A aplicação **não tem** tratamentos de erros voltados para o usuário final.  
Além disso, as consultas são redundantes para demonstrar o uso do **JPA (Java Persistence API)** e **SQL (Structured Query Language)** nativo.

---

## **Índice**

1. [Pré-requisitos](#pré-requisitos)
2. [Instalação](#instalação)
3. [Configuração do Banco de Dados](#configuração-do-banco-de-dados)
4. [Variáveis de Ambiente](#variáveis-de-ambiente)
5. [Testando a Aplicação](#testando-a-aplicação)
6. [Endpoints](#endpoints)
7. [Estrutura de Dados](#estrutura-de-dados)

---

## Pré-requisitos

Antes de começar, certifique-se de que você possui os seguintes requisitos instalados no seu ambiente:

- [**Java 17**](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) ou superior
- [**Maven**](https://maven.apache.org/download.cgi) para gerenciamento de dependências
- [**PostgreSQL**](https://www.postgresql.org/download/) como banco de dados
- Ferramenta para testar APIs, como [**Postman**](https://www.postman.com/downloads/) ou [**cURL**](https://curl.se/download.html)

> **Sugestão:** Utilize a IDE [**IntelliJ IDEA**](https://www.jetbrains.com/idea/download/) com os plugins:
> - [**.env files**](https://plugins.jetbrains.com/plugin/9525--env-files) (para variáveis de ambiente)
> - [**RestfulBox - API**](https://plugins.jetbrains.com/plugin/14723-restfulbox--api) (para testes de API)

---

## Instalação

1. Clone este repositório:
   ```bash
   git clone https://github.com/eduardo-lourenzo/school_db.git
   cd school_db
2. Certifique-se de que o Maven está configurado corretamente no seu ambiente.
3. Compile o projeto e baixe as dependências:
    ```bash
   mvn clean install

---

## Configuração do Banco de Dados

1. Certifique-se de que o PostgreSQL está instalado e em execução no seu ambiente.
2. Execute o script SQL para criar o banco de dados e as tabelas:
   ```bash
   psql -U postgres -f criar_escola.sql
3. Configure as variáveis de ambiente necessárias [(veja a seção Variáveis de Ambiente)](#variáveis-de-ambiente).

---

## Variáveis de Ambiente

As seguintes variáveis de ambiente são necessárias para o funcionamento do projeto:

| Variável      | Descrição                          | Exemplo     |
|---------------|------------------------------------|-------------|
| `DB_HOST`     | Endereço do host do banco de dados | `localhost` |
| `DB_PORT`     | Porta do banco de dados            | `5432`      |
| `DB_NAME`     | Nome do banco de dados             | `escola`    |
| `DB_USERNAME` | Nome de usuário do banco de dados  | `admin`     |
| `DB_PASSWORD` | Senha do banco de dados            | `admin`     |

### Exemplo de Configuração

Você pode configurar as variáveis de ambiente em um arquivo `.env` na raiz do projeto ou diretamente no ambiente do
sistema operacional. Aqui está um exemplo de arquivo `.env`:

```env
DB_HOST=localhost
DB_PORT=5432
DB_NAME=escola
DB_USERNAME=admin
DB_PASSWORD=admin
```

---

## Testando a Aplicação

Após configurar o banco de dados e as variáveis de ambiente, inicie a aplicação com o seguinte comando:

```bash
  mvn spring-boot:run
```
A aplicação será iniciada e estará disponível no endereço padrão:

http://localhost:8080

Agora, você pode interagir com os dados do banco de dados utilizando os endpoints disponíveis.

   > **Nota:** Certifique-se de que o banco de dados está em execução e  
   > que as variáveis de ambiente estão configuradas corretamente  
   > antes de iniciar a aplicação.  

---

## Endpoints

### **JPA Endpoints**

Estes endpoints utilizam o JPA para acessar os dados.

| Método HTTP | Endpoint                  | Descrição                                                |
|-------------|---------------------------|----------------------------------------------------------|
| GET         | `/alunos/jpa`             | Retorna todos os alunos.                                 |
| GET         | `/alunos/jpa/id/{id}`     | Retorna um aluno específico pelo ID.                     |
| GET         | `/alunos/jpa/name/{name}` | Retorna uma lista de alunos com base no nome fornecido.  |
| GET         | `/alunos/jpa/age/{age}`   | Retorna uma lista de alunos com base na idade fornecida. |

### **SQL Endpoints**

Estes endpoints utilizam consultas SQL para acessar os dados.

| Método HTTP | Endpoint                  | Descrição                                                |
|-------------|---------------------------|----------------------------------------------------------|
| GET         | `/alunos/sql`             | Retorna todos os alunos.                                 |
| GET         | `/alunos/sql/id/{id}`     | Retorna um aluno específico pelo ID.                     |
| GET         | `/alunos/sql/name/{name}` | Retorna uma lista de alunos com base no nome fornecido.  |
| GET         | `/alunos/sql/age/{age}`   | Retorna uma lista de alunos com base na idade fornecida. |

---

## Estrutura de Dados

### **StudentEntity**

A entidade StudentEntity representa os dados de um aluno no sistema. Ela é mapeada para uma tabela no banco de dados e contém os seguintes campos:

| Campo  | Tipo    | Exemplo       |
|--------|---------|---------------|
| `id`   | Long    | 1             |
| `name` | String  | João da Silva |
| `age`  | Integer | 15            |