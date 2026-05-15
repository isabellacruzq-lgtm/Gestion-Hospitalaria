package com.hospitalmanagement.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * DTO para enviar la respuesta del login al cliente.
 *
 * <p>Principio SRP (SOLID): esta clase solo transporta
 * los datos de salida del login.</p>
 *
 * @author Juan Camilo
 * @version 1.0
 * @since 2026
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponseDTO {

    /** Token JWT generado para el usuario autenticado. */
    private String token;

    /** Email del usuario autenticado. */
    private String email;

    /** Rol del usuario en el sistema. */
    private String rol;

    /** Nombre completo del usuario. */
    private String nombre;
}