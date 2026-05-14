package com.hospitalmanagement.backend.usuarios.dto;

import com.hospitalmanagement.backend.usuarios.RolUsuario;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

/** 
 * DTO para enviar los datos de un usuario en las respuestas de HTTP
 * 
 * <p>Principio SRP (SOLID): esta clase solo tiene la responsabilidad
 * de transportar los datos de salida del usuario.</p>
 * 
 * <p>ACLARACIÓN: nunca se expone la constraseña del usuario.</p>
 * 
 * @author Juan Camilo
 * @version 1.0
 * @since 2026
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponseDTO {
    /** Identificador único del usuario */
    private Long id;

    /** Nombre del usuario */
    private String nombre;

    /** Apellido del usuario */
    private String apellido;

    /** Email del usuario */
    private String email;

    /** Rol asignado al usuario en el sistema. */
    private RolUsuario rol;

    /**Indica si el usuario está activo en el sistema.  */
    private Boolean activo;

    /** Fecha en el que el usuario se registro / se creo */
    private LocalDateTime fechaCreacion;
}
