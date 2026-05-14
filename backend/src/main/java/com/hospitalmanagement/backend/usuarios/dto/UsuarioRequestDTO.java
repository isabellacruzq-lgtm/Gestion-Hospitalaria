package com.hospitalmanagement.backend.usuarios.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO para recibir los datos de un usuario en las peticiones HTTP.
 * 
 * <p>Principio SRP (SOLID): Esta clase solo tiene la responsabilidad
 * de transportar los datos de entrada del usuario.</p>
 * 
 * @author Juan Camilo
 *  @version 1.0
 * @since 2026
 */
@Getter
@Setter
@NoArgsConstructor
public class UsuarioRequestDTO {
    /**Nombre del usuario */
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    /**Apellido del usuario */
    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;

    /** Email del usuario, debe ser único en el sistema.  */
    @Email(message = "El email no tiene un formate válido")
    @NotBlank(message = "El Correo elqectrónico es obligatorio")
    private String email;

    /**Contraseña del usuario sin encriptar. */
    @NotBlank(message = "La contraseña es obligatoria")
    private String password;
}
