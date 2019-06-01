create table user
(
   id integer not null,
   userId varchar(255) not null,
   name varchar(255) not null,
   password varchar(255),
   email varchar(255),
   primary key(id)
);