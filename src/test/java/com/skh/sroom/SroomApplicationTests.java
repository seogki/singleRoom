package com.skh.sroom;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SroomApplicationTests {

    @Test
    public void emptyTest() {
        int i = 1;
        assertEquals(1, i);
    }
}
