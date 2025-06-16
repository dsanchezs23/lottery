package com.lotterygame.lottery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository<T, Type> extends JpaRepository<T, Type> {
}
