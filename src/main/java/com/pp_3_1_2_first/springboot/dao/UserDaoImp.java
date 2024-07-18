package com.pp_3_1_2_first.springboot.dao;

import com.pp_3_1_2_first.springboot.model.User;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager em;


    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public void updateUser(User user) {
        User savedUser = em.find(User.class, user.getId());
        if (savedUser != null) {
            savedUser.setName(user.getName());
            savedUser.setLastName(user.getLastName());
            savedUser.setAge(user.getAge());
            em.merge(savedUser);
        }
    }

    @Override
    public void deleteUser(Long userId) {
        User user = em.find(User.class, userId);
        if (user != null) {
            em.remove(user);
        }
    }

    @Override
    public List<User> getAllUsers() {
        return em.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public User getUserById(Long id) {
        return em.find(User.class, id);
    }
}
