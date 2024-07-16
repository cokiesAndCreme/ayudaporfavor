package com.example.micol.Model.entity;


import com.example.micol.Model.entity.dto.TopicDto;
import com.example.micol.Model.enums.Estatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.sql.Date;

@Table(name= "topic")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Topidemrda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_topic;
    private String titulo;
    private String mensaje;
    private Date fecha_de_creacion;
    @Enumerated(EnumType.STRING)
    private Estatus status_topic;
    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_curso", nullable = false)
    private Curso curso;




//
}
