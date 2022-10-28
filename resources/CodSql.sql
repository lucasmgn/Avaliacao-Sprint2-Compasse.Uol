-- SQL da questão 1 -->

CREATE DATABASE produtosCompass;

CREATE TABLE produto(
	id int not null auto_increment primary key,
    nome varchar(30),
    descricao varchar(100),
    quantidade int,
    preco decimal(19,2)
    )ENGINE=InnoDB;

SELECT * FROM produtoscompass.produto;



-- SQL da questão 2 -->

CREATE DATABASE filmesCompass;

CREATE TABLE filme(
	id int not null auto_increment primary key,
    nome varchar(30),
    descricao varchar(100),
    ano int
    )ENGINE=InnoDB;