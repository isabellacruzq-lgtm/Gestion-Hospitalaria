Definition of Done — Grupo AURA
Este documento establece los criterios que debe cumplir toda historia de usuario para considerarse terminada (Done). El Scrum Master es responsable de velar por su cumplimiento en cada Sprint Review.

📌 Criterios obligatorios (toda historia)
El código está en una rama feature/nombre-funcionalidad creada desde la rama del sprint activo.

Se abrió un Pull Request con el título en formato convencional: feat(scope): descripción.

El PR fue revisado y aprobado por al menos un integrante del equipo (distinto al autor).

El código sigue los principios SOLID y Clean Code (nombres claros, funciones pequeñas).

Se escribieron pruebas unitarias para la lógica de negocio (cobertura ≥ 80% en servicios).

El endpoint correspondiente está documentado en Swagger (si aplica).

La funcionalidad fue demostrada en el entorno de pruebas durante el Sprint Review.

Isabella (PO) validó que la historia cumple los criterios de aceptación definidos.

El issue en GitHub Projects fue movido a la columna Hecho y marcado como cerrado.

El commit de merge usa el formato convencional: feat(scope): descripción corta.

📌 Criterios adicionales (según el tipo de historia)
Backend (API): Endpoint documentado en Swagger con request/response de ejemplo.

Frontend (Angular): Vista responsiva probada en Chrome y Firefox. Migas de pan visibles.

Base de datos: Script SQL actualizado en docs/sql/schema.sql.

Seguridad: Endpoint protegido con JWT y validación de rol (RBAC).

Reportes: Filtros funcionando. Exportación en PDF probada.

📌 ¿Qué pasa si una historia NO cumple el DoD?
No se considera Done → vuelve al Backlog del siguiente sprint.

El Scrum Master registra el motivo en el acta del Sprint Review.

El PO decide si la historia pasa al siguiente sprint con la misma estimación o se re-estima.

Documento elaborado por: Samuel Ladino — Scrum Master
Fecha: 14 de mayo de 2026
Aprobado por: Isabella — Product Owner
Proyecto: AURA — Sistema de Gestión Hospitalaria · UAM 2026
