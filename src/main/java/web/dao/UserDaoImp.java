package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void createUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User readUser(long id) {
        entityManager.find(User.class, id);
        return null;
    }

    @Override
    public void updateUser(User user, Long id) {
        User newUser = readUser(id);
        newUser.setName(user.getName());
        newUser.setLastName(user.getLastName());
        newUser.setAge(user.getAge());
    }

    @Override
    public void deleteUser(long id) {
        entityManager.remove(readUser(id));
    }
}
