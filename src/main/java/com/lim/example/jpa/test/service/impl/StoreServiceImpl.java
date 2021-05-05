package com.lim.example.jpa.test.service.impl;

import com.lim.example.jpa.test.dao.StoreRepository;
import com.lim.example.jpa.test.entity.Store;
import com.lim.example.jpa.test.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("StoreService")
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;

    public Optional<Store> getStoreInfo(long id) {
        return storeRepository.findById(id);
    }

}
