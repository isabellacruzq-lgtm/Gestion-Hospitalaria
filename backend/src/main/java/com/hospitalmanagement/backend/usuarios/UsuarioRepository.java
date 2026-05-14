package com.hospitalmanagement.backend.usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repositorio de acceso a datos para la entidad {@link Usuario}.
 * 
 * <p>Principio SRP (SOLID): esta interfaz tiene una única responsabilidad, 
 * el acceso y consulta de datos de usuarios en la base de datos. </p>
 * 
 * @author Juan Camilo 
 * @version 1.0
 * @since 2026
 */
@Repository 
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    /**
     * Busca un usuario por su dirección de email.
     * 
     * @param email el email del usuario a buscar
     * @return un  {@link Optional} con el usuario si existe, vacío si no
     */
    Optional<Usuario> findByEmail(String email);

    /**
     * Verifica si existe un usuario registrado con el email dado.
     * 
     * @param email el email a verificar 
     * @return {@code true} si el email ya está registrado, {@code false} si no
     */
    boolean existsByEmail(String email);

}
