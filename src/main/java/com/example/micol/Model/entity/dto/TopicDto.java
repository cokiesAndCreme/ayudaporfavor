package com.example.micol.Model.entity.dto;

import com.example.micol.Model.enums.Estatus;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.Date;

@Data
public record TopicDto(
       @JsonAlias("id_topic") Integer id,
       String titulo,
     String mensaje,
       @JsonAlias("fecha_de_creacion")Date fechadecreacion,
       @JsonAlias("status_topic") Estatus status,
       @JsonAlias("id_curso") Cursorec curso,
       @JsonAlias("id_usuario") UsuariDto autor
) {

    
}
