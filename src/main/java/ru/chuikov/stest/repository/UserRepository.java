package ru.chuikov.stest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chuikov.stest.entity.User;
import ru.chuikov.stest.repository.utils.CommonRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CommonRepository<User> {

    Optional<User> findByUsername(String username);
    void deleteByUsername(String username);

    Optional<List<User>> findAllByRole(String role);
}
