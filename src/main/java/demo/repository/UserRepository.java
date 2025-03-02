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
        users.add(new User(3L, "Carlos Ramírez", "carlos@example.com"));
        users.add(new User(4L, "María González", "maria@example.com"));
        users.add(new User(5L, "Pedro Fernández", "pedro@example.com"));
        users.add(new User(6L, "Lucía Méndez", "lucia@example.com"));
        users.add(new User(7L, "Sofía Torres", "sofia@example.com"));
        users.add(new User(8L, "Miguel Ángel", "miguel@example.com"));
        users.add(new User(9L, "Daniela Rojas", "daniela@example.com"));
        users.add(new User(10L, "Javier Castro", "javier@example.com"));
        users.add(new User(11L, "Andrea Herrera", "andrea@example.com"));
        users.add(new User(12L, "Hugo Sánchez", "hugo@example.com"));
        users.add(new User(13L, "Valentina López", "valentina@example.com"));
        users.add(new User(14L, "Emilio Vargas", "emilio@example.com"));
        users.add(new User(15L, "Carmen Reyes", "carmen@example.com"));
        users.add(new User(16L, "Gabriel Ortega", "gabriel@example.com"));
        users.add(new User(17L, "Isabela Montes", "isabela@example.com"));
        users.add(new User(18L, "Fernando Ramos", "fernando@example.com"));
        users.add(new User(19L, "Patricia Serrano", "patricia@example.com"));
        users.add(new User(20L, "Manuel Domínguez", "manuel@example.com"));
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
