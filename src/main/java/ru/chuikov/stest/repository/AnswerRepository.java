package ru.chuikov.stest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chuikov.stest.entity.Answer;
import ru.chuikov.stest.repository.utils.CommonRepository;

@Repository
public interface AnswerRepository extends CommonRepository<Answer> {
}
