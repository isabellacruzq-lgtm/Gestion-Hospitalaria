package com.hospitalmanagement.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO para recibir las credenciales de login.
 * 
 * <p>Principio SRP (SOLID): esta clase solo transporta
 * los datos de entrada del login</p>  
 * 
 * @author Juan Camilo
 * @version 1.0
 * @since 2026 
 */

@Getter
@Setter
@NoArgsConstructor
public class LoginRequestDTO {
    /** Email del usuario */
    @Email(message = "El email no tiene formato Válido")
    @NotBlank(message = "El email es obligatorio")
    private String email;

    /** Contraseña del usuario  */
    @NotBlank(message = "La contraseña es obligatoria")
    private String password;
}
