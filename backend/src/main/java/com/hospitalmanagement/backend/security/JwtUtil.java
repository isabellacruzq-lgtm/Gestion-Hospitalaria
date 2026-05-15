package com.hospitalmanagement.backend.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

/**
 * Utilidad para la generación y validación de tokens JWT
 * 
 * <p>Principio SRP (SOLID): esta clase tiene una única responsabilildad,
 * manejar la lógica de tokens JWT.</p>
 * 
 * @author Juan Camilo
 * @version 1.0
 * @since 2026
 */
@Component
public class JwtUtil {
    /** Clave secreta para firmar los tokens, obtenida del application.properties */
    @Value("${jwt.secret}")
    private String secret;

    /** Tiempo de expiración del token en milisegundos
     * 
     */
    @Value("${app.jwt.expiration}")
    private Long expiration;

    /**
     * Genera la clave de firma a partir del secreto configurado
     * 
     * @return la clave secreta para firmar tokens
     */
    private SecretKey getSigningKey(){
        return Keys.hmacShaKeyFor(secret.getBytes());
    }

    /**
     * Genera un token JWT para el usuario autenticado.
     * 
     * @param email el email del usuario autenticado
     * @param rol el rol del usuario en el sistema
     * @return el token JWT generado
     */

    public String generarToken(String email, String rol){
        return Jwts.builder()
                .subject(email)
                .claim("rol", rol)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis()+expiration))
                .signWith(getSigningKey())
                .compact();
    }

    /**
     * Extrae el email del usuario desde el token JWT.
     * 
     * @param token el token JWT
     * @return el email del usuario
     * 
     */
    public String extraerEmail(String token){
        return extraerClaims(token).getSubject();
    }

    /**
     * Valida si el token JWT es válido o si ha expirado.
     * 
     * @param token el token JWT a validar
     * @return {@code true} si el token es válido, {@code false} si no lo es o ha expirado
     */

    public boolean validarToken(String token){
        try{
            extraerClaims(token);
            return true;
        }catch (Exception e){
            return false;
        }
        
    }

    /**
     * Extrae todos los claims del token JWT
     * 
     * @param token el token JWT
     * @return los claims del token
     *
     */

    private Claims extraerClaims(String token){
        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
}

