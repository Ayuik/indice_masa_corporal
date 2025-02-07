package dev.ayelen.indice_masa_corporal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class BodyMassIndexTest {

    @Test
    @DisplayName("Should calculate BMI")
    void testCalculateBMI() {
        double wheight = 10;
        double height = 1;
        double result = new BodyMassIndex().calculateBMI(wheight, height);
        assertThat(result, is(10.0));
  }
    
}
