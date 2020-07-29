package ru.chuikov.stest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chuikov.stest.entity.Testing;

@Repository
public interface TestingRepository extends JpaRepository<Testing,Long> {
}
