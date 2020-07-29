package ru.chuikov.stest.service;

import ru.chuikov.stest.entity.Testing;

import java.util.Optional;

public interface TestingService {
    Optional<Testing> getById(Long id);
    boolean addTesting(Testing testing);
    boolean deleteTesting(Testing testing);
    boolean editTesting(Testing testing);
}
