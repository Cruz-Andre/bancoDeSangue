create database bancoDeSangue;

use bancoDeSangue;

create table login (
	idLogin bigint primary key auto_increment,
	usrLogin varchar(50) unique not null,
    senhaLogin varchar(50) not null
);

create table doador (
	idDoador bigint primary key auto_increment,
	nomeDoador varchar(50) not null,
    dataNascimentoDoador date not null,
    tipoSanguinioDoador varchar(3) not null,
    emailDoador varchar(50) unique not null,	
	enderecoBairroDoador varchar(50) not null,
	enderecoCidadeDoador varchar(50) not null,
	enderecoUFdoador varchar(2) not null
);

-- chave estrangeira idLogin na tabela login. referencia o idDoador da tabela doador.
alter table login add constraint FK_login_doador
foreign key (idLogin) references doador (idDoador);

describe login;
describe doador;

select * from login;
select * from doador;

-- drop table login;
-- drop table doador;


create table hospital (
	idHosp bigint primary key auto_increment,
    nomeHosp varchar(100) not null,
    qtdSangueAMais int not null,
    qtdSangueAMenos int not null,
    qtdSangueBMais int not null,
    qtdSangueBMenos int not null,
    qtdSangueABMais int not null,
    qtdSangueABMenos int not null,
    qtdSangueOMais int not null,
    qtdSangueOMenos int not null
);

insert into hospital values
	(null, 'Hospital Santa Casa', 2, 3, 4, 4, 5, 4, 8, 8),
    (null, 'Hospital do Vale', 33, 44, 14, 14, 53, 44, 18, 18),
    (null, 'Hospital Sententrional', 20, 30, 40, 40, 50, 40, 80, 80),
    (null, 'Hospital Pronto Socorro', 12, 23, 34, 34, 15, 4, 12, 2),
    (null, 'Hospital Jesus', 12, 13, 14, 14, 15, 14, 18, 18);

describe hospital;
select * from hospital;