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

    @Test
    @DisplayName("Returns sobrepeso if imc >= 25 && imc < 30")
    void testReturnSobrepeso() {
        double imc = 27;
        ResultMessage resultMessage = new ResultMessage();
        String message = resultMessage.returnSobrepeso(imc);
        assertThat(message, is("Sobrepeso"));
    }

    @Test
    @DisplayName("Returns obesidad leve if imc >= 30 && imc < 35")
    void testReturnObesidadLeve() {
        double imc = 34;
        ResultMessage resultMessage = new ResultMessage();
        String message = resultMessage.returnObesidadLeve(imc);
        assertThat(message, is("Obesidad leve"));
    }

    @Test
    @DisplayName("Returns obesidad moderada if imc >= 35 && imc < 40")
    void testReturnObesidadModerada() {
        double imc = 35;
        ResultMessage resultMessage = new ResultMessage();
        String message = resultMessage.returnObesidadModerada(imc);
        assertThat(message, is("Obesidad moderada"));
    }

    @Test
    @DisplayName("Returns obesidad morbida if imc >= 40")
    void testReturnObesidadMorbida() {
        double imc = 43;
        ResultMessage resultMessage = new ResultMessage();
        String message = resultMessage.returnObesidadMorbida(imc);
        assertThat(message, is("Obesidad morbida"));
    }
    
}
