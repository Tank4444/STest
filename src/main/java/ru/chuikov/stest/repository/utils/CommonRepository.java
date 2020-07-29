package ru.chuikov.stest.repository.utils;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.chuikov.stest.entity.utils.IdEntity;

@NoRepositoryBean
public interface CommonRepository<E extends IdEntity> extends JpaRepository<E,Long> {
}
