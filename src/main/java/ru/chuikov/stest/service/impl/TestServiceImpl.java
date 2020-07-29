package ru.chuikov.stest.service.impl;

import ru.chuikov.stest.entity.Test;
import ru.chuikov.stest.service.TestService;

import java.util.Optional;

public class TestServiceImpl implements TestService {
    @Override
    public Optional<Test> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean addTest(Test test) {
        return false;
    }

    @Override
    public boolean deleteTest(Test test) {
        return false;
    }

    @Override
    public boolean editTest(Test test) {
        return false;
    }
}
