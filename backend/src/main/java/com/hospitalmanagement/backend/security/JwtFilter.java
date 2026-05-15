package com.hospitalmanagement.backend.security;

import com.hospitalmanagement.backend.usuarios.Usuario;
import com.hospitalmanagement.backend.usuarios.UsuarioService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import java.util.Optional;

/**
 * Filtro JWT que intercepta cada petición HTTP para validar el token
 * 
 * <p>Principio SRP (SOLID): esta clase tiene una única responsabilidad,
 * interceptar y validar el token JWT en cada petición.</p>
 * 
 * <p>Principio OCP (SOLID): extiende {@link OncePerRequestFilter} sin 
 * modificar su comportamiento base.
 * 
 * @author Juan Camilo
 * @version 1.0
 * @since 2026
 */
@Component
@RequiredArgsConstructor
public class JwtFilter extends OncePerRequestFilter {
    
    /**Utilidad para operaciones con tokens JWT */
    private final JwtUtil jwUtil;

    /** Servicio de usuarios para verificar existencia del usuario. */
    private final UsuarioService usuarioService;

    /**
     * Intercepta cada petición HTTP y valida el token JWT si existe
     * 
     * @param request la petición HTTP entrante
     * @param reponse la respuesta HTTP
     * @param filterChain la cadena de filtros
     * @throws ServletEXception si ocurre un error en el filtro
     * @throws IOException si ocurre un error de entrada/salida
     * 
     */

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse reponse,
                                    FilterChain filterChain) 
                                    throws ServletException, IOException {
                                        // Extrae el header Authorization
                                        String authHeader = request.getHeader("Authorization");

                                        if (authHeader != null && authHeader.startsWith("Bearer ")){
                                            String token = authHeader.substring(7);

                                            if (jwUtil.validarToken(token)){
                                                String email = jwUtil.extraerEmail(token);
                                                Optional<Usuario> usuarioOpt = usuarioService.buscarPorEmail(email);

                                                if (usuarioOpt.isPresent()){
                                                    Usuario usuario = usuarioOpt.get();
                                                    String rol = "ROLE_"+ usuario.getRol().name();

                                                    // Autentica al usuario en el contexto de seguridad
                                                    UsernamePasswordAuthenticationToken authentication = 
                                                        new UsernamePasswordAuthenticationToken(
                                                            email,
                                                            null,
                                                            List.of(new SimpleGrantedAuthority(rol))
                                                        );
                                                    SecurityContextHolder.getContext().setAuthentication(authentication);
                                                }
                                            }

                                        }

                                        filterChain.doFilter(request, reponse);
                                    }
}
