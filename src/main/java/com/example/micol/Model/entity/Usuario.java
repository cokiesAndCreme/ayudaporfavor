package com.example.micol.Model.entity;

import com.example.micol.Model.enums.Espe;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name ="usuarios")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    private String nombre_usuario;
    private String correo;
    @Enumerated(EnumType.STRING)
    private Espe especialisacion;
}
