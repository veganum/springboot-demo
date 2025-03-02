package demo.repository;

import demo.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1L, "Juan Pérez", "juan@example.com"));
        users.add(new User(2L, "Ana López", "ana@example.com"));
    }

    public List<User> findAll() {
        return users;
    }

    public Optional<User> findById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public void save(User user) {
        users.add(user);
    }

    public void delete(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
