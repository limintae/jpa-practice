package com.lim.example.jpa.web.rest.test.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class TestControllerTest {

    @Test
    public void addition() {
        int a = 1;
        int b = 2;
        assertEquals(3, a+b);
    }

}