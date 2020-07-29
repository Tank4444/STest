package ru.chuikov.stest.service.impl;

import ru.chuikov.stest.entity.Answer;
import ru.chuikov.stest.service.AnswerService;

import java.util.Optional;

public class AnswerServiceImpl implements AnswerService {
    @Override
    public Optional<Answer> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean addAnswer(Answer answer) {
        return false;
    }

    @Override
    public boolean deleteAnswer(Answer answer) {
        return false;
    }

    @Override
    public boolean editAnswer(Answer answer) {
        return false;
    }
}
