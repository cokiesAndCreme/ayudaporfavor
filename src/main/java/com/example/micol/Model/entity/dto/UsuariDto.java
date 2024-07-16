package com.example.micol.Model.entity.dto;

public record UsuariDto(
        Integer id_usuario,
         String nombre_usuario,
         String correo,
        String especialisacion) {

    // Constructor adicional que solo toma el id_usuario y permite valores opcionales para los otros campos
    public UsuariDto(Integer id_usuario, String nombre_usuario, String correo, String especialisacion) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario != null ? nombre_usuario : "N/A";
        this.correo = correo != null ? correo : "N/A";
        this.especialisacion = especialisacion != null ? especialisacion : "N/A";

        if (id_usuario == null) {
            throw new IllegalArgumentException("El id_usuario no puede ser nulo");
        }
    }

}
