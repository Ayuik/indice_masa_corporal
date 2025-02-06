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

    @Test
    @DisplayName("Returns delgadez moderada if imc < 17 && imc >= 16")
    void testReturnDelgadezModerada() {
        double imc = 16.8;
        ResultMessage resultMessage = new ResultMessage();
        String message = resultMessage.returnDelgadezModerada(imc);
        assertThat(message, is("Delgadez moderada"));
    }

    @Test
    @DisplayName("Returns delgadez leve if imc >= 17 && imc < 18.5")
    void testReturnDelgadezLeve() {
        double imc = 17;
        ResultMessage resultMessage = new ResultMessage();
        String message = resultMessage.returnDelgadezLeve(imc);
        assertThat(message, is("Delgadez leve"));
    }

    @Test
    @DisplayName("Returns peso normal if imc >= 18.5 && imc < 25")
    void testReturnPesoNormal() {
        double imc = 23;
        ResultMessage resultMessage = new ResultMessage();
        String message = resultMessage.returnPesoNormal(imc);
        assertThat(message, is("Peso normal"));
    }
    
}
