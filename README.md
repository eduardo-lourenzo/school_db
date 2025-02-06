# School Data Base
Api simples de um banco de dados em Postgres

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
