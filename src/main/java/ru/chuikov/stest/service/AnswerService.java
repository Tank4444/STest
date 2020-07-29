package ru.chuikov.stest.service;

import ru.chuikov.stest.entity.Answer;

import java.util.Optional;

public interface AnswerService {
    Optional<Answer> getById(Long id);
    boolean addAnswer(Answer answer);
    boolean deleteAnswer(Answer answer);
    boolean editAnswer(Answer answer);
}
