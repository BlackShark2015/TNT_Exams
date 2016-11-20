/*
Nombre Base de datos: blackshark
Fecha Creacion Script: 19/11/2016
Motor Base de Datos PostgreSql 9.5
*/

-- -----------------------------------------------------
-- Table Usuarios
-- -----------------------------------------------------
DROP TABLE IF EXISTS Usuarios ;


CREATE TABLE Usuarios (
  idUsuario serial NOT NULL,
  identificacion VARCHAR(20) NULL  ,
  Nombre VARCHAR(150) NULL  ,
  Email VARCHAR(45) NULL  ,
  Password VARCHAR(45) NOT NULL  ,
  FechaNacimiento DATE NULL  ,
  UserName VARCHAR(45) NOT NULL  ,
  idPerfil INT NULL  ,
  PRIMARY KEY (idUsuario)   );




-- -----------------------------------------------------
-- Table Materias
-- -----------------------------------------------------
DROP TABLE IF EXISTS Materias ;


CREATE TABLE IF NOT EXISTS Materias (
  idMateria serial NOT NULL ,
  Nombre VARCHAR(45) NULL  ,
  PRIMARY KEY (idMateria)   );




-- -----------------------------------------------------
-- Table Temas
-- -----------------------------------------------------
DROP TABLE IF EXISTS Temas ;


CREATE TABLE IF NOT EXISTS Temas (
  idTema serial NOT NULL ,
  idMateria INT NULL  ,
  Nombre VARCHAR(45) NULL  ,
  Materias_idMateria serial NOT NULL  ,
  PRIMARY KEY (idTema, Materias_idMateria)   );




-- -----------------------------------------------------
-- Table Complejidads
-- -----------------------------------------------------
DROP TABLE IF EXISTS Complejidads ;


CREATE TABLE IF NOT EXISTS Complejidads (
  idComplejidad serial NOT NULL ,
  Nombre VARCHAR(45) NULL  ,
  Descripcion VARCHAR(200) NULL  ,
  PRIMARY KEY (idComplejidad)   );




-- -----------------------------------------------------
-- Table TipoPreguntas
-- -----------------------------------------------------
DROP TABLE IF EXISTS TipoPreguntas ;


CREATE TABLE IF NOT EXISTS TipoPreguntas (
  idTipoPreguntas serial NOT NULL ,
  Nombre VARCHAR(45) NULL  ,
  Descripcion VARCHAR(200) NULL  ,
  PRIMARY KEY (idTipoPreguntas)   );




-- -----------------------------------------------------
-- Table Preguntas
-- -----------------------------------------------------
DROP TABLE IF EXISTS Preguntas ;


CREATE TABLE IF NOT EXISTS Preguntas (
  idPregunta serial NOT NULL ,
  Pregunta VARCHAR(500) NULL  ,
  Temas_idTema serial NOT NULL  ,
  Temas_Materias_idMateria serial NOT NULL  ,
  Complejidads_idComplejidad serial NOT NULL  ,
  TipoPreguntas_idTipoPreguntas serial NOT NULL  ,
  PRIMARY KEY (idPregunta, Temas_idTema, Temas_Materias_idMateria, Complejidads_idComplejidad, TipoPreguntas_idTipoPreguntas)   );




-- -----------------------------------------------------
-- Table Respuestas
-- -----------------------------------------------------
DROP TABLE IF EXISTS Respuestas ;


CREATE TABLE IF NOT EXISTS Respuestas (
  idRespuestas serial NOT NULL ,
  Respuesta VARCHAR(300) NULL  ,
  Correcta BIT NULL  ,
  Preguntas_idPregunta serial NOT NULL  ,
  Preguntas_Temas_idTema serial NOT NULL  ,
  Preguntas_Temas_Materias_idMateria serial NOT NULL  ,
  PRIMARY KEY (idRespuestas, Preguntas_idPregunta, Preguntas_Temas_idTema, Preguntas_Temas_Materias_idMateria)   );




-- -----------------------------------------------------
-- Table Examenes
-- -----------------------------------------------------
DROP TABLE IF EXISTS Examenes ;


CREATE TABLE IF NOT EXISTS Examenes (
  idExamen serial NOT NULL ,
  Nombre VARCHAR(45) NULL  ,
  CantidadPreguntas INT NULL  ,
  Estado BIT NULL  ,
  PRIMARY KEY (idExamen)   );




-- -----------------------------------------------------
-- Table DescripcionExamenes
-- -----------------------------------------------------
DROP TABLE IF EXISTS DescripcionExamenes ;


CREATE TABLE IF NOT EXISTS DescripcionExamenes (
  idDescripcionExamen serial NOT NULL ,
  CantidadPreguntaTema INT NULL  ,
  Porcentage decimal NULL  ,
  Examenes_idExamen serial NOT NULL  ,
  Preguntas_idPregunta serial NOT NULL  ,
  Preguntas_Temas_idTema serial NOT NULL  ,
  Preguntas_Temas_Materias_idMateria serial NOT NULL  ,
  Preguntas_Complejidads_idComplejidad serial NOT NULL  ,
  Preguntas_TipoPreguntas_idTipoPreguntas serial NOT NULL  ,
  PRIMARY KEY (idDescripcionExamen, Examenes_idExamen, Preguntas_idPregunta, Preguntas_Temas_idTema, Preguntas_Temas_Materias_idMateria, Preguntas_Complejidads_idComplejidad, Preguntas_TipoPreguntas_idTipoPreguntas)   );




-- -----------------------------------------------------
-- Data for table Complejidads
-- -----------------------------------------------------
START TRANSACTION;

INSERT INTO Complejidads (idComplejidad, Nombre, Descripcion) VALUES (DEFAULT, 'Facil', 'Facil');
INSERT INTO Complejidads (idComplejidad, Nombre, Descripcion) VALUES (DEFAULT, 'Normal', 'Normal');
INSERT INTO Complejidads (idComplejidad, Nombre, Descripcion) VALUES (DEFAULT, 'Dificil', 'Dificil');
INSERT INTO Usuarios(identificacion,Nombre,Email,Password,FechaNacimiento,UserName,idPerfil)VALUES('1015444310','blackshark','blackshark@ucentral.false.com','blackshark','2016/11/20','blackshark',1);
COMMIT;


-- SET SQL_MODE=@OLD_SQL_MODE;
-- SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
-- SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;