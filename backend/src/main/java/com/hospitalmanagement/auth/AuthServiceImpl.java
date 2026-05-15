package com.hospitalmanagement.auth;

import com.hospitalmanagement.auth.dto.LoginRequestDTO;
import com.hospitalmanagement.auth.dto.LoginResponseDTO;
import com.hospitalmanagement.backend.security.JwtUtil;
import com.hospitalmanagement.backend.usuarios.Usuario;
import com.hospitalmanagement.backend.usuarios.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/** Implementación del servicio de autenticación.
 * 
 * <p>Principio SRP(SOLID): Esta clase tiene una única responsabilidad,
 * gestionar la lógica de autenticacion de usuario.</p>
 * 
 * <Principio OCP (SOLID): puede extenderse mediante nuevas implementaciones
 * de {@link Authservice} sin modificar esta clase.</p>}
 * 
 * @author Juan Camilo
 * @version 1.0
 *  @since 2026
 * 
 */

@Service
@RequiredArgsConstructor
public class AuthServiceImpl  implements AuthService {

    /** Servicio de usuarios para buscar por email. */
    private final UsuarioService usuarioService;

    /** Codificador de contraseñas para verificar credenciales. */
    private final PasswordEncoder passwordEncoder;

    /** Utilidad para generar tokens JWT. */
    private final JwtUtil jwtUtil;

    /** 
     * {@inheritDoc}
     * 
     * <p>Verifica las credenciales del usuario y genera un token JWT
     * si la autenticación es exitosa.</p>
     * 
     * @throws RuntimeException si el email o la contraseña no coinciden
     * 
     */
    @Override
    public LoginResponseDTO login(LoginRequestDTO dto){
        
        // buscar el usuario por email 
        Usuario usuario = usuarioService.buscarPorEmail(dto.getEmail())
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        
        // Verificar la contraseña
        if (!passwordEncoder.matches(dto.getPassword(), usuario.getPassword())){
            throw new RuntimeException("Contraseña incorrecta");
        }

        //Genera el token JWT
        String token = jwtUtil.generarToken(usuario.getEmail(), usuario.getRol().name());


        //Retorna la respuesta con el token
        return LoginResponseDTO.builder()
                .token(token)
                .email(usuario.getEmail())
                .rol(usuario.getRol().name())
                .nombre(usuario.getNombre() + " " + usuario.getApellido())
                .build();
    }
}
