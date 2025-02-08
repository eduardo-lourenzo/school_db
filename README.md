# School Data Base
Api simples de um banco de dados em Postgres.

A API tem o intuito de estudos na integração com o banco de dados relacional SQL.
A aplicação não têm tratamentos de erros voltados para o usuário final.
Além disso, as consultas são redundantes para demonstrar o uso do
JPA(Java Persistence API) e SQL(Structured Query Language) nativo. 

## Como Usar

### Pré-requisitos
Antes de começar, certifique-se de que você possui os seguintes requisitos instalados no seu ambiente:
- **Java 17** ou superior
- **Maven** para gerenciamento de dependências
- **PostgreSQL** como banco de dados
- Ferramenta para testar APIs, como **cURL**

**Sugestões:** Use a IDEA Intellij, 
com os plugins **.env files**(variáveis de ambiente) e **RestfulBox**(Ferramenta de API)

### Configuração do Banco de Dados
1. Certifique-se de que o PostgreSQL está instalado e em execução.
2. Execute o script do banco de dados chamado `criar_escola`.
3. Certifique-se que o Maven está instalado.
4. Execute o projeto.
5. Teste as rotas da API.

### Instalação
- Clone este repositório:
```bash
  git clone https://github.com/seu-usuario/school_db.git
  cd school_db
```
- Certifique-se de que o Maven está configurado corretamente no seu ambiente.
- Compile e baixe as dependências do projeto:
```bash
  mvn clean install
```

## Variáveis de Ambiente

As seguintes variáveis de ambiente são necessárias para o funcionamento do projeto:

| Variável       | Descrição                          | Exemplo     |
|----------------|------------------------------------|-------------|
| `DB_HOST`      | Endereço do host do banco de dados | `localhost` |
| `DB_PORT`      | Porta do banco de dados            | `5432`      |
| `DB_NAME`      | Nome do banco de dados             | `escola`    |
| `DB_USERNAME`  | Nome de usuário do banco de dados  | `admin`     |
| `DB_PASSWORD`  | Senha do banco de dados            | `admin`     |

### Exemplo de Configuração

Você pode configurar as variáveis de ambiente em um arquivo `.env` na raiz do projeto ou diretamente no ambiente do sistema operacional. Aqui está um exemplo de arquivo `.env`:

```env
DB_HOST=localhost
DB_PORT=5432
DB_NAME=escola
DB_USERNAME=admin
DB_PASSWORD=admin
```
## Configuração do Banco de Dados

Para configurar o banco de dados PostgreSQL e preparar o ambiente para a aplicação, siga os passos abaixo:

Certifique-se de que o PostgreSQL está instalado e em execução no seu ambiente. 
Em seguida, acesse o terminal do PostgreSQL.
Execute o script no PostgreSQL na raiz do projeto usando o comando:
```bash
  psql -U postgres -f school_db/criar_escola.sql
```
## Teste a Conexão

Após configurar o banco de dados e a aplicação, inicie a aplicação com o comando:
```bash
  mvn spring-boot:run
```
A aplicação estará disponível em http://localhost:8080 e pronta para interagir com os dados do banco de dados.

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

| Método HTTP | Endpoint                  | Descrição                                                 |
|-------------|---------------------------|-----------------------------------------------------------|
| GET         | `/alunos/sql`             | Retorna todos os alunos.                                  |
| GET         | `/alunos/sql/id/{id}`     | Retorna um aluno específico pelo ID.                      |
| GET         | `/alunos/sql/name/{name}` | Retorna uma lista de alunos com base no nome fornecido.   |
| GET         | `/alunos/sql/age/{age}`   | Retorna uma lista de alunos com base na idade fornecida.  |

## Estrutura de Dados

### **StudentEntity**
A entidade `StudentEntity` representa os dados de um aluno. Abaixo estão os campos esperados:

| Campo   | Tipo       | Exemplo       |
|---------|------------|---------------|
| `id`    | Long       | 1             |
| `name`  | String     | João da Silva |
| `age`   | Integer    | 15            |