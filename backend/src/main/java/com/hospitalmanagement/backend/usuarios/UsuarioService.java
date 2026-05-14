package com.hospitalmanagement.backend.usuarios;

import java.util.Optional;
/**
 * Interfaz del servicio de gestión de usuarios.
 * 
 * <p> Principio ISP (SOLID): Defffine únicamente los métodos necesarios 
 * para la gestión de usuarios. </p>
 * 
 * <p> Principio DIP (SOLID): Las capas superiores dependen de esta
 * abstracción y no de implementaciones concretas. </p>
 * 
 * @author Juan Camilo
 * @version 1.0
 * @since 2026
 */
public interface UsuarioService {
    
    /**
     * Registra un nuevo usuario en el sistema.
     * 
     * @param usuario el usuario a registrar
     * @return el usuario registrado con su ID generado
     */
    Usuario registrar(Usuario usuario);

    /**
     * Busca un usuario por su dirección de email.
     * 
     * @param email el email del usuario a buscar
     * @return un {@link Optional} con el usuario si existe, vacío si no
     */
    Optional<Usuario> buscarPorEmail(String email);

    /**
     * Verifica si un emial ya está registrado en el sistema.
     * 
     * @param email el email a verificar
     * @return {@code true} si el email ya está registrado, {@code false} si no
     */

    boolean existeEmail(String email);
}
