package dev.ayelen.indice_masa_corporal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    @DisplayName("Should get height")
    void testGetHeight() {
        assertEquals(1.67, person.getHeight());
    }
}

