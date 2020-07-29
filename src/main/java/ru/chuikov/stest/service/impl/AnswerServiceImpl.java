package ru.chuikov.stest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.chuikov.stest.entity.Answer;
import ru.chuikov.stest.repository.AnswerRepository;
import ru.chuikov.stest.service.AnswerService;

import java.util.Optional;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public void add(Answer entity) {

    }

    @Override
    public void delete(Answer entity) {

    }

    @Override
    public Optional<Answer> get(Long entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Answer> edit(Answer entity) {
        return Optional.empty();
    }
}
