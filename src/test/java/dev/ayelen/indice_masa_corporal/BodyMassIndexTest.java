package dev.ayelen.indice_masa_corporal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class BodyMassIndexTest {

    @Test
    @DisplayName("Should calculate BMI")
    void testCalculateBMI() {
        //given
        double wheight = 53;
        double height = 1.67;
        //when
        double result = new BodyMassIndex().calculateBMI(wheight, height);
        //then
        assertThat(result, is(19.0));
  }
    
}
