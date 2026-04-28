# 🏥 Sistema de Gestión Hospitalaria

Este proyecto es una aplicación web y de escritorio diseñada para la **gestión integral de hospitales**, incluyendo módulos para **administradores**, **personal médico/enfermería** y **pacientes**.  
El sistema busca optimizar la administración de citas, documentos médicos, auditoría de seguridad y comunicación interna, garantizando **seguridad, usabilidad y escalabilidad**.

---

## 🚀 Enlace al Código Fuente
Puedes encontrar el repositorio oficial aquí:
https://github.com/isabellacruzq-lgtm/Gestion-Hospitalaria

---

## 📌 Objetivos del Proyecto
- Centralizar la gestión de usuarios, citas y documentos médicos.
- Facilitar la comunicación entre administradores, médicos, enfermeras y pacientes.
- Garantizar la seguridad y trazabilidad de la información hospitalaria.
- Ofrecer una experiencia clara y accesible para pacientes vía portal web.

---

## ✅ Requerimientos Funcionales

### 👩‍💼 Administrador
- Gestión de usuarios y roles (alta, edición, suspensión, permisos).
- Agenda y calendario interactivo (programar, reprogramar, cancelar citas).
- Gestión de documentos médicos (subida, clasificación, búsqueda, descarga).
- Panel de auditoría y seguridad (registro de accesos, intentos fallidos, acciones críticas).
- Reportes y estadísticas (ocupación hospitalaria, citas cumplidas vs canceladas).
- Notificaciones internas y alertas de emergencias.
- Filtros avanzados y etiquetas en documentos.
- Historial de versiones y comparación visual de documentos.

### 👨‍⚕️ Personal de la Salud
- Agenda personal con citas asignadas y disponibilidad médica.
- Acceso directo al historial clínico de pacientes.
- Registro de evolución médica y subida de resultados.
- Indicadores visuales de disponibilidad y pacientes críticos.
- Centro de mensajes internos para comunicación con colegas y administración.

### 🧑 Pacientes (Portal Web)
- Registro y autenticación segura.
- Solicitar, cancelar y reprogramar citas desde navegador.
- Consultar historial médico con filtros y descargas.
- Acceso a resultados recientes y notificaciones.
- Panel de mensajes y soporte hospitalario.
- Dashboard inicial con citas próximas, doctores asignados y tratamientos activos.

---

## ⚙️ Requerimientos No Funcionales
- **Seguridad y confidencialidad**: cumplimiento de normativas (HIPAA, Ley 1581 en Colombia).
- **Disponibilidad**: acceso 24/7 con redundancia.
- **Escalabilidad**: soporte para múltiples hospitales y miles de usuarios.
- **Usabilidad**: interfaz clara, accesible y adaptada a cada perfil.
- **Rendimiento**: respuesta menor a 2 segundos en operaciones críticas.
- **Compatibilidad multiplataforma**: escritorio y web.
- **Accesibilidad**: soporte para lectores de pantalla, alto contraste y diseño responsivo.

---

## 🖼️ Mocks y Paneles Implementados
- **Administrador**: Panel de Auditoría y Seguridad, Panel de Reportes, Panel de Documentos con versiones.  
- **Médico/Enfermera**: Agenda Personal + Historial Clínico Integrado, Panel de Disponibilidad Médica.  
- **Paciente (Web)**: Portal Web del Paciente (Dashboard), Agenda Interactiva Web, Historial Médico Web con filtros y descargas.  

---

## 🚀 Tecnologías Utilizadas
- **Frontend**: React + TailwindCSS (componentes responsivos y estilo escritorio/web).  
- **Backend**: Node.js / Express (gestión de APIs y seguridad).  
- **Base de Datos**: PostgreSQL / MongoDB (según requerimientos de escalabilidad).  
- **Autenticación**: JWT + OAuth2.  
- **Infraestructura**: Docker + despliegue en nube (Azure/Heroku).  

---

## 📂 Estructura del Proyecto
- /src
- /components   -> Componentes UI (React)
- /pages        -> Pantallas principales (Admin, Médico, Paciente)
- /services     -> Lógica de negocio y conexión con API
- /assets       -> Estilos, íconos y recursos gráficos


---

## 📌 Próximos pasos
- Implementar **Panel de Pacientes Críticos** para médicos.  
- Añadir **descarga masiva de documentos** para pacientes.  
- Integrar **configuración avanzada de alertas de seguridad** para administradores.  

---

## 👥 Autores
Proyecto desarrollado por el equipo académico de la **Universidad Autónoma**, bajo la coordinación de Isabella Cruz y sus colaboradores.

