package com.hospitalmanagement.backend.usuarios;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Entidad que representa un usuario del sistema.
 * Principio SRP (SOLID): esta clase solo tiene la responsabilidad de modelar el usuario.
 */
@Getter         // Lombok: genera getters
@Setter         // Lombok: genera setters
@NoArgsConstructor
@AllArgsConstructor(access = lombok.AccessLevel.PACKAGE)
@Builder       // Lombok: patrón Builder para construcción de objetos
@Entity         // JPA: mapea esta clase como tabla en la base de datos
@Table(name = "usuarios") // JPA: nombre de la tabla en MySQL
public class Usuario {

    @Id // JPA: indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // JPA: autoincremento
    private Long id;

    @NotBlank // Validación: el campo no puede estar vacío
    @Column(nullable = false)
    private String nombre;

    @NotBlank
    @Column(nullable = false)
    private String apellido;

    @Email // Validación: debe tener formato de email
    @NotBlank
    @Column(nullable = false, unique = true) // unique: no puede repetirse en la BD
    private String email;

    @NotBlank
    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING) // JPA: guarda el enum como texto en la BD
    @Column(nullable = false)
    private RolUsuario rol;

    @Column(nullable = false)
    private Boolean activo = true;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @PrePersist // JPA: se ejecuta automáticamente antes de guardar en BD
    protected void onCreate() {
        fechaCreacion = LocalDateTime.now();
    }
}