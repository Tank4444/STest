package ru.chuikov.stest.service;

import ru.chuikov.stest.entity.Test;

import java.util.Optional;

public interface TestService {
    Optional<Test> getById(Long id);
    boolean addTest(Test test);
    boolean deleteTest(Test test);
    boolean editTest(Test test);
}
