CREATE DATABASE produtosCompass;

CREATE TABLE produto(
	id int not null auto_increment primary key,
    nome varchar(30),
    descricao varchar(100),
    quantidade int,
    preco decimal(19,2)
    )ENGINE=InnoDB;

SELECT * FROM produtoscompass.produto;
