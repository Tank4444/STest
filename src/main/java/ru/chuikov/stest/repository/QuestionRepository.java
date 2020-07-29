package ru.chuikov.stest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chuikov.stest.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {
}
