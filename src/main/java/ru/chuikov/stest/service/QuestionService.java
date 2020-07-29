package ru.chuikov.stest.service;

import ru.chuikov.stest.entity.Question;

import java.util.Optional;

public interface QuestionService {
        Optional<Question> getById(Long id);
        boolean addQuestion(Question question);
        boolean deleteQuestion(Question question);
        boolean editQuestion(Question question);
    }
