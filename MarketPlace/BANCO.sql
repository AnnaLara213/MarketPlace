create database poo;
use poo;

create table vendedores(
	id int AUTO_INCREMENT,
	nome varchar(60)  not null,
    email varchar(60) not null,
    cpf varchar(60) not null,
    telefone varchar(9) not null,
    CONSTRAINT pk_ex_cliente PRIMARY KEY (id)
);

create table usuarios(
	id int AUTO_INCREMENT,
	nome varchar(60)  not null,
    email varchar(60) not null,
    cpf varchar(60) not null,
    telefone varchar(9) not null,
    CONSTRAINT pk_ex_usuarios PRIMARY KEY (id)
);

create table administradores(
	id int AUTO_INCREMENT,
	nome varchar(60)  not null,
    email varchar(60) not null,
    cpf varchar(60) not null,
    telefone varchar(9) not null,
    CONSTRAINT pk_ex_administradores PRIMARY KEY (id)
);

create table produtos(
	id int AUTO_INCREMENT,
	nome varchar(60)  not null,
    preco varchar(60) not null,
    descricao varchar(60) not null,
    CONSTRAINT pk_ex_produtos PRIMARY KEY (id)
);

DROP TABLE vendedores;
DROP TABLE usuarios;
DROP TABLE produtos;
DROP TABLE administradores;

INSERT INTO vendedores  VALUES (0 ,'Francisca', 'aaaa@sss', '111.111.111-11', '999999');
INSERT INTO vendedores  VALUES (0 ,'Carlos', 'PPPPP@sss', '222.222.222-22','44444');
INSERT INTO usuarios  VALUES (0 ,'Anna', 'Anna', 'Anna','Anna');
INSERT INTO administradores  VALUES (0 ,'ADMADMADM', 'ADMADMADM', 'ADMADMADM','ADMADMADM');
INSERT INTO produtos  VALUES (0 ,'PRODPRODPROD', 'PRODPRODPROD', 'PRODPRODPROD');