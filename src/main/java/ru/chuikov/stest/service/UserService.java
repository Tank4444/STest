package ru.chuikov.stest.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.chuikov.stest.entity.User;
import ru.chuikov.stest.service.utils.CommonService;

import java.util.Optional;

public interface UserService extends UserDetailsService, CommonService<User> {
    Optional<User> getUser(String username);
    Optional<User> getUser(Long id);
}
