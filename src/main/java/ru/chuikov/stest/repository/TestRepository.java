package ru.chuikov.stest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chuikov.stest.entity.Test;
import ru.chuikov.stest.repository.utils.CommonRepository;

@Repository
public interface TestRepository extends CommonRepository<Test> {
}
