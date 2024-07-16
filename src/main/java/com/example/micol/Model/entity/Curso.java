package com.example.micol.Model.entity;

import com.example.micol.Model.enums.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="curso")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Curso {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_curso;
    private String nombre_curso;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private String grupo_curso;
}
