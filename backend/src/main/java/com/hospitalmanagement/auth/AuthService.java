package com.hospitalmanagement.auth;

import com.hospitalmanagement.auth.dto.LoginRequestDTO;
import com.hospitalmanagement.auth.dto.LoginResponseDTO;

/**
 * Interfaz del servicio de autenticación.
 *
 * <p>Principio ISP (SOLID): define únicamente los métodos necesarios
 * para la autenticación de usuarios.</p>
 *
 * <p>Principio DIP (SOLID): las capas superiores dependen de esta
 * abstracción y no de implementaciones concretas.</p>
 *
 * @author Juan Camilo
 * @version 1.0
 * @since 2026
 */
public interface AuthService {

    /**
     * Autentica un usuario y genera un token JWT.
     *
     * @param dto las credenciales del usuario
     * @return el token JWT y datos del usuario autenticado
     */
    LoginResponseDTO login(LoginRequestDTO dto);
}