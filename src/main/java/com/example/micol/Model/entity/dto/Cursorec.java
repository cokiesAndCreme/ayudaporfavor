package com.example.micol.Model.entity.dto;

import com.example.micol.Model.enums.Categoria;
import com.fasterxml.jackson.annotation.JsonAlias;

public record Cursorec(
       @JsonAlias("id_curso") Integer id,
       @JsonAlias("nombre_curso")String nombre,
       @JsonAlias("categoria") Categoria categoria,
       @JsonAlias("grupo_curso") String grupo
) {
    public Cursorec(Integer id, String nombre, Categoria categoria, String grupo) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.grupo = grupo;
    }
}
