package ru.chuikov.stest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.chuikov.stest.entity.Test;
import ru.chuikov.stest.repository.TestRepository;
import ru.chuikov.stest.service.TestService;

import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public void add(Test entity) {
    }

    @Override
    public void delete(Test entity) {
    }

    @Override
    public Optional<Test> get(Long entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Test> edit(Test entity) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Test>> getAll() {
        List<Test> tests=testRepository.findAll();
        if(tests.isEmpty())return Optional.empty();
        else return Optional.of(tests);
    }
}
