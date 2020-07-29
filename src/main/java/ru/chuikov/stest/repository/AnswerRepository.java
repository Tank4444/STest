package ru.chuikov.stest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chuikov.stest.entity.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer,Long> {
}
