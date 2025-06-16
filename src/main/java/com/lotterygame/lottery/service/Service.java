package com.lotterygame.lottery.service;

import java.util.List;

public interface Service<T, Type> {
    T createEntity(T t);
    T getEntityById(Type id);
    List<T> getAllEntities();
    void deleteEntity(Type id);
    T updateEntity(Type id, T t);
}
