-- Criação do banco de dados
CREATE DATABASE escola;

-- Conecte-se ao banco de dados criado
\c escola;

-- Criação da tabela alunos
CREATE TABLE alunos (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(127),
    idade INTEGER
);

-- Inserção dos alunos
INSERT INTO alunos (nome, idade) VALUES
('João Silva', 15),
('Maria Oliveira', 16),
('Pedro Santos', 14),
('Ana Costa', 17),
('Lucas Almeida', 15),
('Beatriz Souza', 16),
('Gabriel Lima', 14),
('Larissa Rocha', 17),
('Rafael Martins', 15),
('Juliana Pereira', 16),
('Felipe Carvalho', 14),
('Camila Ribeiro', 17),
('Vinícius Fernandes', 15),
('Isabela Monteiro', 16),
('Gustavo Azevedo', 14),
('Sofia Nascimento', 17),
('Matheus Barros', 15),
('Fernanda Teixeira', 16),
('Leonardo Mendes', 14),
('Carolina Duarte', 17),
-- Novos alunos com idades entre 5 e 13 anos
('Arthur Borges', 5),
('Helena Farias', 6),
('Enzo Castro', 7),
('Alice Cardoso', 8),
('Theo Almeida', 9),
('Laura Martins', 10),
('Heitor Costa', 11),
('Manuela Rocha', 12),
('Bernardo Lima', 13),
('Valentina Santos', 5),
('Davi Oliveira', 6),
('Sophia Ribeiro', 7),
('Miguel Monteiro', 8),
('Clara Duarte', 9),
('Samuel Mendes', 10),
('Elisa Teixeira', 11),
('Henrique Barros', 12),
('Luiza Fernandes', 13),
('Daniel Carvalho', 5),
('Melissa Azevedo', 6),
('Lucas Nascimento', 7),
('Isadora Pereira', 8),
('Victor Almeida', 9);

-- Verificação dos dados inseridos
SELECT * FROM alunos;