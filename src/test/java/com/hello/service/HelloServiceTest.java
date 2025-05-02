package com.hello.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloServiceTest {

    private final HelloService helloService;

    public HelloServiceTest() {
        this.helloService = new HelloService();
    }

    @Test
    public void testGetMessage() {
        String result = helloService.getMessage();
        assertEquals("Bye, Spring Boot!", result);
    }
}
