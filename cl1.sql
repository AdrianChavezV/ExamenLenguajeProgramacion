CREATE DATABASE cl1;
USE cl1;

CREATE TABLE Subject (
idSubject int auto_increment primary key,
subject varchar(45) not null,
credits varchar(45) not null
);

INSERT INTO Subject VALUES (null, "Matematicas", "5");

select * from Subject