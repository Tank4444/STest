package ru.chuikov.stest.service.impl;

import org.springframework.stereotype.Service;
import ru.chuikov.stest.entity.Testing;
import ru.chuikov.stest.service.TestingService;

import java.util.List;
import java.util.Optional;

@Service
public class TestingServiceImpl implements TestingService {

    @Override
    public void add(Testing entity) {
    }

    @Override
    public void delete(Testing entity) {
    }

    @Override
    public Optional<Testing> get(Long entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Testing> edit(Testing entity) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Testing>> getAll() {
        return Optional.empty();
    }
}
