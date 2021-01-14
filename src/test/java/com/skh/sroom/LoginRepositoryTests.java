package com.skh.sroom;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.skh.sroom.repository.LoginRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = { SroomApplication.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LoginRepositoryTests {

    @Autowired
    LoginRepository loginRepository;

    @Test
    public void findAll() {
        assertNotNull(loginRepository.findAll());
    }
}