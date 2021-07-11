package com.lim.example.jpa.web.rest.test.service;

import com.lim.example.jpa.web.rest.test.entity.Store;

import java.util.Optional;

public interface StoreService {

    Optional<Store> getStoreInfo(long id);

}
