package com.hospitalmanagement.auth;

import com.hospitalmanagement.auth.dto.LoginRequestDTO;
import com.hospitalmanagement.auth.dto.LoginResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para la autenticación de usuarios.
 * 
 * <p>Principio SRP (SOLID): esta clase tiene una única responsabilidad,
 * manejar las peticiiones HTTP relacionadas con la autenticación.</p>
 * 
 * @author Juan Camilo
 * @version 1.0 
 * @since 2026
 */

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    
    /** Servicio de autenticación. Inyección por constructor (DIP) */
    private final AuthService authService;

    /**
     * Autentica un usuario y retorna  un token JWT.
     * 
     * @param dto los datos de login (email y contraseña)
     * @return el token JWT y datos del usuario autenticado
     * 
     */
    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@Valid @RequestBody LoginRequestDTO dto){
        return ResponseEntity.ok(authService.login(dto));
    }
}
