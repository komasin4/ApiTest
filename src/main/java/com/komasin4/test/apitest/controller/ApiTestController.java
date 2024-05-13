package com.komasin4.test.apitest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTestController {
    @GetMapping("/api/test")
    @ResponseBody
    public Object apiTest() {
        return "{\"result\":\"OK\"}";
    }
}
