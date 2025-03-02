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
| Error Lens | Resalta errores y advertencias en el código en tiempo real |
| Extension Pack for Java | Paquete de extensiones para desarrollo en Java |
| Git Graph | Visualiza un gráfico de Git y realiza acciones sobre el repositorio |
| GitHub Copilot | Asistente de código basado en IA |
| GitHub Pull Requests | Manejo de Pull Requests en GitHub desde VS Code |
| GitLens | Mejora la integración con Git en VS Code |
| IntelliCode | Sugerencias de código con IA |
| IntelliCode API Usage Examples | Muestra ejemplos de uso de API en GitHub |
| Language Support for Java | Soporte para sintaxis, linting y Maven |
| Lombok Annotations Support | Mejora el soporte para Lombok en VS Code |
| markdownlint | Linter para archivos Markdown |
| Material Icon Theme | Pack de iconos para VS Code |
| Maven for Java | Manejo de proyectos Maven en VS Code |
| Path Intellisense | Autocompletado de rutas de archivos en VS Code |
| Peacock | Personaliza el color del espacio de trabajo |
| Prettier - Code formatter | Formateador de código automático |
| Project Manager for Java | Organización y gestión de proyectos Java |
| Spanish Language Pack | Traducción de la interfaz de VS Code al español |
| Spring Boot Dashboard | Panel de control para Spring Boot |
| Spring Boot Extension Pack | Extensiones útiles para Spring Boot |
| Spring Boot Tools | Validación y asistencias para Spring Boot |
| Spring Code Generator | Generador de código para Spring Boot |
| Spring Initializr Java Support | Generación rápida de proyectos Spring |
| Test Runner for Java | Pruebas con JUnit y TestNG |
| XML | Soporte para archivos XML en VS Code |
| XML Tools | Formateo y validación de XML |

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

