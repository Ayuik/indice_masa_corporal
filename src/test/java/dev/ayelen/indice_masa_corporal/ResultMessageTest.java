package dev.ayelen.indice_masa_corporal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ResultMessageTest {

    @Test
    @DisplayName("Returns delgadez severa if imc < 16")
    void testReturnDelgadezSevera() {
        double imc = 11;
        ResultMessage resultMessage = new ResultMessage();
        String message = resultMessage.returnDelgadezSevera(imc);
        assertThat(message, is("Delgadez severa"));
    }
    
}
