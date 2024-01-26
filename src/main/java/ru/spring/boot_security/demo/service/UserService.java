package ru.spring.boot_security.demo.service;

import ru.spring.boot_security.demo.model.Role;
import ru.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {

    void saveNewUser(User user, Set<Role> roles);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUser(User userUpdate, Set<Role> roles);

    void deleteUser(long id);

    User getUserByName(String name);
}
