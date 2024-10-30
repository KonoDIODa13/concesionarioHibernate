DROP DATABASE IF EXISTS conecesionario;
CREATE DATABASE  conecesionario;
USE conecesionario;

CREATE TABLE  coche (
  matricula varchar(50) NOT NULL,
  marca varchar(50) DEFAULT NULL,
   modelo varchar(50) DEFAULT NULL,
  tipo varchar(50) DEFAULT NULL,
  primary key matricula
);