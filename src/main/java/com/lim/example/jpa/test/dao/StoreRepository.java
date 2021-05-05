package com.lim.example.jpa.test.dao;

import com.lim.example.jpa.test.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}


