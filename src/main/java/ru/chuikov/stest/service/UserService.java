package ru.chuikov.stest.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.chuikov.stest.entity.User;

import java.util.Optional;

public interface UserService extends UserDetailsService {
    Optional<User> getUser(String username);
    Optional<User> getUser(Long id);
    void addUser(User user);
    void deleteUser(User user);
    void editUser(User user);
}
