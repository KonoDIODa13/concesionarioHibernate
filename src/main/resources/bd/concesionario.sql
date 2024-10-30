DROP DATABASE IF EXISTS concesionario;
CREATE DATABASE  concesionario;
USE concesionario;

CREATE TABLE coche (
  matricula varchar(50) NOT NULL,
  marca varchar(50) DEFAULT NULL,
   modelo varchar(50) DEFAULT NULL,
  tipo varchar(50) DEFAULT NULL,
  primary key (matricula)
);