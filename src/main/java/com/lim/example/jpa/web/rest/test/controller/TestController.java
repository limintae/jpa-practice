package com.lim.example.jpa.web.rest.test.controller;

import com.lim.example.jpa.web.rest.test.entity.Store;
import com.lim.example.jpa.web.rest.test.service.StoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final StoreService storeService;

    @GetMapping(value = "/hello")
    public String getHello() {
        log.info("hello");
        return "hello";
    }

    @GetMapping(value = "/store/{id}")
    public Optional<Store> getStoreInfo(@PathVariable long id) {
        Optional<Store> a = storeService.getStoreInfo(id);
        return a;
    }

}
