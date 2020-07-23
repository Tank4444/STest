package ru.chuikov.stest.service;

import ru.chuikov.stest.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getUser(String username);
    Optional<User> getUser(Long id);
}
