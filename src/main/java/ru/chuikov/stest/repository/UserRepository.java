package ru.chuikov.stest.repository;


import org.springframework.stereotype.Repository;
import ru.chuikov.stest.entity.Role;
import ru.chuikov.stest.entity.User;
import ru.chuikov.stest.repository.utils.CommonRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CommonRepository<User> {

    Optional<User> findByUsername(String username);
    void deleteByUsername(String username);
    //@Query("SELECT u from User u where u.role=?1")
    List<User> findByRole(Role role);
}
