package dev.ayelen.indice_masa_corporal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    @DisplayName("Should get height")
    void testGetHeight() {
        Person person = new Person(0, 1.67);
        double result = person.getHeight();
        assertEquals(1.67, result);
    }

    @Test
    @DisplayName("Should get wheight")
    void testGetWheight() {
        Person person = new Person(53, 0);
        double result = person.getWheight();
        assertEquals(53, result);
    }

    @Test
    @DisplayName("Should set wheight")
    void testSetWheight() {
        Person person = new Person(0, 0);
        double result = person.setWheight(double 53);
        assertEquals(53, result);
    }
}

