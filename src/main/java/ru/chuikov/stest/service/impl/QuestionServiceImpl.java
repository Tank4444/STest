package ru.chuikov.stest.service.impl;

import org.springframework.stereotype.Service;
import ru.chuikov.stest.entity.Question;
import ru.chuikov.stest.service.QuestionService;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Override
    public void add(Question entity) {
    }

    @Override
    public void delete(Question entity) {
    }

    @Override
    public Optional<Question> get(Long entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Question> edit(Question entity) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Question>> getAll() {
        return Optional.empty();
    }
}
