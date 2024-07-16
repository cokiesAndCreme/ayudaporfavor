CREATE TABLE curso(
id_curso INT NOT NULL AUTO_INCREMENT,
nombre_curso VARCHAR(45)NOT NULL,
categoria VARCHAR(45) NOT NULL,
grupo_curso VARCHAR(45)NOT NULL,
PRIMARY KEY(id_curso)
);

CREATE TABLE usuario (
id_usuario INT  NOT NULL AUTO_INCREMENT,
nombre_usuario varchar(45) NOT NULL,
correo varchar(45) NOT NULL,
especialisacion varchar(45) NOT NULL,
PRIMARY KEY(id_usuario)
);

CREATE TABLE topic(
id_topic INT NOT NULL auto_increment,
titulo varchar(45) NOT NULL,
mensaje varchar(200) NOT NULL,
fecha_de_creacion date NOT NULL,
status_topic VARCHAR(45) NOT NULL,
id_curso INT NOT NULL,
id_usuario INT NOT NULL,
PRIMARY KEY (id_topic),
FOREIGN KEY (id_curso) REFERENCES curso(id_curso),
FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)

)