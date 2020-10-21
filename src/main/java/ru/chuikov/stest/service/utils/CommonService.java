package ru.chuikov.stest.service.utils;

import ru.chuikov.stest.entity.utils.IdEntity;

import java.util.List;
import java.util.Optional;

public interface CommonService<E extends IdEntity> {
    void add(E entity);
    void delete(E entity);
    Optional<E> get(Long entity);
    Optional<E> edit(E entity);
    Optional<List<E>> getAll();
}
