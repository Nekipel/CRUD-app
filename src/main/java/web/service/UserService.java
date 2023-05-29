package web.service;

import web.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void createUser(User user);

    User readUser(long id);

    void updateUser(User user, Long id);

    void deleteUser(long id);
}
