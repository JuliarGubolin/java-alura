CREATE TABLE autor (
	id INTEGER auto_increment primary key,
    nome VARCHAR(50) not null,
    email VARCHAR(50) not null
);

alter table nota add column autor_id integer;
alter table nota add foreign key (autor_id) references autor (id);

insert into autor (nome, email) values ('Julia Gubolin', 'julia.gubolin@gmail.com');
insert into autor (nome, email) values ('Marcos Alberto', 'marcos.alberto@gmail.com');

create table nota (
	id INTEGER auto_increment primary key,
    titulo VARCHAR(50) not null,
    descricao VARCHAR(50) not null
);

insert into nota (titulo, descricao, autor_id) values ('Lista de compras', 'arruz, feijão', 1);
insert into nota (titulo, descricao, autor_id) values ('Lista de tarefas', 'arrumar cama, limpar privada', 2);