package com.hospitalmanagement.backend.usuarios;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementación del servicio de gestión de ussuarios.
 * 
 * <p>Principio SRP (SOLID): esta clase tiene una única responsabilidad,
 * gestionar la lógica de negocio relacionada con los usuarios. </p>
 * 
 * <p>Principio OCP (SOLID): Puede extenderse mediante nuevas implementaciones
 * de {@link UsuarioService} sin modificar esta clase.</p>
 * 
 * @author Juan Camilo
 * @version 1.0
 * @since 2026
 */
@Service
@RequiredArgsConstructor // Lombok: genera constructor con argumentos para los campos finales
public class UsuarioServiceImpl implements UsuarioService {
    /**Repositorio para el acceso a datos de usuario. Inyección por constructor (DIP) */
    private final UsuarioRepository usuarioRepository;

    /** Codificador de constraseñas para encriptar antes de guardar. */
    private final PasswordEncoder passwordEncoder;

    /**
     * {@inheritDoc}
     * 
     * <p>Encripta la contraseña del usuario antes de ingresarla en la base de datos.</p>
     * 
     */
    @Override
    public Usuario registrar(Usuario usuario){
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return usuarioRepository.save(usuario);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Usuario> buscarPorEmail(String email){
        return usuarioRepository.findByEmail(email);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean existeEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }
}
