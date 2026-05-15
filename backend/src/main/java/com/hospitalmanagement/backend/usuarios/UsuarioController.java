package com.hospitalmanagement.backend.usuarios;

import com.hospitalmanagement.backend.usuarios.dto.UsuarioRequestDTO;
import com.hospitalmanagement.backend.usuarios.dto.UsuarioResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para la gestión de usuarios.
 * 
 * <p> Principio SRP (SOLID): esta clase tiene una única responsabilidad,
 * manejar las peticiiones HTTP relacionadas con usuarios.</p>
 * 
 * <p> Principio DIP (SOLID): depende de la abstracción {@link UsuarioService}
 * y no de la implementación concreta. </p>
 * 
 * @author Juan Camilo
 * @version 1.0
 * @since 2026
 */
@RestController //Spring: Indica que es un controlador REST
@RequestMapping("/api/v1/usuarios") //Ruta base para todas las peticiones de usuario
@RequiredArgsConstructor //Lombok: genera constructor con argumentos para los campos finales
public class UsuarioController {
    
    /** Servicio de usuarios. Inyección por constructor (DIP) */
    private final UsuarioService usuarioService;

    /**
     * Registra un nuevo usuario en el sistema
     * 
     * @param dto Los datos del usuario a registrar
     * @return El usuario registrado con código 201 Created, o 409 Conflict si el email ya existe
     * 
     */

    @PostMapping("/registrar")
    public ResponseEntity<UsuarioResponseDTO> registrar(@Valid @RequestBody UsuarioRequestDTO dto){

        //Verifica si el email ya está registrado
        if(usuarioService.existeEmail(dto.getEmail())){
            return ResponseEntity.status(HttpStatus.CONFLICT).build(); //409 Conflict

        }

        //Construye el usuario desde el DTO
        Usuario usuario = Usuario.builder()
                .nombre(dto.getNombre())
                .apellido(dto.getApellido())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .rol(RolUsuario.PACIENTE)
                .activo(true)
                .build();

        // Registrar el usuario
        Usuario guardado = usuarioService.registrar(usuario);

        // Construye la repuesta sin exponer la constraseña
                UsuarioResponseDTO respuesta = UsuarioResponseDTO.builder()
                .id(guardado.getId())
                .nombre(guardado.getNombre())
                .apellido(guardado.getApellido())
                .email(guardado.getEmail())
                .rol(guardado.getRol())
                .activo(guardado.getActivo())
                .fechaCreacion(guardado.getFechaCreacion())
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(respuesta);
    }
}
