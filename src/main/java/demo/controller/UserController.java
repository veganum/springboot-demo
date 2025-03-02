package demo.controller;

import demo.dto.UserDTO;
import demo.service.UserService;
import demo.service.UserServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controlador REST para gestionar usuarios.
 * Proporciona operaciones CRUD básicas.
 */
@RestController
@RequestMapping("/api/users")
@Tag(name = "Usuarios", description = "API para gestionar usuarios") // Etiqueta general en Swagger
public class UserController {

    private final UserService userService = new UserServiceImpl();

    /**
     * Obtiene la lista de todos los usuarios registrados.
     *
     * @return Lista de objetos UserDTO representando a los usuarios.
     */
    @Operation(summary = "Obtener todos los usuarios", 
               description = "Recupera una lista con todos los usuarios almacenados.")
    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * Obtiene un usuario específico por su ID.
     *
     * @param id Identificador único del usuario.
     * @return Objeto UserDTO con la información del usuario, si existe.
     */
    @Operation(summary = "Obtener un usuario por ID", 
               description = "Devuelve un usuario específico basado en su ID.")
    @GetMapping("/{id}")
    public Optional<UserDTO> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    /**
     * Agrega un nuevo usuario a la lista.
     *
     * @param userDTO Objeto UserDTO con los datos del usuario a agregar.
     */
    @Operation(summary = "Agregar un usuario", 
               description = "Registra un nuevo usuario en el sistema.")
    @PostMapping
    public void addUser(@RequestBody UserDTO userDTO) {
        userService.addUser(userDTO);
    }

    /**
     * Elimina un usuario basado en su ID.
     *
     * @param id Identificador único del usuario a eliminar.
     */
    @Operation(summary = "Eliminar un usuario", 
               description = "Elimina un usuario del sistema basándose en su ID.")
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
