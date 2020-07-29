package ru.chuikov.stest.service.impl;

import ru.chuikov.stest.entity.Test;
import ru.chuikov.stest.service.TestService;

import java.util.Optional;

public class TestServiceImpl implements TestService {

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
}
