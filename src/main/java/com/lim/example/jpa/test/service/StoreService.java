package com.lim.example.jpa.test.service;

import com.lim.example.jpa.test.entity.Store;

import java.util.Optional;

public interface StoreService {

    Optional<Store> getStoreInfo(long id);

}
