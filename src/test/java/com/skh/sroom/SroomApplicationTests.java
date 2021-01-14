package com.skh.sroom;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = { SroomApplication.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SroomApplicationTests {

    @Test
    public void emptyTest() {
        int i = 1;
        assertEquals(1, i);
    }
}
