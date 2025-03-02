# 🚀 Proyecto Spring Boot - API de Usuarios

Este es un proyecto básico de **Spring Boot** que expone una API REST para la gestión de usuarios.  
Incluye operaciones **CRUD** y está documentado con **Swagger OpenAPI** para facilitar la prueba y exploración de los endpoints.

---

## 📌 Tecnologías Utilizadas
- 🌟 **Java 17**
- 🔥 **Spring Boot 3.4.3**
- ⚙ **Maven**
- 📝 **Lombok** *(para reducir código boilerplate)*
- 📖 **Springdoc OpenAPI** *(para la documentación de la API con Swagger)*
- ✅ **JUnit** *(para testing)*
- 🖥️ **VS Code** *(como IDE de desarrollo)*

---

## 🔧 Instalación y Configuración

### 1⃣ **Clonar el repositorio**
```bash
git clone https://github.com/tu-usuario/tu-repo.git
cd tu-repo
```

### 2⃣ **Compilar el proyecto**
Ejecuta el siguiente comando en la raíz del proyecto:
```bash
mvn clean install
```

### 3⃣ **Ejecutar la aplicación**
```bash
mvn spring-boot:run
```
📌 La aplicación se ejecutará en:  
🔗 **`http://localhost:8080`**

---

## 📖 Documentación de la API (Swagger UI)
Después de iniciar la aplicación, puedes explorar los endpoints en **Swagger UI**:
```bash
http://localhost:8080/swagger-ui.html
```

### 📌 **Endpoints disponibles:**
| Método | Endpoint          | Descripción                  |
|--------|------------------|------------------------------|
| `GET`  | `/api/users`     | Obtiene todos los usuarios   |
| `GET`  | `/api/users/{id}` | Obtiene un usuario por ID    |
| `POST` | `/api/users`     | Agrega un nuevo usuario      |
| `DELETE` | `/api/users/{id}` | Elimina un usuario por ID    |

---

## 🔥 Extensiones de VS Code Recomendadas

### 📌 **Extensiones Instaladas**
Aquí están las extensiones que actualmente tienes en tu **VS Code**:

| Nombre | Descripción |
|--------|------------|
| Debugger for Java | Depurador ligero para Java en VS Code |
| Extension Pack for Java | Paquete de extensiones para desarrollo en Java |
| GitHub Copilot | Asistente de código basado en IA |
| GitLens | Mejora la integración con Git en VS Code |
| IntelliCode | Sugerencias de código con IA |
| Language Support for Java | Soporte para sintaxis, linting y Maven |
| Maven for Java | Manejo de proyectos Maven en VS Code |
| Prettier - Code formatter | Formateador de código automático |
| Project Manager for Java | Organización y gestión de proyectos Java |
| Spring Boot Dashboard | Panel de control para Spring Boot |
| Spring Boot Extension Pack | Extensiones útiles para Spring Boot |
| Spring Boot Tools | Validación y asistencias para Spring Boot |
| Spring Initializr Java Support | Generación rápida de proyectos Spring |
| Test Runner for Java | Pruebas con JUnit y TestNG |

### 🔹 **Extensiones Adicionales Recomendadas**
Podrías instalar estas para mejorar tu flujo de trabajo:

| Nombre | Descripción |
|--------|------------|
| REST Client | Permite probar APIs directamente desde VS Code (Alternativa ligera a Postman) |
| Error Lens | Resalta errores y advertencias en el código en tiempo real |
| TODO Highlight | Resalta comentarios `TODO` en el código |
| Lombok Annotations Support | Mejora el soporte para Lombok en VS Code |

---

## 📌 Próximos Pasos
✅ **Conectar a una base de datos** (MySQL, PostgreSQL o H2).  
🛠️ **Agregar pruebas unitarias más avanzadas con Mockito**.  
🔐 **Implementar autenticación con JWT**.  

---

## 🤝 Contribuciones
Si deseas contribuir al proyecto, **envía un Pull Request o abre un Issue**. ¡Tu ayuda es bienvenida! 🚀  

---

## 📝 Licencia
Este proyecto está bajo la licencia **MIT**.

