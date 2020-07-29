package ru.chuikov.stest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chuikov.stest.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test,Long> {
}
