package com.lim.example.jpa.web.rest.test.dao;

import com.lim.example.jpa.web.rest.test.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}


