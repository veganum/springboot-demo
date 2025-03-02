package demo.service;

import demo.dto.UserDTO;
import demo.entity.User;
import demo.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository = new UserRepository();

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> new UserDTO(user.getName(), user.getEmail()))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UserDTO> getUserById(Long id) {
        return userRepository.findById(id)
                .map(user -> new UserDTO(user.getName(), user.getEmail()));
    }

    @Override
    public void addUser(UserDTO userDTO) {
        Long newId = (long) (userRepository.findAll().size() + 1);
        User user = new User(newId, userDTO.getName(), userDTO.getEmail());
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(id);
    }
}
