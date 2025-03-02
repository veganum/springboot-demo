package demo.service;

import demo.dto.UserDTO;
import demo.entity.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDTO> getAllUsers();
    Optional<UserDTO> getUserById(Long id);
    void addUser(UserDTO userDTO);
    void deleteUser(Long id);
}
