create table people (
	id bigint not null auto_increment,
	name varchar(60) not null,
	surname varchar(255) not null,
	nickname varchar(60) not null,
	birth_date datetime not null,
	rg varchar(15) not null,
	cpf varchar(15) not null,
	email varchar(255) not null,
	phone varchar(20) not null,
	address varchar(255) not null,
	
	primary key(id)
);