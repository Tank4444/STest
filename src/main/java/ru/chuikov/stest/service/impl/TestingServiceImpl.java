package ru.chuikov.stest.service.impl;

import ru.chuikov.stest.entity.Testing;
import ru.chuikov.stest.service.TestingService;

import java.util.Optional;

public class TestingServiceImpl implements TestingService {
    @Override
    public Optional<Testing> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean addTesting(Testing testing) {
        return false;
    }

    @Override
    public boolean deleteTesting(Testing testing) {
        return false;
    }

    @Override
    public boolean editTesting(Testing testing) {
        return false;
    }
}
