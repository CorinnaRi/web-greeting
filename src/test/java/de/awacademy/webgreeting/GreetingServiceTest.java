package de.awacademy.webgreeting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    public void testDeCori() {

        assertEquals("Guten Tag, Corinna! Dies ist dein 1. Gruß.", greetingService.getHello("de", "Corinna"));
    }

    @Test
    public void testDeCori2() {

        assertEquals("Guten Tag, Corinna! Dies ist dein 1. Gruß.", greetingService.getHello("de", "Corinna"));
    }



}