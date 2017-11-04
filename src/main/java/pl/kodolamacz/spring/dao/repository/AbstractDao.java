package pl.kodolamacz.spring.dao.repository;

import pl.kodolamacz.spring.dao.model.AbstractEntity;

/**
 * Created by acacko on 29.10.17
 */
public interface AbstractDao<T extends AbstractEntity> {

    T findById(Long id);

    void save(T entity);

}
