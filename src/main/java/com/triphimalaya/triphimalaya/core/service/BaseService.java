package com.triphimalaya.triphimalaya.core.service;

import java.util.List;

public interface BaseService<T> {
    T save(T t);
    T getById(long id);
    List<T> findAll();
    T delete(T t);

}
