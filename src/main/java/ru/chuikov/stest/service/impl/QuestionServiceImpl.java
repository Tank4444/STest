package ru.chuikov.stest.service.impl;

import ru.chuikov.stest.entity.Question;
import ru.chuikov.stest.service.QuestionService;

import java.util.Optional;

public class QuestionServiceImpl implements QuestionService {
    @Override
    public Optional<Question> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean addQuestion(Question question) {
        return false;
    }

    @Override
    public boolean deleteQuestion(Question question) {
        return false;
    }

    @Override
    public boolean editQuestion(Question question) {
        return false;
    }
}
